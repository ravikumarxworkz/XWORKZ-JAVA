package runner;

import things.StringCd;

public class StringCdR {
	
	public static void main(String[] args) {
		
		StringCd a= new StringCd();
		
		a.insertGames("pubg");
		a.insertGames("templeRun");
		a.insertGames("minimalesiya");
		a.insertGames("cricket");
		a.insertGames("pf");
     	a.insertGames("kabbadi");
     	a.insertGames("rummy");
     	a.displayGameList();
     	//a.updateGame("pf", "FOOTBOLL");
     // a.deleteGame("kabbadi");
     //	a.displayGameList();
//		a.deleteGame("kabbadi");
		
		
	}

}
