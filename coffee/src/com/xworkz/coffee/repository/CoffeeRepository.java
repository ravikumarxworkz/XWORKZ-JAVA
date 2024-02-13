package com.xworkz.coffee.repository;

import java.util.List;

import com.xworkz.coffee.dto.CoffeeDto;

public interface CoffeeRepository {

	boolean dtoSave(CoffeeDto coffeeDto);

	List<CoffeeDto> read();

	boolean update(String coffeeName, CoffeeDto coffeeDto);

	boolean delete(String coffeeName);

}
