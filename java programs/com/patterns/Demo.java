package com.patterns;

public class Demo {

	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) { // increment
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) { // decrement
				System.out.print("*");
			}

			for (int j = i; j <n; j++) { // decrement
				System.out.print("*");
			}
			for (int j = 1; j <=i; j++) { // increment
				System.out.print(" ");
			}

			System.out.println("");
		}
	}
}
