package com.xworkz.toys.exception;

public class PriceException extends RuntimeException {

	private String massage;

	public PriceException(String massage) {

		super(massage);
	}

}
