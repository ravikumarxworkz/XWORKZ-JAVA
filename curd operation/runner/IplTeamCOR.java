package runner;

import things.IplTeamCO;

public class IplTeamCOR {

	public static void main(String[] args) {
		IplTeamCO i = new IplTeamCO();
		System.out.println("IPL team names are");
		String[] teamName= {"RCB","MI","CSK",null};
		i.insertData(teamName);
		i.displayData();
		System.out.println("-------------------------------");
		System.out.println("after update old ipl team name to new ipl team  name");
		String[] oldName= {"RCB","MI","CSK",null,"abd"};
		String[] newName= {null,"GT","LSG",null};
		i.updateData(oldName, newName);
		i.displayData();
		System.out.println("-------------------------------");
		System.out.println("after deleting ipl team name list");
		String[] deleteName= {null,null,"LSG",null};
		i.deleteData(deleteName);
		i.displayData();
	}

}
