package com.things;

public class Shoes {
	
		
		private String brand="crocks";
		private int price=3000;
		private char size='m';
		
		@Override
		public String toString() {
			System.out.println("this is to string method");
			//return null;
			return "Shoes:{brand:"+brand+" "+"+price:"+price+" "+"size:"+size+"}";
		}
		
		@Override
		public int hashCode() {
			System.out.println("this is hash code method");
			return 10;
		}
		
		@Override
		public boolean equals(Object obj) {
			System.out.println("this is equals method");
			return true;
		
		
			
			
		}

}
