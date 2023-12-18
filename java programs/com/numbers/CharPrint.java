package com.numbers;
import java.util.Scanner;

public class CharPrint {
	public static void main(String[] args) {
		char ch;
		System.out.println("enter the character");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		System.out.println(ch);
      	sc.close();
}
}
