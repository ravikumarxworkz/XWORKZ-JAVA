package com.xworkz.googleapps.runner;

import java.util.Scanner;

import com.xworkz.googleapps.dto.GoogleAppsDto;
import com.xworkz.googleapps.repository.GoogleAppsRepository;
import com.xworkz.googleapps.repository.GoogleAppsRepositoryImplementation;
import com.xworkz.googleapps.service.GoogleAppsService;
import com.xworkz.googleapps.service.GoogleAppsServiceImplementation;

public class GoogleAppsRunner {

	public static void main(String[] args) {
		GoogleAppsDto googleAppsDto = new GoogleAppsDto();

		Scanner sc = new Scanner(System.in);

		System.out.println("note: first enter arraySize");
		while (true) {
			System.out.println("enter dto size");
			int dtoSize = sc.nextInt();
			if (dtoSize != 0) {
				GoogleAppsRepository repository = new GoogleAppsRepositoryImplementation(dtoSize);
				GoogleAppsService service = new GoogleAppsServiceImplementation(repository);
				System.out.println("dto size  " + dtoSize);
				while (true) {
					System.out.println(
							"1:enter Dto properties \n2:Read" + "\n3:Update \n4:Delete: \n5:SearchByName\n6:exit");
					System.out.println("===========================");
					System.out.println("enter your choice");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("enter " + dtoSize + " dto properties");

						for (int i = 0; i < dtoSize;) {
							System.out.println("enter " + (i + 1) + "  dto ApplicationId");
							googleAppsDto.setApplicationId(sc.next());
							System.out.println("enter " + (i + 1) + " Application name");
							googleAppsDto.setApplicationName(sc.next());
							System.out.println("enter " + (i + 1) + " Application version");
							googleAppsDto.setApplicationVersion(sc.next());
							System.out.println("enter " + (i + 1) + " Application cost");
							googleAppsDto.setApplicationCost(sc.nextDouble());
							System.out.println("enter " + (i + 1) + " Application Storage limit");
							googleAppsDto.setApplicationStorageLimit(sc.nextInt());
							if (service.validateAndSave(googleAppsDto)) {
								System.out.println("enter " + (i + 1) + "dto is saved sucessfully");
								i++;
							} else {
								System.out.println((i + 1) + "dto is not saved sucessfully");
							}
						}
						break;
					case 2:
						System.out.println("reading all dto values");
						service.read();
						break;
					case 3:
						System.out.println("update dto by old appplication id");
						System.out.println("enter old appplication id");
						String oldApplicationId = sc.next();
						System.out.println("enter new application dto details");
						System.out.println("enter  new dto ApplicationId");
						googleAppsDto.setApplicationId(sc.next());
						System.out.println("enter new Application name");
						googleAppsDto.setApplicationName(sc.next());
						System.out.println("enter new Application version");
						googleAppsDto.setApplicationVersion(sc.next());
						System.out.println("enter new Application cost");
						googleAppsDto.setApplicationCost(sc.nextDouble());
						System.out.println("enter new Application Storage limit");
						googleAppsDto.setApplicationStorageLimit(sc.nextInt());
						service.updateByAppicationId(oldApplicationId, googleAppsDto);
						break;

					case 4:
						System.out.println("enter delete application name");
						service.deleteByAppicationName(sc.next());
						break;
					case 5:
						System.out.println("enter searching  application name");
						service.searchByAppicationName(sc.next());
						break;
					case 6:
						System.out.println("exit");
						System.exit(0);
					default:
						System.out.println("you enter invalid option");
						break;
					}
					System.out.println("================================");
				}
			} else {
				System.out.println("dto size not be zero");
			}
		}
	}

}
