package com.modal.bankApp.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
	private String transactionId;
	private Date date;
	private String type;
	private double amount;
	private String details;
	private long bankAccount;
}
