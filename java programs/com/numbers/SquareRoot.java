package com.numbers;
import java.util.Scanner;

public class SquareRoot {

	static void root(int n) {
		double t;	 	
	 	double temp=n/2;
	 	do{
	 		t=temp;
	 	
	 	temp=(t+(n/temp))/2;
	 	}
	 	while((t-temp)!=0);
	 	System.out.println("square root of "+n+" is"+temp);
	 	
		
	}
	public static void main(String[] args) {
		System.out.println("enter any number");
	 	Scanner scan=new Scanner(System.in);
	 	//without using math.sqrt
	 	int n=scan.nextInt();
	 	root(n);
	 	// with using math.sqrt
	 	System.out.println("enter any number");
	 	int y=scan.nextInt();
	 	double m=Math.sqrt(y);
	 	System.out.println("square root of "+y+" is"+m);
	 	scan.close();
	 	
	}
}
