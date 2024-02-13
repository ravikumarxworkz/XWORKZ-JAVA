package com.xworkz.works.dto;

public class Room {

	public static Number name(int i) {

		return i;

	}

	class InnerClass {

		void name() {
			System.out.println("hello");
		}
	}

	public static void main(String[] args) {

		Room r = new Room();

		Room.InnerClass c = r.new InnerClass();

		System.out.println(name(1000000));
		
		
		c.name();
		
		
		
		
		

	}

}
