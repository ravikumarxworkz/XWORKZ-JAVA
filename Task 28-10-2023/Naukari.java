package com.things;

public class Naukari {
	
	private String name;
	private int numberOfCertificate;
	private String emailId;
	public Naukari(String name, int numberOfCertificate, String emailId) {
		super();
		this.name = name;
		this.numberOfCertificate = numberOfCertificate;
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfCertificate() {
		return numberOfCertificate;
	}
	public void setNumberOfCertificate(int numberOfCertificate) {
		this.numberOfCertificate = numberOfCertificate;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
