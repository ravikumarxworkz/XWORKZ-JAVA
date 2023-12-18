package com.numbers;

public class FibonacciSeries {
static void fibonacciSeries(int n){ // fibonacciSeries=0,1,1,2,3,5,8,13,21,34
	int n1=0,n2=1,n3=0;
System.out.println(n1+"\n"+n2);
for(int i=2; i<n; i++)
    {
	n3=n1+n2;
	n1=n2;
	n2=n3;
	System.out.println(n3);
    }
System.out.println("------------------");
     }
public static void main(String... agrs) {
	  fibonacciSeries(10);
}
}