package com.xworkz.googleapps.repository;

import com.xworkz.googleapps.dto.GoogleAppsDto;

public class GoogleAppsRepositoryImplementation implements GoogleAppsRepository {
	private int dtoSizes;
	private GoogleAppsDto[] appsDtos;
	private int index = 0;

	public GoogleAppsRepositoryImplementation(int dtoSize) {
		this.dtoSizes = dtoSize;
		this.appsDtos = new GoogleAppsDto[dtoSizes];
	}

	@Override
	public boolean onSave(GoogleAppsDto googleAppsDto) {

		if (this.index < this.appsDtos.length) {
			this.appsDtos[this.index] = googleAppsDto;
			this.index++;
			return true;
		}

		return false;
	}

	@Override
	public GoogleAppsDto[] read() {
		return this.appsDtos;
	}

	@Override
	public boolean updateByApplicationId(String oldApplicationId, GoogleAppsDto googleAppsDto) {
		if (appsDtos != null) {
			for (int i = 0; i < appsDtos.length; i++) {
				if (appsDtos[i].getApplicationId().equalsIgnoreCase(oldApplicationId)) {
					appsDtos[i] = googleAppsDto;
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteByApplicationName(String applicationName) {
		if (appsDtos != null) {
			for (int i = 0; i < appsDtos.length; i++) {
				if (appsDtos[i].getApplicationName().equalsIgnoreCase(applicationName)) {
					appsDtos[i] = null;
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean searchByApplicationName(String applicationName) {
		if (appsDtos != null) {
			for (int i = 0; i < appsDtos.length; i++) {
				if (appsDtos[i].getApplicationName().equalsIgnoreCase(applicationName)) {
					return true;
				}
			}
		}
		return false;
	}

}
