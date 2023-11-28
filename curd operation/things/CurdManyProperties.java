package things;

public class CurdManyProperties {
	int size=5;
	String iplTeam[] = new String[size];
	String captainName[] = new String[size];
	String homeGround[] = new String[size];
	int noOfPlayers[] = new int[size];
	String score[] = new String[size];
	
	public void insert(String[] iplT,String captainN[],String homeG[],int noOfPlayer[] ) {
		for (int i = 0; i < size; i++) {
			
			if(i<size){
				 iplTeam[i] = iplT[i];
				 captainName[i]=captainN[i];
              	 homeGround[i]=homeG[i];
                noOfPlayers[i]=noOfPlayer[i];
			}
		}  
//			  if (i < iplT.length) { 
//				  iplTeam[i] = iplT[i]; 
//				  }
//			 
//				if (i < captainName.length) {
//				captainName[i]=captainN[i];
//				}
//				if (i < homeGround.length) {
//				homeGround[i]=homeG[i];
//			} */
			/*
			 * else { System.out.println("arrys list upto " + size); break; }
			 */
			}

	public void display() {
		System.out.println("iplTEAM NAME");
		for (int i = 0; i < size; i++) {
				System.out.println((i + 1) + ")" + iplTeam[i]);
		}
		System.out.println("captainName");
		for (int i = 0; i < size; i++) {
				System.out.println((i + 1) + ")" + captainName[i]);
		}
				System.out.println("homeGround");
				for (int i = 0; i < size; i++) {
					System.out.println((i + 1) + ")" + homeGround[i]);
			}
				System.out.println("no of players");
				for (int i = 0; i < size; i++) {
					System.out.println((i + 1) + ")" + noOfPlayers[i]);
			}
		}
	
/*
	public void update(String[] oldName, String[] newName) {
		for (int i = 0; i < iplTeam.length; i++) {
			if (newName[i] == oldName[i] || newName[i] == null) {
				newName[i] = oldName[i];
			}
			if (iplTeam[i] == oldName[i]) {
				iplTeam[i] = newName[i];
			}

		}
	}

	public void delete(String[] deleteName) {
		for (int i = 0; i < iplTeam.length; i++) {
			if (iplTeam[i] == deleteName[i]) {
				iplTeam[i] = null;
			}

		}*/
	}

