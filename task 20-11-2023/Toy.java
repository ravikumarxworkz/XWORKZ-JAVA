package com.things;

public class Toy {
	

		public String toyName;
		public int price;
		public char size;
		public boolean isTeddy;
		public int type;
		
		@Override
		public String toString() {
			System.out.println("this is String method");
			return "Toys";
		}
		
		@Override
		public int hashCode() {
			System.out.println("this is hash code method");
			return 250;
			}
		
		public boolean equals(Object that) {
			System.out.println("this is equals method");
			return false;
		}
	}

