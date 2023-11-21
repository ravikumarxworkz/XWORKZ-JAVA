package com.driver;

import com.things.Toy;

public class ToyRunner {
	public static void main(String[] args) {
	     Toy toys = new Toy();
	     Toy toys1=new Toy();
	     System.out.println("class name is:"+toys.getClass());
	     System.out.println("String method is:"+toys.toString());
	     System.out.println("hash code is:"+toys.hashCode());
	     
	   //  System.out.println(toys.equals(toys));
	     System.out.println(toys.equals(toys1));
		}
}

