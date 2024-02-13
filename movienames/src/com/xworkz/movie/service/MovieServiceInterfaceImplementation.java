package com.xworkz.movie.service;

import com.xworkz.movie.repository.MovieRepositoryInterface;

public class MovieServiceInterfaceImplementation implements MovieServiceInterface {

	MovieRepositoryInterface repository;

	public MovieServiceInterfaceImplementation(MovieRepositoryInterface repository) {
		this.repository = repository;
	}

	public MovieRepositoryInterface getRepository() {
		return repository;
	}

	@Override
	public boolean ValidateAndSave(String movieName) {
		if (movieName != null) {
			if (movieName.isEmpty()) {
				System.out.println("movieName is empty ");
				return false;
			} else if (!(movieName.length() > 2 && movieName.length() < 30)) {
				System.out.println("movieName length should between 2 to 30");
				return false;
			} else if (!movieName.contains("a")) {
				System.out.println("movieName must contain 'a' charater");
				return false;
			}
			boolean exist = isExits(movieName);
			if (exist) {
				System.out.println("data is already exist in array");
			} else {
				boolean save = repository.onSave(movieName);
				if (save) {
					System.out.println("data is invoke ");
				} else {
					System.out.println("data is not invoke");

				}
			}
		} else {
			System.out.println("stateName is null");
		}
		return false;
	}

	@Override
	public boolean isExits(String movieName) {
		String[] name = repository.read();
		if (name != null) {
			for (String string : name) {
				if (string != null && movieName != null) {
					if (string.equals(movieName)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public void read() {
		String[] name = repository.read();
		for (String string : name) {
			System.out.println(string);

		}
	}

	@Override
	public boolean searchByName(String movieName) {
		boolean name = repository.searchByName(movieName);
		if (name) {
			System.out.println(" your searching movieName  is presnt in data");
		} else {
			System.out.println(" your searching movieNamenot present in data");
		}
		return false;
	}

	@Override
	public boolean update(String oldMovieName, String newMovieName) {
		if (newMovieName != null) {
			if (newMovieName.isEmpty()) {
				System.out.println("newMovieName Name is empty");
				return false;
			} else if (!newMovieName.contains("a")) {
				System.out.println(" newMovieName is must conatain 'a' letter ");
				return false;
			} else if (!(newMovieName.length() > 2 && newMovieName.length() < 30)) {
				System.out.println("newMovieName length should between 2 to 30");
				return false;
			}
			boolean exits = isExits(newMovieName);
			if (exits) {
				System.out.println("newMovieName already present in data");
			} else {
				boolean update = repository.update(oldMovieName, newMovieName);
				if (update) {
					System.out.println("newMovieName updated  by oldStateName");
				} else {
					System.out.println("newMovieName not updated  by oldStateName");
				}
			}
		}
		return false;
	}

	@Override
	public boolean delete(String movieName) {
		if (movieName != null) {
			boolean delete = repository.delete(movieName);
			if (delete) {
				System.out.println("movie is delted sucessfully");
			} else {
				System.out.println("deleting movie Name is  not presnt data");

			}
		} else {
			System.out.println("movie name is null");
		}
		return false;
	}
}
