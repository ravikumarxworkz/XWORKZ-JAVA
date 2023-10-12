package com.driver;

import com.things.Sanpchat;

public class SanpchatRunner {

	public static void main(String[] args) {
		Sanpchat sanp = new Sanpchat("ravi", "raj", 8123179157l, "rk@gmail.com", 100, 1500);
		System.out.println("username="+sanp.userName+"\n"+"password="+sanp.password+"\n"+"phonenumber="+sanp.contactNumber+"\n"+"EMAIL="+sanp.email+"\n"+"strike="+sanp.strike+"\n"+"followers="+sanp.followers);
		sanp.userName();
		sanp.password();
		System.out.println("------------------");
		sanp.contactNumber(81231791);
		System.out.println("------------------");
		sanp.email("rk@gmail.com");
		System.out.println("------------------");
		sanp.followers(1500);
		System.out.println("------------------");
		sanp.Strike(150);
		sanp.message();
		sanp.chatperson();

	}

}
