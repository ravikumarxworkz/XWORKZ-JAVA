package com.patterns;
import java.util.Scanner;

public class DoubleHill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			
			for(int j=i; j<=n; j++){//decrement
			System.out.print(" ");
			}
		for(int j=1; j<=i; j++) { //increment
			System.out.print("*");
		}
		for(int j=1; j<i; j++) { //increment
			System.out.print("*");
		}
		for(int j=i; j<n; j++){//decrement
		System.out.print(" ");
		}
		for(int j=i; j<n; j++){//decrement000000000
		System.out.print(" ");
		}
		for(int j=1; j<=i; j++) { //increment
			System.out.print("*");
		}
		for(int j=1; j<i; j++) { //increment
			System.out.print("*");
		}
		System.out.println("");
		}
		sc.close();
	}
}
