package com.modal.bankApp.service;

import com.modal.bankApp.dto.CreateBankAccount;
import com.modal.bankApp.dto.Transaction;
import com.modal.bankApp.exception.InsuffiucentBalnce;

import java.util.List;

public interface BankAppService {
    void createAndSaveBankAccount(CreateBankAccount account);
    CreateBankAccount login(String email, String password);
    List<CreateBankAccount> readAll();
    CreateBankAccount getUserByEmail(String email);
    void depositAmount(CreateBankAccount account, double amount);
    void withdrawalAmount(CreateBankAccount account, double amount) throws InsuffiucentBalnce;
    boolean sendAmount(CreateBankAccount fromAccount, String toEmail, double amount);
    List<Transaction> getTransactions(CreateBankAccount account);
    void validateAndSaveBankAccount(CreateBankAccount account);
    void validateEmail(String email);
    void validatePhoneNumber(long phoneNumber);
    void validatePassword(String password);
    long generateUniqueBankAccountNumber();
}
