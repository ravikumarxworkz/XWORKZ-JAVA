package com.xworkz.country.conastans;

public enum ConnectionData {
	
	
	URL("jdbc:mysql://localhost:3306/country"), USER_NAME("root"), PASSWORD("123456789");

	private String value;

	private ConnectionData(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}


}
