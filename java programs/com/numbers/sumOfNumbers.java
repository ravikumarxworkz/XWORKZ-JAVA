package com.numbers;

public class sumOfNumbers {
	static void sumOfNumber(int y){
		int sum=0;
		for(int i=0;i<=y;i++) {
			sum+=i;
		}
		System.out.println("sum of "+y+" numbers is="+sum); 
		System.out.println("------------------");
	    }
public static void main(String[] args) {
	sumOfNumber(10);
}
}
