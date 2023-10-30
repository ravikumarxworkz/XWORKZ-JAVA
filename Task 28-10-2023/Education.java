package com.things;

public class Education {
	
	private String studentName;
	private String usnNumber;
	private String Qualification;
	private String collegeName;
	private double percentage;
	public Education(String studentName, String usnNumber, String qualification, String collegeName,
			double percentage) {
		super();
		this.studentName = studentName;
		this.usnNumber = usnNumber;
		Qualification = qualification;
		this.collegeName = collegeName;
		this.percentage = percentage;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getUsnNumber() {
		return usnNumber;
	}
	public void setUsnNumber(String usnNumber) {
		this.usnNumber = usnNumber;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	

}
