package com.xworkz.planets.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlanetDto {
	
	private String palnetName;
	private int position;
	private int revlution;
	private int rotation;

}
