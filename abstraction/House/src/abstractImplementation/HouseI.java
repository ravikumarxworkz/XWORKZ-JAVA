package abstractImplementation;

import abstracts.House;

public class HouseI  extends House{

	@Override
	public void houseName() {
System.out.println("house name is : AMMA");		
	}

	@Override
	public void numberOfMembers() {
		System.out.println("number Of Members: 4");
	}

	@Override
	public int houseNumber(int houseNumber) {
		return houseNumber;
	}

	@Override
	public String adress(String location) {
		return  location;
	}

	@Override
	public double ageOfhouse(double age) {
		return age;
	}

}
