package com.xworkz.medicine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicineDto {
	
	private String medicine_Name;
	private String company;
	private int dosage;
	private int price;

}
