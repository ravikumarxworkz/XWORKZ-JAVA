package com.patterns;

public class Patterns {

	public static void main(String[] args) {
		squarepattern(5);
		rTriangle(5);
		ltriangle(5);
		magicNumbers(3, 0);
	}

static void squarepattern(int n) {
	
	for(int i=1; i<=n; i++) 
	{
		for(int j=1; j<=n; j++)
		{//decrement
		System.out.print("*");
		}
		System.out.println("");
	}
 }
 static void rTriangle(int n) {
	 for(int i=1; i<=n; i++) 
		{
		for(int j=1; j<=i; j++) { //increment
			System.out.print("*");
		}
	  System.out.println("");
	}
   }
	static void ltriangle(int n) {
		for(int i=1; i<=n; i++) {
			
			for(int j=i; j<=n; j++){//decrement
			System.out.print(" ");
			}
		for(int j=1; j<=i; j++) { //increment
			System.out.print("*");
		}
		System.out.println("");
		}
	}
	static void magicNumbers(int n,int min) {
		for(int i=1; i<=n; i++) {
			//upper left loop
			for(int j=1; j<=n; j++){//decrement
			  min=i<j? i:j;
				System.out.print(n-min+1+"");
			}
			// upper right loop
			for(int j=n-1; j>=1; j--) { //increment
				
				min=i<j? i:j;
				System.out.print(n-min+1+"");
			}
			System.out.println("");
		}
		//lower loop left loop
	    for(int i=n-1; i>=1; i--) 
	    {
	    	for(int j=1; j<=n; j++) {
				  min=i<j? i:j;
				System.out.print(n-min+1+"");
	   }
	    	//lower right loop
	    	for(int j=n-1; j>=1; j--) {
	    		min=i<j?i:j;
	    		System.out.print(n-min+1+"");
	    	}
	    	System.out.println("");
	    }

	}

}


