package abstractImplementation;

import abstracts.OwnCompany;

public class OwnCompanyI extends OwnCompany {

	@Override
	public void comapanyName() {
		System.out.println(" comapany  Name  : RSK PVT LTD");
	}

	@Override
	public void typee() {
		System.out.println("tpye of company  : MNC ");
	}

	@Override
	public String adress(String adress) {
		return adress;
	}

	@Override
	public int numberOfEmployees(int employees) {
		return employees;
	}

	@Override
	public double turnOver(double income) {
		return income;
	}

}
