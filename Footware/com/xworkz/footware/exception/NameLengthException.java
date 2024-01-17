package com.xworkz.footware.exception;

public class NameLengthException extends RuntimeException {

	private String massage;

	public NameLengthException(String massage) {
		super(massage);
	}
}