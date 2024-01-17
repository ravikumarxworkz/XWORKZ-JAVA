package com.xworkz.toys.repository;

import com.xworkz.toys.dto.ToysDto;

public interface ToysRepository {

	boolean dtoSave(ToysDto toysDto);

	ToysDto[] read();

	boolean updateByName(String name, ToysDto toysDto);

	boolean deleteByName(String name);
}
