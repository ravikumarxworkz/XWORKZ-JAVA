package com.things;

public class Colors {
	public String colorName;

	public Colors() {
		System.out.println("color name");
	}
	public void getColorName(String... colorName) {
		System.out.println("number of colors=" + colorName.length);
		for (String colorn : colorName) {
			System.out.println(colorn);
		}
	}

}
