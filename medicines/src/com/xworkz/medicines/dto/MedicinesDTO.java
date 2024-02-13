package com.xworkz.medicines.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicinesDTO {

	private String name;
	private String category;
	private String description;
	private double price;
	private int quantity;
	private String manufacturer;
	private String dosageForm;
	private String indication;
	private String sideEffects;
	private String contraindications;
	private String warnings;
	private String expiryDate;
	private boolean prescriptionRequired;
	private boolean generic;
	private boolean overTheCounter;

}
