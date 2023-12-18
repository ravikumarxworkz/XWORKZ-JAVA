package com.numbers;

public class Swapnumber {
	
	static void swap(int a , int b){
		int temp;
		System.out.println("before swap "+a+" & "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("before swap "+a+" & "+b);
	}
	public static void main(String[] args) {
		swap(10, 20);
		int a=20;
		int b=30;
		System.out.println("before swap "+a+" & "+b);
		a+=b;
		b=a-b;
		a=a-b;
		System.out.println("before swap "+a+" & "+b);
	}

}
