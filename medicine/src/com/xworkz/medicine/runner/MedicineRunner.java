package com.xworkz.medicine.runner;

import java.util.LinkedList;
import java.util.ListIterator;

import com.xworkz.medicine.dto.MedicineDto;

public class MedicineRunner {

	public static void main(String[] args) {

		MedicineDto dto = new MedicineDto();
		MedicineDto dto1 = new MedicineDto();
		MedicineDto dto2 = new MedicineDto();

		dto.setMedicine_Name("DOLO 650");
		dto.setCompany("parcitimol");
		dto.setDosage(250);
		dto.setPrice(20);
		
		dto1.setMedicine_Name("wickrolly");
		dto1.setCompany("param");
		dto1.setDosage(200);
		dto1.setPrice(10);
		dto2.setMedicine_Name("Sudafed");
		dto2.setCompany("Pseudoephedrine");
		dto2.setDosage(300);
		dto2.setPrice(5);

		LinkedList<MedicineDto> ll = new LinkedList<MedicineDto>();
		
		ll.add(dto);
		ll.add(dto1);
		ll.add(dto2);
		
		ListIterator<MedicineDto> i=ll.listIterator();

		i.forEachRemaining(System.out::println);

 	}

}
