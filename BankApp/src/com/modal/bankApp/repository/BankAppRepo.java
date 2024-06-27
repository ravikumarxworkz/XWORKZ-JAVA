package com.modal.bankApp.repository;

import com.modal.bankApp.dto.CreateBankAccount;
import com.modal.bankApp.dto.Transaction;

import java.util.List;

public interface BankAppRepo {
	boolean createAndSaveBankAccount(CreateBankAccount bankAccount);

	List<CreateBankAccount> readAll();
	
	CreateBankAccount getUserByEmail(String email);

	boolean depositAmount(CreateBankAccount account, double amount);
	
	boolean withdrawalAmount(CreateBankAccount account, double amount);

	boolean saveTransaction(Transaction transaction);

	List<Transaction> getTransactions(CreateBankAccount account);
}
