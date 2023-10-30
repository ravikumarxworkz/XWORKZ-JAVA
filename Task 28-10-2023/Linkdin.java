package com.things;

public class Linkdin {
	
	private String id;
	private int numberOfConnnections;
	private String course;
	public Linkdin(String id, int numberOfConnnections, String course) {
		super();
		this.id = id;
		this.numberOfConnnections = numberOfConnnections;
		this.course = course;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNumberOfConnnections() {
		return numberOfConnnections;
	}
	public void setNumberOfConnnections(int numberOfConnnections) {
		this.numberOfConnnections = numberOfConnnections;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	
}
