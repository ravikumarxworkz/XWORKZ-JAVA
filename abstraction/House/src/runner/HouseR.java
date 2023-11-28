package runner;

import abstractImplementation.HouseI;
import abstracts.House;

public class HouseR {

	public static void main(String[] args) {

		House h = new HouseI();

		h.houseName();
		h.numberOfMembers();
		System.out.println("houseNumber :" + h.houseNumber(562));
		System.out.println("adress:" + h.adress("belagavi"));
		System.out.println("age Of house :" + h.ageOfhouse(20));
	}

}
