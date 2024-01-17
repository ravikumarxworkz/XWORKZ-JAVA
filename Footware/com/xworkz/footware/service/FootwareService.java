package com.xworkz.footware.service;

import com.xworkz.footware.dto.FootwareDto;
import com.xworkz.footware.exception.FootwareSizeException;

public interface FootwareService {
	
	
	boolean validateAndSave(FootwareDto footwareDto) throws NullPointerException, FootwareSizeException;

	void read();

	boolean updateByBrand(String brand, FootwareDto footwareDto) throws FootwareSizeException;

	boolean deleteBytype(String type);

}
