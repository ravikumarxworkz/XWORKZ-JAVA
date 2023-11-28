package runner;

import abstractImplementation.LifeI;
import abstracts.Life;

public class LifeR {

	public static void main(String[] args) {

		
		Life l=new LifeI();
		
		l.childhoood();
		l.children();
		l.family();
		l.education();
		l.job();
	}

}
