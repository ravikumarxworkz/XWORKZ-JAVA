package com.driver;

import com.things.EncapsulationCoffe;

public class EncapsulationCoffeR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] branchName = { "starbucks", "thirdwave", "mccafe" };
		String[] flovers = { "chocolaty", "fruity", "earthy" };
		int[] price = { 200, 300, 500 };
		String[] place = { "bengaluru", "pune", "mumbai" };
		int[] quantity = { 2, 3, 6 };
		EncapsulationCoffe c = new EncapsulationCoffe(branchName, flovers, price, place, quantity);
		System.out.println("====BRANCH NAMES ARE===");
		for (String i : c.getBranchName()) {
			System.out.println(i);
		}

		System.out.println("===FLOVERS LIST===");
		for (String i : c.getFlovers()) {
			System.out.println(i);
		}
		System.out.println("===PRICE OF COFFE===");
		for (int i : c.getPrice()) {
			System.out.println(i);
		}
		System.out.println("===PLACE NAME===");
		for (String p : c.getPlace()) {
			System.out.println(p);
		}
		System.out.println("===QUANTITY OF COFFE===");
		for (int i : c.getQuantity()) {
			System.out.println(i);
		}

	}

}
