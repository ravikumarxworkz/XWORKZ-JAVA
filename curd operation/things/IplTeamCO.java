package things;

public class IplTeamCO {

	String[] iplTeamList = new String[4];

	public void insertData(String[] teamName) {
		for (int i = 0; i < iplTeamList.length; i++) {
			if (i < iplTeamList.length && teamName.length <= iplTeamList.length) {
				iplTeamList[i] = teamName[i];
			} else {
				System.out.println("only  " + iplTeamList.length + " or less number ipl team name are allowed to enter");
				break;
			}
		}
	}

	public void displayData() {
		for (int i = 0; i < iplTeamList.length; i++) {
			if (iplTeamList[i] != null) {
				System.out.println((i + 1) + ")" + iplTeamList[i]);
			}
		}
	}

	public void updateData(String[] oldName, String[] newName) {
		
		for (int j = 0; j < iplTeamList.length; j++) {
			if (newName[j] == null|| newName[j]==oldName[j]) {
				newName[j] = oldName[j];
			}
			if (iplTeamList[j] == oldName[j]) {
				iplTeamList[j] = newName[j];
			}
		}

	}

	public void deleteData(String[] deleteName) {
		for (int j = 0; j < iplTeamList.length; j++) {
			if (iplTeamList[j] == deleteName[j]) {
				iplTeamList[j] = null;
			}

		}
	}
}
