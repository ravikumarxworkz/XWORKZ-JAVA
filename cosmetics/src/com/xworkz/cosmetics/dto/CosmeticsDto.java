package com.xworkz.cosmetics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CosmeticsDto {

	private String productName;
	private String brand;
	private String category;
	private String description;
	private double price;
	private int quantity;
	private String size;
	private String color;
	private String skinType;
	private String ingredients;
	private String benefits;
	private String expiryDate;
	private boolean crueltyFree;
	private boolean vegan;
	private boolean organic;
}
