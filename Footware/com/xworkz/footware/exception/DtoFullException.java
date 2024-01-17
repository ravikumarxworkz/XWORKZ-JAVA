package com.xworkz.footware.exception;

public class DtoFullException extends RuntimeException {

	private String massage;

	public DtoFullException(String massage) {
		super(massage);
	}
}
