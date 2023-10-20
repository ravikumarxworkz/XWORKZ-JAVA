package com.things;

import java.util.Arrays;

public class EncapsulationCoffe {

	private String[] branchName;
	private String[] flovers;
	private int[] price;
	private String[] place;
	private int[] quantity;

	public EncapsulationCoffe(String[] branchName, String[] flovers, int[] price, String[] place, int[] quantity) {
		super();
		this.branchName = branchName;
		this.flovers = flovers;
		this.price = price;
		this.place = place;
		this.quantity = quantity;
	}

	public String[] getBranchName() {
		return branchName;
	}

	public void setBranchName(String[] branchName) {
		this.branchName = branchName;
	}

	public String[] getFlovers() {
		return flovers;
	}

	public void setFlovers(String[] flovers) {
		this.flovers = flovers;
	}

	public int[] getPrice() {
		return price;
	}

	public void setPrice(int[] price) {
		this.price = price;
	}

	public String[] getPlace() {
		return place;
	}

	public void setPlace(String[] place) {
		this.place = place;
	}

	public int[] getQuantity() {
		return quantity;
	}

	public void setQuantity(int[] quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "EncapsulationCoffe [branchName=" + Arrays.toString(branchName) + ", flovers=" + Arrays.toString(flovers)
				+ ", price=" + Arrays.toString(price) + ", place=" + Arrays.toString(place) + ", quantity="
				+ Arrays.toString(quantity) + "]";
	}

}
