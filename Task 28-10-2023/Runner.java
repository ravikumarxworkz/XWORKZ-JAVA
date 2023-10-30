package com.driver;

import com.things.Company;
import com.things.Education;
import com.things.JobSeeker;
import com.things.Linkdin;
import com.things.Naukari;
import com.things.JobPortal;

public class Runner {

	public static void main(String[] args) {

		Education e = new Education("ravikumar", "1mb16076", "BE", "SMVIT", 72.00);
		Naukari n = new Naukari("ravikumar", 5, "@ravi@gmail.com");
		Linkdin l = new Linkdin("rav7862", 250, "java");
		Company c = new Company("IBM", "Testing", 300000l, "bengaluru", e, n, l);
		JobSeeker s = new JobSeeker(e, n, l, 8411265445l, 3, 1000000l);
		JobPortal j = new JobPortal("naukari", "linkdin", "foundit");
		System.out.println("===================company job detailes===============");
		System.out.println("name of compant=" + c.getCompanyName() + "\n Job role=" + c.getJobRole() + "\n Salary="
				+ c.getSalary() + "\n location=" + c.getLocation());
		System.out.println("===================================================");
		System.out.println("company checking candidate education");
		System.out.println("name of student=" + c.getEducation().getStudentName() + "\n Qualification="
				+ c.getEducation().getQualification() + "\n percentage" + c.getEducation().getPercentage()
				+ "\n collegename=" + c.getEducation().getPercentage());
		System.out.println("===================================================");
		System.out.println("company checking candidate naukari detalies");
		System.out.println("numberOfCertificate=" + c.getNaukari().getNumberOfCertificate() + "\n emaiId="
				+ c.getNaukari().getEmailId());
		System.out.println("===================================================");
		System.out.println("company checking candidate linkdin detalies");
		System.out.println("linkdin id=" + c.getLinkdin().getId() + "\n number of connections="
				+ c.getLinkdin().getNumberOfConnnections() + "\n course=" + c.getLinkdin().getCourse());
		System.out.println("========================jobSeeker detailes===========================");
		System.out.println("candidate education detailes");
		System.out.println("name of student=" + s.getEducation().getStudentName() + "\n Qualification="
				+ s.getEducation().getQualification() + "\n percentage" + s.getEducation().getPercentage()
				+ "\n collegename=" + s.getEducation().getPercentage());
		System.out.println("===================================================");
		System.out.println("candidate naukari detalies");
		System.out.println("numberOfCertificate=" + s.getNaukari().getNumberOfCertificate() + "\n emaiId="
				+ s.getNaukari().getEmailId());
		System.out.println("===================================================");
		System.out.println("candidate linkdin detalies");
		System.out.println("linkdin id=" + s.getLinkdin().getId() + "\n number of connections="
				+ s.getLinkdin().getNumberOfConnnections() + "\n course=" + s.getLinkdin().getCourse());
		System.out.println("=======================Job Portal===============");
		System.out.println("1st Job portal="+j.getName1()+
				           "\n 2nd Job portal="+j.getName2()+
				           "\n 3rd Job portal="+j.getName3());
	}
}
