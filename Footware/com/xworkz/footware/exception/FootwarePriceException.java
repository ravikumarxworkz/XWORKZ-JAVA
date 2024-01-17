package com.xworkz.footware.exception;

public class FootwarePriceException extends RuntimeException {
	
	private String massage;
	
	public FootwarePriceException(String massage) {
		super(massage);
	}

}
