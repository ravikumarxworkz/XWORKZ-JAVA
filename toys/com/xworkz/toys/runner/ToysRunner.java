package com.xworkz.toys.runner;

import com.xworkz.toys.dto.ToysDto;
import com.xworkz.toys.repository.ToysRepository;
import com.xworkz.toys.repository.ToysRepositoryImplementation;
import com.xworkz.toys.service.ToysService;
import com.xworkz.toys.service.ToysServiceImplementation;

public class ToysRunner {

	public static void main(String[] args) {

		ToysDto t = new ToysDto();
		ToysDto t1 = new ToysDto();
		ToysDto t2 = new ToysDto();
		ToysDto t3 = new ToysDto();

		ToysRepository repository = new ToysRepositoryImplementation();

		ToysService service = new ToysServiceImplementation(repository);

		t.setName("horse");
		t.setQuantity(2);
		t.setMadeOf("wood");
		t.setPrice(999.23);
		service.validateAndSave(t);
		service.read();

		t1.setName("elephant");
		t1.setQuantity(4);
		t1.setMadeOf("wood");
		t1.setPrice(500.23);

		service.validateAndSave(t1);
		service.read();

		System.out.println("====update======");
		t3.setName("loin");
		t3.setQuantity(4);
		t3.setMadeOf("plastic");
		t3.setPrice(500.23);
		service.updateByName("elephant", t3);
		service.read();
		System.out.println("====delete========");
		service.deleteByName("gobbesvd");
		service.read();

	}

}
