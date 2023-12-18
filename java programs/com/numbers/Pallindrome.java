package com.numbers;


public class Pallindrome {
	static void pallindrome(int n){
		int rev=0;
		int temp=n; 
		while(n>0) { 
		rev=rev*10+n%10; 
		n/=10; 
		}
		if(temp==rev) {
			System.out.println("number is pallindrome");
		}
		else {
			System.out.println("number is not pallindrome");
		}
		System.out.println("revse number"+rev);
		 System.out.println("------------------");
	}
 public static void main(String[] args) {
	pallindrome(121);
}
}
