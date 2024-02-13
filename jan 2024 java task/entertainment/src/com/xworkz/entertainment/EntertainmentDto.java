package com.xworkz.entertainment;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EntertainmentDto {
	
	private String name;
	private String place;
	private String typeOfEntertainment;
	private double amount;

}
