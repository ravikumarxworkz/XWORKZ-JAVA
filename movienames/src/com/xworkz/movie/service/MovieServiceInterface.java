package com.xworkz.movie.service;

public interface MovieServiceInterface {
	
	boolean ValidateAndSave(String stateName);

	boolean isExits(String stateName);

	void read();

	boolean searchByName(String stateName);

	boolean update(String oldStateName, String newStateName);

	boolean delete(String stateName);

}
