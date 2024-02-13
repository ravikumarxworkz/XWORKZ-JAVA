package com.xworkz.movie.repository;

public interface MovieRepositoryInterface {
	
	boolean onSave(String movieName);

	
	String[] read();

	boolean searchByName(String movieName);

	boolean update(String oldMovieName, String newMovieName);

	boolean delete(String movieName);
	

}
