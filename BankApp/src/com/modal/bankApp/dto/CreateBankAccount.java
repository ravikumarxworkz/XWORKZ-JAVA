package com.modal.bankApp.dto;

import java.util.List;

import lombok.Data;

@Data
public class CreateBankAccount {

	private String firstName;
	private String lastName;
	private Long bankAccount;
	private String email;
	private String password;
	private long phoneNumber;
	private double balance;
    private List<Transaction> transactions;

}
