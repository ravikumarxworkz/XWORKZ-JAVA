package com.numbers;

public class PrimeNumber {
		public static void main(String... args){
		     primeNumber(0,20);
			 checkPrimeNumber(11);
		}
		static void primeNumber(int m1,int m2){// 2 3 5 7
			System.out.println("prime number between "+m1+" to "+m2);
			 for(int i=m1; i<=m2; i++){
				 int countP=0;
				 for(int j=1; j<=i; j++){
			        if(i%j==0){
					   countP++;
				     }
				     }
				     if(countP==2){  
					 System.out.println(i);	
				     }
			      }
			 System.out.println("------------------");
		 } 
			static void checkPrimeNumber(int x){	
			 int count=0;
			for(int i=1; i<=x; i++)
			     {	 
				     if(x%i==0)
				     { 
					 count++;
				     }
				 }
				  System.out.println("enter the number is ="+x);
					 if(count==2){
						 System.out.println(x+ " is primeNumber");
					 }
					 else  {
						 System.out.println(x+" is not prime number");
			             }
					 System.out.println("------------------");
		         }


}


