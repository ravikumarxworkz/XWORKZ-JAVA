package com.numbers;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		int[] number = { 1, 8, 7, 9, 5, 6, 1, 8, 6, 3, 3, 1, 5, 4 };
		System.out.println("enter input number");
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < 4; j++) {
			int input = sc.nextInt();
			int frequency = 0;
			for (int i : number) {
				if (i == input) {
					frequency++;
				}
			}
			System.out.println("output=" + frequency);
		}
		sc.close();
	}

}
