package com.modal.bankApp.runner;

import com.modal.bankApp.dto.CreateBankAccount;
import com.modal.bankApp.service.BankAppService;
import com.modal.bankApp.service.BankAppServiceImpl;

public class Runner {

	public static void main(String[] args) {

		BankAppService bankAppService = new BankAppServiceImpl();

		CreateBankAccount account = new CreateBankAccount();

		account.setFirstName("xyz");
		account.setLastName("abcd");
		account.setBankAccount(123456789l);
		account.setEmail("ravi@gmail.com");
		account.setPhoneNumber(8123179157l);
		account.setPassword("Ravi@7862");

		CreateBankAccount account1 = new CreateBankAccount();

		account1.setFirstName("xyzsss");
		account1.setLastName("abcd");
		account1.setBankAccount(123456789l);
		account1.setEmail("Ravi@gmail.com");
		account1.setPhoneNumber(8123179157l);
		account1.setPassword("Ravi@7862");

		bankAppService.createAndSaveBankAccount(account);
		bankAppService.createAndSaveBankAccount(account1);

		System.out.println("read all");

		System.out.println("all" + bankAppService.readAll());

	}
}
