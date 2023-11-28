package things;

public class TwoDCurdOperation {
	int x = 2;
	int y = 5;
	String[][] values = new String[x][y];
	String properties[] = new String[y];

	public void insertpropertie(String[] teamDetalies) {
		for (int i = 0; i < y; i++) {
			properties[i] = teamDetalies[i];
		}
	}

	public void insert(String[][] iplT) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (j < y) {
					values[i][j] = iplT[i][j];
				}
			}
		}
	}

	public void update(String oldName, String newName) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (values[i][j] == oldName) {
					System.out.println("hiiiiiii");
					values[i][j] = newName;
				} 
				else {
					System.out.println("not exist");
					break;
				}
			}
		}
	}

	public void display() {
		for (int v = 0; v < x; v++) {
			System.out.println((v + 1) + " ipl team name" + values[v][0]);
			for (int i = 0; i < y; i++) {
				System.out.println(properties[i] + ":" + values[v][i]);
			}
		}
	}
	public void delete(String[][] deleteName) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (values[i][j] == deleteName[i][j]) {
					values[i][j] = null;
				}
			}
		}
	}
	}
	/*
	 * public void update(String[][] oldName, String[][] newName) {
	 * 
	 * for (int i = 0; i < x; i++) { for (int j = 0; j < y; j++) { if (newName[i][j]
	 * == oldName[i][j] || newName[i][j] == null ||newName[i][j]!=oldName[i][j]) {
	 * newName[i][j] = oldName[i][j]; } if (values[i][j] == oldName[i][j]) {
	 * 
	 * values[i][j] = newName[i][j]; } } }
	 * 
	 * 
	 * public void update(String[] oldName, String[] newName) {
	 * System.out.println("hiiiiiiiiiiii"); for (int i = 0; i < x; i++) { for (int j
	 * = 0; j < y; j++) { if (values[i][j] == oldName[i]) {
	 * 
	 * values[i][j] = newName[i]; } } } }
	 */

	
