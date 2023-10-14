package com.things;

public class TraineeNameArray {
	int index = 0;
	String[] trainee = new String[4];

	public void insertTraineeName(String traineeName) {
		if (index < trainee.length) {
			trainee[index] = traineeName;
			index++;
		}
		else {
			System.out.println("trainee name are full");
		}
	}

	public void displayTraineeName() {
		for (int j = 0; j < trainee.length; j++) {
			System.out.println("trainee nmaes=" + trainee[j]);
		}
	}

}
