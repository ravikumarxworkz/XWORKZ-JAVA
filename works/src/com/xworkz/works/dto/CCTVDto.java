package com.xworkz.works.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CCTVDto {
   
	private String companyName;
	private String model;
	private String resolution;
	private double price;
}
