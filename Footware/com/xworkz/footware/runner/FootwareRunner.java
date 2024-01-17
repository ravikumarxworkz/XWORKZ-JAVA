package com.xworkz.footware.runner;

import javax.sql.rowset.serial.SerialArray;

import com.xworkz.footware.dto.FootwareDto;
import com.xworkz.footware.exception.FootwareSizeException;
import com.xworkz.footware.repository.FootwareRepository;
import com.xworkz.footware.repository.FootwareRepositoryImplementation;
import com.xworkz.footware.service.FootwareService;
import com.xworkz.footware.service.FootwareServiceImplementation;

public class FootwareRunner {
	
	
	public static void main(String[] args) throws NullPointerException, FootwareSizeException {
		
		
		FootwareDto f=new FootwareDto();
		FootwareDto f1=new FootwareDto();
		FootwareDto f2=new FootwareDto();
		FootwareDto f3=new FootwareDto();
		
		FootwareRepository repository=new FootwareRepositoryImplementation();
		
		FootwareService service=new FootwareServiceImplementation(repository);
		
		f.setBrand("puma");
		f.setSize(5);
		f.setPrice(501);
		f.setType("shoes");
		
		f1.setBrand("sparx");
		f1.setSize(8);
		f1.setPrice(1000);
		f1.setType("sandels");
		
		f2.setBrand("addidas");
		f2.setSize(7);
		f2.setPrice(2000);
		f2.setType("shoes");
		
		service.validateAndSave(f);
		service.validateAndSave(f1);
		service.validateAndSave(f2);
		
		service.read();
		f3.setBrand("senakers");
		f3.setSize(6);
		f3.setPrice(1500);
		f3.setType("shoes");
		System.out.println("===update===");
		service.updateByBrand("puma", f3);
		service.read();
		System.out.println("=======delete");
		service.deleteBytype("shoes");
		service.read();
	}

}
