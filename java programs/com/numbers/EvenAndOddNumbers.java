package com.numbers;

public class EvenAndOddNumbers {
	
		static void evenAndOddNumbers(int n1,int n2){
			System.out.println("even numbers from "+n1+" to "+n2 );
			for(int i=n1; i<n2; i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			    }
			System.out.println("odd numbers from "+n1+" to "+n2);
			for(int i=n1; i<n2; i++) {
				if(i%2!=0) {
					System.out.println(i);
				   }
			    }
		     }
		public static void main(String... args) {
			evenAndOddNumbers(0, 100);
		}
}
