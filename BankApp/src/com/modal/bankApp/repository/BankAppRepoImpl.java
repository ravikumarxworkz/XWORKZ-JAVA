package com.modal.bankApp.repository;

import com.modal.bankApp.dto.CreateBankAccount;
import com.modal.bankApp.dto.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankAppRepoImpl implements BankAppRepo {

	private List<CreateBankAccount> bankAccounts = new ArrayList<>();
	private Map<Long, List<Transaction>> transactions = new HashMap<>();

	@Override
	public boolean createAndSaveBankAccount(CreateBankAccount bankAccount) {
		if (bankAccount != null) {
			for (CreateBankAccount createBankAccount : bankAccounts) {
				if (createBankAccount.getEmail().equals(bankAccount.getEmail())) {
					System.out.println("Email is already present");
					return false;
				}
			}
			bankAccounts.add(bankAccount);
			transactions.put(bankAccount.getBankAccount(), new ArrayList<>());
			return true;
		}
		return false;
	}

	@Override
	public List<CreateBankAccount> readAll() {
		return bankAccounts;
	}

	@Override
	public CreateBankAccount getUserByEmail(String email) {
		for (CreateBankAccount account : bankAccounts) {
			if (account.getEmail().equals(email)) {
				return account;
			}
		}
		return null;
	}

	@Override
	public boolean depositAmount(CreateBankAccount account, double amount) {
		if (account != null) {
			account.setBalance(account.getBalance() + amount);
			return true;
		}
		return false;
	}

	@Override
	public boolean withdrawalAmount(CreateBankAccount account, double amount) {
		if (account != null) {
			if (account.getBalance() >= amount) {
				account.setBalance(account.getBalance() - amount);
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean saveTransaction(Transaction transaction) {
		List<Transaction> userTransactions = transactions.get(transaction.getBankAccount());
		if (userTransactions != null) {
			userTransactions.add(transaction);
			return true;
		}
		return false;
	}

	@Override
	public List<Transaction> getTransactions(CreateBankAccount account) {
		return transactions.getOrDefault(account.getBankAccount(), new ArrayList<>());
	}

}
