package com.things;

public class Sanpchat {
	public String userName;
	public String password;
	public long contactNumber;
	public String email;
	public int strike;
	public int followers;

	public Sanpchat() {
		System.out.println("WELCOME TO SANPCHAT");
	}

	public Sanpchat(String userName, String password, long contactNumber, String email, int strike, int followers) {
		this();
		this.userName = userName;
		this.password = password;
		this.contactNumber = contactNumber;
		this.email = email;
		this.strike = strike;
		this.followers = followers;
	}

	public void userName() {
		System.out.println("enter the user name=" + this.userName);
	}

	public void password() {
		System.out.println("enter the password=" + this.password);
	}

	public void contactNumber(int contactNumber) {
		System.out.println("enter the password=" + contactNumber);
	}

	public void email(String email) {
		System.out.println("email=" + email);
	}

	public void Strike(int strike) {
		System.out.println("Strike of sanpchat=" + strike);
	}

	public void followers(int followers) {
		System.out.println("number of followers=" + followers);
	}

	public void message() {
		System.out.println("hi java ");
	}

	public void chatperson() {
		System.out.println("RAVI");
	}

}
