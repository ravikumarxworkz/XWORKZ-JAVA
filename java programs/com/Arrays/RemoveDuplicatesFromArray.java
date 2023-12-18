package com.Arrays;
import java.util.Arrays;
public class RemoveDuplicatesFromArray {

	    public static void main(String[] args) {
	    	
	        int[] numbersWithDuplicates = {1, 2, 3, 2, 4, 5, 6, 4, 7, 8, 9, 1};

	        int[] uniqueNumbers = removeDuplicates(numbersWithDuplicates);

	        System.out.println("Array without duplicates: " + Arrays.toString(uniqueNumbers));
	    }

	    private static int[] removeDuplicates(int[] arr) {
	        int n = arr.length;

	  
	        Arrays.sort(arr);

	        int uniqueCount = 1;
	        for (int i = 1; i < n; i++) {
	            if (arr[i] != arr[i - 1]) {
	                uniqueCount++;
	            }
	        }

	        int[] uniqueArray = new int[uniqueCount];

	        uniqueArray[0] = arr[0];
	        int index = 1;
	        for (int i = 1; i < n; i++) {
	            if (arr[i] != arr[i - 1]) {
	                uniqueArray[index] = arr[i];
	                index++;
	            }
	        }

	        return uniqueArray;
	    }
	}

	
	

