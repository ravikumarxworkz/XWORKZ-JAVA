package com.things;

public class ContactNumArray {

	int index = 0;
	byte b = 5;
	int[] contactNum = new int[b];

	public void insertContactNumbers(int contactNumbers) {
		if (index < contactNum.length) {
			contactNum[index] = contactNumbers;
			index++;
		} else {
			System.out.println("contact numbers is full");
		}
	}

	public void displayContactNumbers() {
		for (int i = 0; i < contactNum.length; i++) {
			System.out.println("contact numbers=" + contactNum[i]);
		}

	}
}
