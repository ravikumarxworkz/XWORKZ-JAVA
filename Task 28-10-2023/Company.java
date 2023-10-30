package com.things;

public class Company {
  
	private String companyName;
	private String jobRole;
	private long salary;
	private String location;
	private Education education ;
	private Naukari naukari;
	private Linkdin linkdin;
	public Company(String companyName, String jobRole, long salary, String location, Education education,
			Naukari naukari, Linkdin linkdin) {
		super();
		this.companyName = companyName;
		this.jobRole = jobRole;
		this.salary = salary;
		this.location = location;
		this.education = education;
		this.naukari = naukari;
		this.linkdin = linkdin;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Education getEducation() {
		return education;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
	public Naukari getNaukari() {
		return naukari;
	}
	public void setNaukari(Naukari naukari) {
		this.naukari = naukari;
	}
	public Linkdin getLinkdin() {
		return linkdin;
	}
	public void setLinkdin(Linkdin linkdin) {
		this.linkdin = linkdin;
	}
	
	
}
