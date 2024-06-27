package com.modal.bankApp.service;

import com.modal.bankApp.dto.CreateBankAccount;
import com.modal.bankApp.dto.Transaction;
import com.modal.bankApp.exception.EmailAlreadyExistsException;
import com.modal.bankApp.exception.InsuffiucentBalnce;
import com.modal.bankApp.exception.InvalidInputException;
import com.modal.bankApp.repository.BankAppRepo;
import com.modal.bankApp.repository.BankAppRepoImpl;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class BankAppServiceImpl implements BankAppService {
	private BankAppRepo bankAppRepo = new BankAppRepoImpl();
	private Set<Long> existingAccountNumbers = new HashSet<>();
	private static int transactionCounter = 0;

	@Override
	public  void createAndSaveBankAccount(CreateBankAccount account) {
		validateAndSaveBankAccount(account);
	}

	@Override
	public CreateBankAccount login(String email, String password) {
		CreateBankAccount account = bankAppRepo.getUserByEmail(email);
		if (account != null && account.getPassword().equals(password)) {
			return account;
		}
		return null;
	}

	@Override
	public void validateAndSaveBankAccount(CreateBankAccount account) {
		validateEmail(account.getEmail());
		validatePhoneNumber(account.getPhoneNumber());
		validatePassword(account.getPassword());
		account.setBankAccount(generateUniqueBankAccountNumber());
		if (!bankAppRepo.createAndSaveBankAccount(account)) {
			throw new EmailAlreadyExistsException("Email already exists");
		}
	}

	@Override
	public void validateEmail(String email) {
		if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
			throw new InvalidInputException("Invalid email format");
		}
		if (bankAppRepo.getUserByEmail(email) != null) {
			throw new EmailAlreadyExistsException("Email already exists");
		}
	}

	@Override
	public void validatePhoneNumber(long phoneNumber) {
		String phoneNumberStr = String.valueOf(phoneNumber);
		if (!phoneNumberStr.matches("^[0-9]{10}$")) {
			throw new InvalidInputException("Invalid phone number format");
		}
	}

	@Override
	public void validatePassword(String password) {
		if (password.length() < 8 || !password.matches(".*[A-Z].*") || !password.matches(".*[a-z].*")
				|| !password.matches(".*[0-9].*") || !password.matches(".*[!@#$%^&*].*")) {
			throw new InvalidInputException(
					"Password must be at least 8 characters long, contain uppercase, lowercase, number, and special character");
		}
	}

	@Override
	public long generateUniqueBankAccountNumber() {
		Random random = new Random();
		long accountNumber;
		do {
			accountNumber = 100000000000L + (long) (random.nextDouble() * 900000000000L);
		} while (existingAccountNumbers.contains(accountNumber));
		existingAccountNumbers.add(accountNumber);
		return accountNumber;
	}
	

	@Override
	public List<CreateBankAccount> readAll() {
		return bankAppRepo.readAll();
	}

	@Override
	public CreateBankAccount getUserByEmail(String email) {
		return bankAppRepo.getUserByEmail(email);
	}
	   @Override
	    public synchronized void depositAmount(CreateBankAccount account, double amount) {
	        if (bankAppRepo.depositAmount(account, amount)) {
	            System.out.println("Successfully deposited: " + amount);
	            System.out.println("Available balance: " + account.getBalance());
	            logTransaction(account, "Deposit", amount, "Deposited to account", account.getBankAccount());
	            notify(); // Notify waiting threads after deposit
	        }
	    }

	    @Override
	    public synchronized void withdrawalAmount(CreateBankAccount account, double amount) throws InsuffiucentBalnce {
	        while (account.getBalance() < amount) {
	            System.out.println("Cannot process the withdrawal due to insufficient balance...");
	            try {
	                wait(); // Wait until there is a sufficient balance
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        if (bankAppRepo.withdrawalAmount(account, amount)) {
	            System.out.println("Withdrawal succeeded. Processed " + amount + " from your account.");
	            System.out.println("Available balance: " + account.getBalance());
	            logTransaction(account, "Debit", amount, "withdrawal", account.getBankAccount());
	        } else {
	            throw new InsuffiucentBalnce("Withdrawal amount greater than your current balance: " + account.getBalance());
	        }
	    }

	/*
	 * @Override public synchronized void depositAmount(CreateBankAccount account,
	 * double amount) { if (bankAppRepo.depositAmount(account, amount)) {
	 * logTransaction(account, "Deposit", amount, "Deposited to account",
	 * account.getBankAccount()); } }
	 * 
	 * @Override public synchronized void withdrawalAmount(CreateBankAccount
	 * account, double amount) throws InsuffiucentBalnce { if
	 * (bankAppRepo.withdrawalAmount(account, amount)) { logTransaction(account,
	 * "Debit", amount, "withdrawal", account.getBankAccount()); } else { throw new
	 * InsuffiucentBalnce("withdrwal anmount greater than your  current balance"
	 * +account.getBalance());
	 * 
	 * } }
	 */

	@Override
	public boolean sendAmount(CreateBankAccount fromAccount, String toEmail, double amount) {
		CreateBankAccount toAccount = bankAppRepo.getUserByEmail(toEmail);
		if (toAccount != null && fromAccount.getBalance() >= amount) {
			fromAccount.setBalance(fromAccount.getBalance() - amount);
			logTransaction(fromAccount, "Transfer", amount, "Sent to " + toEmail, fromAccount.getBankAccount());

			toAccount.setBalance(toAccount.getBalance() + amount);
			logTransaction(toAccount, "Transfer", amount, "Received from " + fromAccount.getEmail(),
					toAccount.getBankAccount());

			return true;
		}
		return false;
	}

	@Override
	public List<Transaction> getTransactions(CreateBankAccount account) {
		return bankAppRepo.getTransactions(account);
	}

	private void logTransaction(CreateBankAccount account, String type, double amount, String details,
			long bankAccount) {
		transactionCounter++;
		String transactionId = "txn" + String.format("%03d", transactionCounter);
		Transaction transaction = new Transaction(transactionId, new Date(), type, amount, details, bankAccount);
		bankAppRepo.saveTransaction(transaction);
	}

}
