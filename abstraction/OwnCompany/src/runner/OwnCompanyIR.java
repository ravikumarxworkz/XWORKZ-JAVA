package runner;

import abstractImplementation.OwnCompanyI;
import abstracts.OwnCompany;

public class OwnCompanyIR {

	public static void main(String[] args) {

		
		OwnCompany c=new OwnCompanyI();
		
		c.comapanyName();
		c.typee();
		System.out.println("adress : "+c.adress("bengaluru"));
		System.out.println("number Of Employees :"+c.numberOfEmployees(100));
		System.out.println("company trunover : "+c.turnOver(4856641.525));
	}

}
