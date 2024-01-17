package com.xworkz.footware.service;

import javax.naming.InvalidNameException;

import com.xworkz.footware.dto.FootwareDto;
import com.xworkz.footware.exception.FootwarePriceException;
import com.xworkz.footware.exception.FootwareSizeException;
import com.xworkz.footware.exception.NameLengthException;
import com.xworkz.footware.repository.FootwareRepository;

public class FootwareServiceImplementation implements FootwareService {

	FootwareRepository repository;

	public FootwareRepository getRepository() {
		return repository;
	}

	public void setRepository(FootwareRepository repository) {
		this.repository = repository;
	}

	public FootwareServiceImplementation(FootwareRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(FootwareDto footwareDto) throws NullPointerException, FootwareSizeException {

		try {
			boolean validateResult = validateAll(footwareDto);
			if (validateResult) {
				boolean save = this.repository.dtoSave(footwareDto);
				if (save) {
					System.out.println("dto is saved");
				} else {
					System.out.println("dto is no saved");
				}
			}
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public void read() {
		FootwareDto[] read = this.repository.read();
		for (FootwareDto footwareDto : read) {
			System.out.println(footwareDto);
		}
	}

	@Override
	public boolean updateByBrand(String brand, FootwareDto footwareDto) throws FootwareSizeException {
		if (!(brand == null && footwareDto == null)) {
			boolean validate = validateAll(footwareDto);
			if (validate) {
				boolean update = this.repository.updateByBrand(brand, footwareDto);

				if (update) {
					System.out.println("dto is updated");
				} else {
					System.out.println("dtos is not updated");
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteBytype(String type) {
		if (type != null) {
			boolean delete = this.repository.deleteBytype(type);
			if (delete) {
				System.out.println("dto is deleted");
			} else {
				System.out.println("dtos is not deleted");
			}
		}
		return false;
	}
/////////////////////////////////////////////////////////////

	private boolean validateAll(FootwareDto footwareDto) throws FootwareSizeException {

		boolean brand = validateBrand(footwareDto.getBrand());
		boolean size = validateSize(footwareDto.getSize());
		boolean price = validateprice(footwareDto.getPrice());
		boolean type = validateType(footwareDto.getType());

		if (brand && size && price && type) {
			return true;
		}

		return false;

	}

	private boolean validateType(String type) {
		try {
			if (!(type.length() > 2)) {
				throw new NameLengthException("length should be greter than 2");
			}
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

		return true;
	}

	private boolean validateprice(double price) {
		try {

			if (!(price > 500 && price < 2500)) {
				throw new FootwarePriceException(" footware price between 500 to 2500");
			}
		} catch (FootwarePriceException e) {
			e.printStackTrace();
		}
		return true;
	}

	private boolean validateSize(int size) throws FootwareSizeException {

		if (!(size > 0 && size < 10)) {
			throw new FootwareSizeException("size of footware between 0 to 10");
		}
		return true;
	}

	private boolean validateBrand(String brand) {
		try {
			if (!(brand.length() > 2)) {
				throw new NameLengthException("length should be greter than 2");
			}

		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return true;
	}

}
