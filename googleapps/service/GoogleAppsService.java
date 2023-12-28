package com.xworkz.googleapps.service;

import com.xworkz.googleapps.dto.GoogleAppsDto;

public interface GoogleAppsService {

	boolean validateAndSave(GoogleAppsDto googleAppsDto);

	void read();

	boolean updateByAppicationId(String oldApplicationId, GoogleAppsDto googleAppsDto);

	boolean deleteByAppicationName(String applicationName);

	boolean searchByAppicationName(String applicationName);
}
