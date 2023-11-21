package com.things;

public class Remote {

		
		public String model="aaa";
		public int price=250;
		public String companyName="www";
		public boolean isGood=true;
		public char size='s';
		public String type="atomatic";
		
		@Override
		public String toString() {
			System.out.println("this is to string menthod");
			//return null;
		     return "Remote:{model:"+model+" "+"price:"+price+" "+"companyName:"+companyName+" "+"isGood:"+isGood+" "+"size:"+size+" "+"type:"+type+"}";
		     
		}

		@Override
		public int hashCode() {
			System.out.println("this is hash code method");
			//return 250;
			int  number=(500%2)+2*6*4-1;
			return number;
		}
		
		@Override
		public boolean equals(Object obj) {
			System.out.println("this is equals method");
			//return false;
		if(this==obj)
			return true;
		if(obj==null)
			return true;
		//if(obj!=null)
			//return true;
		//return false;
		Remote r=(Remote)obj;
		if(r instanceof Remote)
			return true;
		if(this.model.equals(r.model)&& this.price==(r.price))
			return true;
		return false;
		
		
	}}

