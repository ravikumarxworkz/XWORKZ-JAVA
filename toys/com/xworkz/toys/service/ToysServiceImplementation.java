package com.xworkz.toys.service;

import com.xworkz.toys.dto.ToysDto;
import com.xworkz.toys.exception.MadeOfException;
import com.xworkz.toys.exception.NameLengthException;
import com.xworkz.toys.exception.PriceException;
import com.xworkz.toys.repository.ToysRepository;

public class ToysServiceImplementation implements ToysService {

	ToysRepository repository;

	public ToysRepository getRepository() {
		return repository;
	}

	public void setRepository(ToysRepository repository) {
		this.repository = repository;
	}

	public ToysServiceImplementation(ToysRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(ToysDto toysDto) {

		if (toysDto != null) {
			boolean validateResult = validate(toysDto);
			if (validateResult) {
				boolean save = this.repository.dtoSave(toysDto);
				if (save) {
					System.out.println("dto save sucessfully");
				} else {
					System.out.println("dto not save sucessfully");
				}
			}
		}
		return false;
	}

	@Override
	public void read() {
		ToysDto[] read = this.repository.read();
		for (ToysDto toysDto : read) {
			System.out.println(toysDto);
		}
	}

	@Override
	public boolean updateByName(String name, ToysDto toysDto) {
		if (name != null && toysDto != null) {
			if (validate(toysDto)) {
				boolean update = this.repository.updateByName(name, toysDto);
				if (update) {
					System.out.println("dto update sucessfully");
				} else {
					System.out.println("dto update sucessfully");
				}

			}
		} else {
			System.out.println("null");
		}
		return false;
	}

	@Override
	public boolean deleteByName(String name) {
		if (name != null) {
			boolean delete = this.repository.deleteByName(name);
			if (delete) {
				System.out.println("dto delete sucessfully");
			} else {
				System.out.println("dto not delete sucessfully");
			}

		} else {
			System.out.println("null");
		}
		return false;
	}

	private boolean validate(ToysDto toysDto) {

		if (validateName(toysDto.getName()) && validatemadeof(toysDto.getMadeOf())
				&& validatePrice(toysDto.getPrice())) {
			return true;

		}
		return false;

	}

	private boolean validateName(String name) {

		if (name != null) {
			if (!(name.length() > 2)) {
				throw new NameLengthException("name length greter then 2");
			}
		}
		return true;

	}

	private boolean validatemadeof(String madeOf) {

		if (madeOf != null) {
			if (!(madeOf.length() > 2)) {
				throw new NameLengthException("name length greter then 2");
			}
			if (!(madeOf == "wood" || madeOf == "plastic")) {
				throw new MadeOfException("toys only mad made of wood and plastic");
			}
		}
		return true;

	}

	private boolean validatePrice(double price) {

		if (!(price > 500 && price < 1000)) {
			throw new PriceException("price between 500 to 1000");
		}
		return true;

	}

}
