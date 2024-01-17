package com.xworkz.toys.exception;

public class MadeOfException extends RuntimeException {
	
	private String massage;

	public MadeOfException(String massage) {
		super(massage);
	}

}
