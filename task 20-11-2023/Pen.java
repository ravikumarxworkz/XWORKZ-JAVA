package com.things;

public class Pen {
		private String name="ritometer";
		private int price=10;
		private int types=3;
		private boolean isBlack=false;
		
		@Override
		public String toString() {
			System.out.println("this is string method");
			//return "Pen";
			return "Pen:{name:"+name+" "+"price:"+price+" "+"types:"+types+" "+"isBlack:"+isBlack+"}";
		}
		
		@Override
		public int hashCode() {
			System.out.println("this is hash code method");
			//return 10;
	       int number=(55%2)+3*2;
	       return number;
		}
		
		@Override
		public boolean equals(Object obj) {
			System.out.println("this is equals method");
			if(this==obj)
				return true;
			if(obj==null)
			return false;
			return true;
				
			}
		}


