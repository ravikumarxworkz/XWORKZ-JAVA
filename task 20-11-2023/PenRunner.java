package com.driver;

import com.things.Pen;

public class PenRunner {
public static void main(String[] args) {
		
		Pen pen=new Pen();
		Pen pen1=new Pen();
		
		System.out.println("class name is:"+pen.getClass());
		System.out.println("string name is:"+pen.toString());
		System.out.println("hash code is:"+pen.hashCode());
		System.out.println("hash code for the pen1 is:"+pen1.hashCode());
		
		//System.out.println(pen.equals(pen1));
		System.out.println(pen.equals(pen));
	}
}

