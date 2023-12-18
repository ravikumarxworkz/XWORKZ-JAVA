package com.numbers;

import java.util.Scanner;

public class Factorial {

	  public static int FirstFactorial(int num) { 
		    int res = 1;
		    for(int i = 1; i <= num; i++)
		    {
		        res = res * i;
		    }
		       
		    return res;
		    
		  } 
		  
		  public static void main (String[] args) {  
		    // keep this function call here 
			  System.out.println("enter");
		    Scanner s = new Scanner(System.in);
		    System.out.print(Factorial.FirstFactorial(s.nextInt())); 
		  }

}
