package com.xworkz.movie.repository;

public class MovieRepositoryInterfaceImplementation implements MovieRepositoryInterface {
	private String[] movieNames = new String[5];
	private int index = 0;

	@Override
	public boolean onSave(String movieName) {
		if (movieName != null) {
			if (index >= movieNames.length) {
				System.out.println("array is full");
				return false;
			} else if (index < movieNames.length) {
				movieNames[index] = movieName;
				index++;
				return true;
			}

		} else {
			System.out.println("movieName is null");
		}
		return false;
	}

	@Override
	public String[] read() {
		return movieNames;
	}

	@Override
	public boolean searchByName(String movieName) {
		if (movieName != null) {
			for (int i = 0; i < movieNames.length; i++) {
				if (movieNames[i].equalsIgnoreCase(movieName)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean update(String oldMovieName, String newMovieName) {
		if (movieNames != null) {
			for (int i = 0; i < movieNames.length; i++) {
				if (oldMovieName != null && newMovieName != null) {
					if (movieNames[i].equalsIgnoreCase(oldMovieName)) {
						movieNames[i] = newMovieName;
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean delete(String movieName) {
		if (movieNames != null) {
			for (int i = 0; i < movieNames.length; i++) {
				if (movieName != null) {
					if (movieNames[i].equalsIgnoreCase(movieName)) {
						for (int j = i; j < movieNames.length - 1; j++) {
							movieNames[j] = movieNames[j + 1];
						}
						movieNames[movieNames.length - 1] = null;
						index = index - 1;
						return true;
					}
				}
			}
		}
		return false;
	}
}
