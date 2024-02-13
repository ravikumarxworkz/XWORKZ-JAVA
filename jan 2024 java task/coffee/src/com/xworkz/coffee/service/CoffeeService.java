package com.xworkz.coffee.service;

import com.xworkz.coffee.dto.CoffeeDto;

public interface CoffeeService {
	
	
	boolean validateAndSave(CoffeeDto coffeeDto) ;
	
	void read();
	
	boolean update(String coffeeName, CoffeeDto coffeeDto);

	boolean delete(String coffeeName);
		
	

}
