package com.xworkz.coffee.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.coffee.dto.CoffeeDto;

public class CoffeeRepositoryImplementation implements CoffeeRepository {

	private List<CoffeeDto> dtos = new ArrayList<CoffeeDto>();

	@Override
	public boolean dtoSave(CoffeeDto coffeeDto) {

		if (coffeeDto != null) {
			dtos.add(coffeeDto);
			return true;
		}
		return false;
	}

	@Override
	public List<CoffeeDto> read() {
		return dtos;
	}

	@Override
	public boolean update(String coffeeName, CoffeeDto coffeeDto) {
		if (coffeeName != null && coffeeDto != null) {
			for (int i = 0; i < dtos.size(); i++) {
				if (dtos.get(i).getCoffeName().equalsIgnoreCase(coffeeName)) {
					dtos.set(i, coffeeDto);
					return true;
				}

			}
		}

		return false;
	}

	@Override
	public boolean delete(String coffeeName) {
		if (coffeeName != null) {
			for (int i = 0; i < dtos.size(); i++) {
				if (dtos.get(i).getCoffeName().equalsIgnoreCase(coffeeName)) {
					dtos.remove(i);
					return true;
				}

			}
		}
		return false;
	}

}
