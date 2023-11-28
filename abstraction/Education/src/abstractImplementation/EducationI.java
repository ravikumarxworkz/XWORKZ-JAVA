package abstractImplementation;

import abstracts.Education;
public class EducationI  extends Education {

	@Override
	public void unversity() {
System.out.println("unversity name is VTU");		
	}

	@Override
	public void collegeName() {
		System.out.println("COLLEGE name IS SMVIT");		
	}

	@Override
	public String adress(String location) {
		return location;
	}

	@Override
	public double totalfees(double fees) {
		return fees;
	}

	@Override
	public int yers(int years) {
		return years;
	}
}
