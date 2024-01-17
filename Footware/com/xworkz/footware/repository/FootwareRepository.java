package com.xworkz.footware.repository;

import com.xworkz.footware.dto.FootwareDto;

public interface FootwareRepository {

	boolean dtoSave(FootwareDto footwareDto);

	FootwareDto[] read();

	boolean updateByBrand(String brand, FootwareDto footwareDto);

	boolean deleteBytype(String type);

}
