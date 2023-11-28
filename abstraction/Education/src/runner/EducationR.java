package runner;

import abstractImplementation.EducationI;
import abstracts.Education;

public class EducationR {

	public static void main(String[] args) {

		
		Education e= new EducationI();
		
		e.unversity();
		e.collegeName();
		System.out.println("adress of college :"+e.adress("bengaluru"));
		System.out.println("total years of college : "+e.yers(4));
		System.out.println("college fees :"+e.totalfees(56400.60));
		
		}

}
