package com.xworkz.hospital.runner;

import java.util.ArrayList;
import java.util.Iterator;

import com.xworkz.hospital.dto.HospitalDto;

public class HospitalRunner {

	public static void main(String[] args) {

		HospitalDto dto = new HospitalDto();
		HospitalDto dto1 = new HospitalDto();
		HospitalDto dto2 = new HospitalDto();

		dto.setHopsital_Name("jayadeva hopsital");
		dto.setDoctor("narayanacharya");
		dto.setPhonenumber(9875826592l);
		dto.setAdress("bengaluru");

		dto1.setHopsital_Name("victoria hopsital");
		dto1.setDoctor(" Dr.ramachari");
		dto1.setPhonenumber(9675826592l);
		dto1.setAdress("mumbai");
		dto2.setHopsital_Name("manipal hopsital");
		dto2.setDoctor("Dr ashok");
		dto2.setPhonenumber(99875860592l);
		dto2.setAdress("pune");
		ArrayList<HospitalDto> li = new ArrayList<HospitalDto>();

		li.add(dto);
		li.add(dto1);
		li.add(dto2);

		Iterator<HospitalDto> i = li.listIterator();

		while (i.hasNext()) {

			System.out.println(i.next());
		}

	}

}
