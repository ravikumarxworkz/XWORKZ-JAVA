package com.numbers;
import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int largest,small;
		System.out.println("enter number 1st");
		int a =sc.nextInt();
		System.out.println("enter number 2nt");
		int b =sc.nextInt();
		System.out.println("enter number 3rd");
		int c =sc.nextInt();
		// Using Ternary Operator
  largest=c>(a>b?a:b)?c:(a>b?a:b); 
  System.out.println("largest number is="+largest);
  small=c<(a<b?a:b)?c:(a<b?a:b);
  System.out.println("smallest number is="+small);
  sc.close();
	}
}
