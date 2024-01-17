package com.xworkz.footware.repository;

import com.xworkz.footware.dto.FootwareDto;
import com.xworkz.footware.exception.DtoFullException;

public class FootwareRepositoryImplementation implements FootwareRepository {

	private FootwareDto dtos[] = new FootwareDto[3];
	private int index = 0;

	@Override
	public boolean dtoSave(FootwareDto footwareDto) {

		if (this.index >= dtos.length) {
			throw new DtoFullException("dto is full");
		}
		if (this.index < dtos.length) {
			dtos[this.index] = footwareDto;
			index++;
			return true;
		}
		return false;
	}

	@Override
	public FootwareDto[] read() {
		return dtos;
	}

	@Override
	public boolean updateByBrand(String brand, FootwareDto footwareDto) {
		if (brand != null && footwareDto != null) {
			for (int i = 0; i < dtos.length; i++) {
				if (dtos[i] != null) {
					if (dtos[i].getBrand().equalsIgnoreCase(brand)) {
						dtos[i] = footwareDto;
						return true;
					}
				}

			}
		}
		return false;
	}

	@Override
	public boolean deleteBytype(String type) {
		if (type != null) {
			for (int i = 0; i < dtos.length; i++) {
				if (dtos[i] != null) {
					if (dtos[i].getType().equalsIgnoreCase(type)) {
						dtos[i] = null;
						return true;

					}
				}

			}
		}
		return false;
	}

}
