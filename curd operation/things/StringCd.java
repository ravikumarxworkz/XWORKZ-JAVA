package things;

public class StringCd {
	String[] gameList = new String[6];
	int i = 0;

	public void insertGames(String gameName) {

		if (i < gameList.length) {
			gameList[i] = gameName;
			i++;

		} else {
			System.out.println("gmae list is full");

		}
	}

	public void updateGame(String oldGameName, String NewGameName) {
		for (int x = 0; x < gameList.length; x++) {
			if (gameList[x] == oldGameName) {
				gameList[x] = NewGameName;
				break;
			}
		}
	}

	public void deleteGame(String gameName) {
		for (int i = 0; i < gameList.length; i++) {
			if (gameList[i] == gameName) {
				gameList[i] = null;
				break;
			}
			if (i == (gameList.length - 1)) {
				System.out.println("not exist");
			}

		}
	}

	public void displayGameList() {
		for (int n = 0; n < gameList.length; n++) {
			if (gameList[n] != null) {
				System.out.println("game name is=" + gameList[n]);
			}
		}
	}
}
