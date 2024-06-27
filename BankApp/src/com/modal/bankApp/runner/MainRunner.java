package com.modal.bankApp.runner;

import com.modal.bankApp.dto.CreateBankAccount;
import com.modal.bankApp.dto.Transaction;
import com.modal.bankApp.exception.EmailAlreadyExistsException;
import com.modal.bankApp.exception.InsuffiucentBalnce;
import com.modal.bankApp.exception.InvalidInputException;
import com.modal.bankApp.service.BankAppService;
import com.modal.bankApp.service.BankAppServiceImpl;
import com.modal.bankApp.service.EmiTranstion;

import java.util.List;
import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {

		BankAppService bankAppService = new BankAppServiceImpl();
		Scanner scanner = new Scanner(System.in);
		CreateBankAccount loggedInAccount = null;

		while (true) {
			if (loggedInAccount == null) {
				System.out.println("1. Create Bank Account");
				System.out.println("2. Login");
				System.out.print("Choose an option: ");
				int option = scanner.nextInt();

				switch (option) {
				case 1:
					CreateBankAccount account = new CreateBankAccount();
					System.out.print("Enter first name: ");
					account.setFirstName(scanner.next());
					System.out.print("Enter last name: ");
					account.setLastName(scanner.next());
					System.out.print("Enter email: ");
					account.setEmail(scanner.next());
					System.out.print("Enter phone number: ");
					account.setPhoneNumber(scanner.nextLong());
					System.out.print("Enter password: ");
					account.setPassword(scanner.next());
					account.setBalance(0.0);
					try {
						bankAppService.createAndSaveBankAccount(account);
						System.out.println("Account created successfully!");
					} catch (EmailAlreadyExistsException | InvalidInputException e) {
						System.out.println(e.getMessage());
					}
					break;

				case 2:
					System.out.print("Enter email: ");
					String email = scanner.next();
					System.out.print("Enter password: ");
					String password = scanner.next();
					loggedInAccount = bankAppService.login(email, password);
					if (loggedInAccount != null) {
						System.out.println("Welcome to Pentagon Space Bank, " + loggedInAccount.getFirstName() + "!");
					} else {
						System.out.println("Invalid email or password.");
					}
					break;

				default:
					System.out.println("Invalid option. Please try again.");
					break;
				}
			} else {
				System.out.println("4. View User Details");
				System.out.println("5. Balance Check");
				System.out.println("6. Deposit Amount");
				System.out.println("7. WithDrawal Amount");
				System.out.println("8. EMI Process");
				System.out.println("9. Send Amount to Another User");
				System.out.println("10. Display All Transactions");
				System.out.println("11. Logout");
				System.out.print("Choose an option: ");
				int option = scanner.nextInt();

				switch (option) {
				case 4:
					System.out.println("User Details:");
					System.out.println("Name: " + loggedInAccount.getFirstName() + " " + loggedInAccount.getLastName());
					System.out.println("Email: " + loggedInAccount.getEmail());
					System.out.println("Phone: " + loggedInAccount.getPhoneNumber());
					System.out.println("Bank Account: " + loggedInAccount.getBankAccount());
					break;

				case 5:
					System.out.println("Current Balance: " + loggedInAccount.getBalance());
					break;

				case 6:
					System.out.print("Enter amount to deposit: ");
					double depositAmount = scanner.nextDouble();
					bankAppService.depositAmount(loggedInAccount, depositAmount);
					System.out.println("Amount deposited successfully! New balance: " + loggedInAccount.getBalance());
					break;

				case 7:
					System.out.print("Enter amount to withdrawal: ");
					double withdrawalAmount = scanner.nextDouble();
					try {
						bankAppService.withdrawalAmount(loggedInAccount, withdrawalAmount);
						System.out.println(
								"Amount withdrawal successfully! New balance: " + loggedInAccount.getBalance());
					} catch (InsuffiucentBalnce e) {
						e.printStackTrace();
					}
					break;

				case 8:
					EmiTranstion emiTranstion = new EmiTranstion();
					emiTranstion.emiProcess(loggedInAccount);
					break;

				case 9:
					System.out.print("Enter recipient's email: ");
					String recipientEmail = scanner.next();
					System.out.print("Enter amount to send: ");
					double sendAmount = scanner.nextDouble();
					if (bankAppService.sendAmount(loggedInAccount, recipientEmail, sendAmount)) {
						System.out.println("Amount sent successfully! New balance: " + loggedInAccount.getBalance());
					} else {
						System.out.println("Transaction failed. Please check recipient's email and your balance.");
					}
					break;

				case 10:
					System.out.println("Transaction History:");
					List<Transaction> transactions = bankAppService.getTransactions(loggedInAccount);

					// Print table header
					System.out.printf("%-15s %-20s %-10s %-10s %-30s\n", "Transaction ID", "Date", "Type", "Amount",
							"Details");
					System.out.println("-----------------------------------------------------------------------------");

					// Print table rows
					for (Transaction transaction : transactions) {
						System.out.printf("%-15s %-20s %-10s %-10s %-30s\n", transaction.getTransactionId(),
								transaction.getDate(), transaction.getType(), transaction.getAmount(),
								transaction.getDetails());
					}
					break;

				case 11:
					loggedInAccount = null;
					System.out.println("Logged out successfully.");
					break;

				default:
					System.out.println("Invalid option. Please try again.");
					break;
				}
			}
		}
	}
}
