package com.driver;

import com.things.Shoes;

public class ShoesRunner {
	public static void main(String[] args) {
		Shoes shoes=new Shoes();
		//Shoes shoes1=new Shoes();
		
		System.out.println("get class method is:"+shoes.getClass());
		System.out.println("get String method is:"+shoes.toString());
		System.out.println("hashcode method is:"+shoes.hashCode());
		System.out.println(shoes.equals(shoes));
		//System.out.println(shoes.equals(shoes1));
	}
}
