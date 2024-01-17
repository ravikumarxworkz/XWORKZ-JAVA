package com.xworkz.toys.repository;

import com.xworkz.toys.dto.ToysDto;

public class ToysRepositoryImplementation implements ToysRepository {

	private ToysDto dtos[] = new ToysDto[4];

	private int index = 0;

	@Override
	public boolean dtoSave(ToysDto toysDto) {

		if (this.index >= dtos.length) {
			System.out.println("dto is full");
			return false;
		}
		if (this.index < dtos.length) {
			dtos[this.index] = toysDto;
			index++;
			return true;
		}
		return false;
	}

	@Override
	public ToysDto[] read() {
		return dtos;
	}

	@Override
	public boolean updateByName(String name, ToysDto toysDto) {

		if (name != null && toysDto != null) {
			for (int i = 0; i < dtos.length; i++) {
				if (dtos[i] != null&&name != null) {
					if (dtos[i].getName().equalsIgnoreCase(name)) {
						dtos[i] = toysDto;
						return true;
					}
				}
			}

		}
		return false;
	}

	@Override
	public boolean deleteByName(String name) {
		if (name != null) {
			for (int i = 0; i < dtos.length; i++) {
				if (dtos[i] != null) {
					if (dtos[i].getName().equalsIgnoreCase(name)) {
						dtos[i] = null;
						return true;
					}
				}
			}

		}
		return false;
	}

}
