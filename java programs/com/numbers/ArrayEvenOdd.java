package com.numbers;

public class ArrayEvenOdd {

	
	public static void main(String[] args) {
		int[] num={1,2,3,4,5,6,7,8,9,10};
		int evencount = 0,oddcount=0,sum=0;
		for(int k:num) {
			sum=sum+k;
		}
		System.out.println("total sum of array="+sum);
		for(int i=1; i<=num.length; i++) {
			if(i%2==0) {
				evencount++;
				System.out.println("even numbers are="+i);
			}
		}
		System.out.println("evencount="+evencount);
			for(int j=0; j<num.length; j++) {
			if(j%2==1) {
				oddcount++;
				System.out.println("odd numbers are="+j);
			}
		}
			System.out.println("oddcount="+oddcount);
	}
	}

