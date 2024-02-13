package com.xworkz.scam.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ScamDto {
	
	
	private String ScamName;
	private String department;
	private String Scamedby;
	private double  ScamedAmount;

}
