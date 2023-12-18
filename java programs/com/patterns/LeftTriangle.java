package com.patterns;

public class LeftTriangle {
	public static void main(String[] args) {
		pattern1(5);
	}
	static void pattern1(int n) {
		for(int i=1; i<=n; i++) {
			
			for(int j=i; j<=n; j++){//decrement
			System.out.print("*");
			}
		System.out.println("");
		}
	}
}
