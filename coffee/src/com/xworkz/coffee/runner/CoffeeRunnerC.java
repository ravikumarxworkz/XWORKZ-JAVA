package com.xworkz.coffee.runner;

import com.xworkz.coffee.dto.CoffeeDto;
import com.xworkz.coffee.repository.CoffeeRepository;
import com.xworkz.coffee.repository.CoffeeRepositoryImplementation;
import com.xworkz.coffee.service.CoffeeService;
import com.xworkz.coffee.service.CoffeeServiceImplementation;

public class CoffeeRunnerC {

	public static void main(String[] args) {

		CoffeeRepository repository = new CoffeeRepositoryImplementation();
		CoffeeService service = new CoffeeServiceImplementation(repository);
		CoffeeDto dto1 = new CoffeeDto();
		CoffeeDto dto2 = new CoffeeDto();
		CoffeeDto dto3 = new CoffeeDto();

		dto1.setCoffeName("chocolateCoffee");
		dto1.setFlover("chocalate");
		dto1.setQuantity(200);
		dto1.setPrice(200.20);

		dto2.setCoffeName("lemonCoffee");
		dto2.setFlover("lemon");
		dto2.setQuantity(100);
		dto2.setPrice(150.20);

		dto3.setCoffeName("filterCoffee");
		dto3.setFlover("normale");
		dto3.setQuantity(50);
		dto3.setPrice(20.20);
		System.out.println("========add========");
		service.validateAndSave(dto1);
		service.validateAndSave(dto2);
		System.out.println("=============read============");
		service.read();
		System.out.println("=========update========");
		service.update("lemonCoffee", dto3);
		service.read();
		System.out.println("============delete=======");
		service.delete("chocolateCoffee");
		service.read();

	}
}
