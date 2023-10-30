package com.things;

public class JobSeeker {
	
	private Education education ;
	private Naukari naukari;
	private Linkdin linkdin;
	private long phoneNumber;
	private int experince;
	private long expextedSalary;
	public JobSeeker(Education education, Naukari naukari, Linkdin linkdin, long phoneNumber, int experince,
			long expextedSalary) {
		super();
		this.education = education;
		this.naukari = naukari;
		this.linkdin = linkdin;
		this.phoneNumber = phoneNumber;
		this.experince = experince;
		this.expextedSalary = expextedSalary;
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
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getExperince() {
		return experince;
	}
	public void setExperince(int experince) {
		this.experince = experince;
	}
	public long getExpextedSalary() {
		return expextedSalary;
	}
	public void setExpextedSalary(long expextedSalary) {
		this.expextedSalary = expextedSalary;
	}
	

}
