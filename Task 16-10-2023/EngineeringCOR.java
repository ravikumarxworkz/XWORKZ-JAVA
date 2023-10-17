package com.driver;

import com.things.EngineeringCO;

public class EngineeringCOR {

	public static void main(String[] args) {
		EngineeringCO e=new EngineeringCO();
		System.out.println("branch name are");
		e.insertData("MECHANICAL");
		e.insertData("COMPUTER SCIENCE");
		e.insertData("ELETRONICS COMMUNICATION");
		e.insertData("CVIL");
		e.displayData();
		System.out.println("after update old branch name to new branch name ");
		e.updateData("CVIL", "BIOTECH");
		e.displayData();
		 System.out.println("delete one branch in branch name list");
		e.deleteData("ELETRONICS COMMUNICATION");
		e.displayData();
	}

}
