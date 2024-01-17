package com.xworkz.toys.service;

import com.xworkz.toys.dto.ToysDto;

public interface ToysService {

	boolean validateAndSave(ToysDto toysDto);

	void read();

	boolean updateByName(String name, ToysDto toysDto);

	boolean deleteByName(String name);

}
