package things;

public class Democurd {
             
	String nameList[] = new String[4];
      
	public void insert(String[] name) {
		for (int i = 0; i < nameList.length; i++) {
			if (i < nameList.length && name.length <= nameList.length) {

				nameList[i] = name[i];
			} else {
				System.out.println("arrys list upto " + nameList.length);
				break;
			}

		}
	}

	public void display() {
		for (int i = 0; i < nameList.length; i++) {
			if (nameList[i]!= null) {
				System.out.println((i + 1) + ")" + nameList[i]);
			}
		}
	}

	public void update(String[] oldName, String[] newName) {
		for (int i = 0; i < nameList.length; i++) {
			if (newName[i] == oldName[i] || newName[i] == null) {
				newName[i] = oldName[i];
			}
			if (nameList[i] == oldName[i]) {
				nameList[i] = newName[i];
			}

		}
	}

	public void delete(String[] deleteName) {
		for (int i = 0; i < nameList.length; i++) {
			if (nameList[i] == deleteName[i]) {
				nameList[i] = null;
			}
		}
	}
}
