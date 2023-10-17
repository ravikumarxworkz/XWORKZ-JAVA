package com.driver;

import com.things.IplTeamCO;

public class IplTeamCOR {

	public static void main(String[] args) {
		IplTeamCO i = new IplTeamCO();
		System.out.println("IPL team names are");
		i.insertData("RCB");
		i.insertData("MI");
		i.insertData("CSK");
		i.insertData("SRH");
		i.displayData();
		System.out.println("after update old ipl team name to new ipl team  name");
		i.updateData("CSK", "RR");
		i.displayData();
		System.out.println("delete one ipl team name");
		i.deleteData("RR");
		i.displayData();
	}

}
