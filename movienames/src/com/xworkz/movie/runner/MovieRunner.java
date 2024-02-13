package com.xworkz.movie.runner;

import com.xworkz.movie.repository.MovieRepositoryInterface;
import com.xworkz.movie.repository.MovieRepositoryInterfaceImplementation;
import com.xworkz.movie.service.MovieServiceInterface;
import com.xworkz.movie.service.MovieServiceInterfaceImplementation;

public class MovieRunner {

	public static void main(String[] args) {

		MovieRepositoryInterface repository = new MovieRepositoryInterfaceImplementation();
		MovieServiceInterface service = new MovieServiceInterfaceImplementation(repository);
		System.out.println("invoking movie name to data");
		service.ValidateAndSave("Kaatera");
		service.ValidateAndSave("Kranti");
		service.ValidateAndSave("ugram");
		service.ValidateAndSave("Sarathi");
		service.ValidateAndSave("rathavara");
		System.out.println("========read================");
		service.read();
		System.out.println("====update=============== ");
		service.update("Kranti", "nana prithiya ramu");
		service.read();
		System.out.println("============delete=============");
		service.delete("Sarathi");
		service.read();
		System.out.println("=====after deleting inseting new value========");
		service.ValidateAndSave("salar");
		service.read();
		System.out.println("=====searching the movie name in data=======");
		service.searchByName("Kaatera");
	}
}
