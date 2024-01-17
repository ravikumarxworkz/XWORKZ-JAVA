package com.xworkz.toys.exception;

import org.omg.SendingContext.RunTime;

public class NameLengthException extends RuntimeException {

	private String massage;

	public NameLengthException(String massage) {
		super(massage);
	}

}
