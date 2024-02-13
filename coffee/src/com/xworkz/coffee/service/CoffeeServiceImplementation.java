package com.xworkz.coffee.service;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.coffee.dto.CoffeeDto;
import com.xworkz.coffee.repository.CoffeeRepository;

public class CoffeeServiceImplementation implements CoffeeService {

	private CoffeeRepository repository;

	public CoffeeServiceImplementation(CoffeeRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(CoffeeDto coffeeDto) {

		if (coffeeDto != null) {
			boolean exit = isExit(coffeeDto.getCoffeName());
			if (exit) {
				System.out.println("coffee name is already preaent in dto");
			} else {
				boolean save = this.repository.dtoSave(coffeeDto);
				if (save) {
					System.out.println("dto is saved sucessfullly");
				} else {
					System.out.println("dto is not  saved sucessfullly");
				}
			}

		}
		return false;
	}

	private boolean isExit(String CoffeName) {
		if (CoffeName != null) {
			List<CoffeeDto> dto = repository.read();
			for (CoffeeDto coffee : dto) {
				if (coffee.getCoffeName().equalsIgnoreCase(CoffeName)) {
					return true;
				}

			}
		}
		return false;

	}

	@Override
	public void read() {
		List<CoffeeDto> dto = repository.read();
		  for (Iterator iterator = dto.iterator(); iterator.hasNext();) {
			//CoffeeDto coffeeDto = (CoffeeDto) iterator.next();
			System.out.println(iterator.next());
	}
	}

	@Override
	public boolean update(String coffeeName, CoffeeDto coffeeDto) {
		if (coffeeName != null && coffeeDto != null) {
			boolean update = this.repository.update(coffeeName, coffeeDto);
			boolean exit = isExit(coffeeDto.getCoffeName());
			if (exit) {
				if (update) {
					System.out.println("dto is updated successfullly");
				} else {
					System.out.println("dto is not updated successfullly");
				}
			} else {
				System.out.println("coffee name is not present in dto");
			}
		}
		return false;
	}

	@Override
	public boolean delete(String coffeeName) {
		if (coffeeName != null) {
			boolean delete = this.repository.delete(coffeeName);
			if (delete) {
				System.out.println("dto is deleted successfullly");
			} else {
				System.out.println("dto is not deleted successfullly");
			}
		}
		return false;
	}

}
