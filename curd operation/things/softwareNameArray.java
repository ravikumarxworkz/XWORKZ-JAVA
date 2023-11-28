package things;

public class softwareNameArray {
	int index = 0;
	String[] software = new String[4];

	public void insertSoftwareName(String softwareName) {
		if (index < software.length) {
			software[index] = softwareName;
			index++;
		}
		else {
			System.out.println("software name are full");
		}
	}

	public void displaySoftwareName() {
		for (int j = 0; j < software.length; j++) {
			System.out.println("Software nmaes=" + software[j]);
		}
	}

}


