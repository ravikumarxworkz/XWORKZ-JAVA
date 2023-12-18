package com.numbers;

import java.util.Scanner;

public class PrintLetterNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the range between to numbers");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println("without using method to print 1st,2nd,3rd,4th like numbers");
		for (int i = x; i <= y; i++) {
			String ordinal = "";
			if (i >= 11 && i <= 13) {
				ordinal = "th";
			} else {
				switch (i % 10) {
				case 1:
					ordinal = "st";
					break;
				case 2:
					ordinal = "nd";
					break;
				case 3:
					ordinal = "rd";
					break;
				default:
					ordinal = "th";
					break;
				}
			}
			
			System.out.println(i + ordinal);
		}
		scanner.close();
	System.out.println("using method to print 1st,2nd,3rd,4th like numbers");    
	 for (int i = x; i <=y; i++) {
         System.out.println(getOrdinalNumber(i));
     }
	}
	    public static String getOrdinalNumber(int number) {
	        if (number >= 11 && number <= 13) {
	            return number + "th";
	        } else {
	            switch (number % 10) {
	                case 1:
	                    return number + "st";
	                case 2:
	                    return number + "nd";
	                case 3:
	                    return number + "rd";
	                default:
	                    return number + "th";
	            }
	        }
	       
	    }
	  
}
