package com.xworkz.googleapps.service;

import com.xworkz.googleapps.dto.GoogleAppsDto;
import com.xworkz.googleapps.repository.GoogleAppsRepository;

public class GoogleAppsServiceImplementation implements GoogleAppsService {

	private GoogleAppsRepository repository;

	public GoogleAppsServiceImplementation(GoogleAppsRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(GoogleAppsDto googleAppsDto) {
		if (googleAppsDto != null) {
			boolean validatedtos = validateAllDtos(googleAppsDto);
			if (validatedtos) {
				System.out.println(validatedtos);
				boolean exit = this.isApplicationIdExit(googleAppsDto.getApplicationId());
				System.out.println(exit);
				if (exit) {
					System.out.println("object is already present");
					return false;
				} else {
					boolean save = this.repository.onSave(googleAppsDto);
					if (save) {
						System.out.println("data is saved");
						return true;
					} else {
						System.out.println("data not saved");
					}
				}
			}
		}

		return false;
	}

	@Override
	public void read() {
		GoogleAppsDto[] read = this.repository.read();
		for (GoogleAppsDto name : read) {
			System.out.println(name);
		}
	}

	@Override
	public boolean updateByAppicationId(String oldApplicationId, GoogleAppsDto googleAppsDto) {
		if (oldApplicationId != null && googleAppsDto != null) {

			boolean oldApplicationIdExit = isApplicationIdExit(oldApplicationId);
			if (oldApplicationIdExit) {
				boolean newApplicationIdExit = isApplicationIdExit(googleAppsDto.getApplicationId());
				if (newApplicationIdExit) {
					System.out.println(" new  updated application id already present in dtos");
				} else {
					boolean validateNewDto = validateAllDtos(googleAppsDto);
					if (validateNewDto) {
						boolean update = this.repository.updateByApplicationId(oldApplicationId, googleAppsDto);
						if (update) {
							System.out.println("dto updated sucessfully");
						} else {
							System.out.println("dto updated  not sucessfully");
						}
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteByAppicationName(String applicationName) {
		if (applicationName != null) {
			boolean deleteResult = this.repository.deleteByApplicationName(applicationName);
			if (deleteResult) {
				System.out.println("dto is deleted sucessfully");
			} else {
				System.out.println("dto not deleted sucessfully");
			}
		}
		return false;
	}

	@Override
	public boolean searchByAppicationName(String applicationName) {
		if (applicationName != null) {
			boolean searchResult = this.repository.searchByApplicationName(applicationName);
			if (searchResult) {
				System.out.println(" your searching application name is present in dto");
			} else {
				System.out.println(" your searching application name not present in dto");
			}
		}
		return false;
	}

	// ===============validation part=====================//

	private boolean isApplicationIdExit(String applicationId) {
		if (applicationId != null) {
			GoogleAppsDto[] read = this.repository.read();
			if (read != null) {
				for (int i = 0; i < read.length; i++) {
					if (read[i] != null && applicationId != null) {
						if (read[i].getApplicationId().equalsIgnoreCase(applicationId)) {
							return true;
						}
					}
				}
			}

		}

		return false;

	}

//	private boolean isexits(GoogleAppsDto googleAppsDto) {
//		if (googleAppsDto != null) {
//			GoogleAppsDto[] read = this.repository.read();
//			if (read != null) {
//				for (int i = 0; i < read.length; i++) {
//					if (read[i] != null && googleAppsDto != null) {
//						if (read[i].equals(googleAppsDto)) {
//							return true;
//						}
//					}
//				}
//			}
//		} else {
//			System.out.println("google dto not be null");
//		}
//		return false;
//	}

	private boolean validateApplicationId(String applicationId) {

		if (applicationId != null) {

			if (applicationId.equals("null")) {
				System.out.println("application id not be null");
				return false;
			}
			if (applicationId.isEmpty()) {
				System.out.println("application id is empty");
				return false;
			}
			if (!applicationId.startsWith("G")) {
				System.out.println("application id always start with 'G'");
				return false;
			}

			if (!(applicationId.length() > 3 && applicationId.length() < 10)) {
				System.out.println("application id length lies between 3 to 10");
				return false;
			}
		}
		return true;
	}

	private boolean validateApplicationName(String applicationName) {

		if (applicationName != null) {
			if (applicationName.equals("null")) {
				System.out.println("application name not be null");
				return false;
			}
			if (applicationName.isEmpty()) {
				System.out.println("application name is empty");
				return false;
			}
			if (!(applicationName.length() > 3 && applicationName.length() < 11)) {
				System.out.println("application name length lies between 4 to 10");
				return false;
			}
		}
		return true;
	}

	private boolean validateApplicationVersion(String applicationVersion) {

		if (applicationVersion != null) {
			if (applicationVersion.equals("null")) {
				System.out.println("application version not be null");
				return false;
			}
			if (applicationVersion.isEmpty()) {
				System.out.println("application version is empty");
				return false;
			}
			if (!applicationVersion.endsWith("v")) {
				System.out.println("application version end with 'v'");
				return false;
			}
			if (!(applicationVersion.length() > 3 && applicationVersion.length() < 10)) {
				System.out.println("application name length lies between 3 to 10");
				return false;
			}
		}
		return true;
	}

	private boolean validateApplicationCost(double applicationCost) {
		if (applicationCost < 0) {
			System.out.println(" application cost can't be negative");
			return false;
		}

		return true;

	}

	private boolean validateApplicationStorageLimit(double applicationStorageLimit) {
		if (applicationStorageLimit < 0) {
			System.out.println(" application Storage Limit can't be negative");
			return false;
		}
		return true;
	}

	private boolean validateAllDtos(GoogleAppsDto googleAppsDto) {
		boolean applicationidResult = validateApplicationId(googleAppsDto.getApplicationId());
		boolean applicationNameResult = validateApplicationName(googleAppsDto.getApplicationName());
		boolean applicationVersionResult = validateApplicationVersion(googleAppsDto.getApplicationVersion());
		boolean applicationCostResult = validateApplicationCost(googleAppsDto.getApplicationCost());
		boolean applicationStorageLImitResult = validateApplicationStorageLimit(
				googleAppsDto.getApplicationStorageLimit());
		if (applicationidResult && applicationNameResult && applicationVersionResult && applicationCostResult
				&& applicationCostResult && applicationStorageLImitResult) {
			return true;
		}
		return false;

	}

}
