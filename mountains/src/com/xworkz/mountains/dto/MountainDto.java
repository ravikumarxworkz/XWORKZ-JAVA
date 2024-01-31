package com.xworkz.mountains.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MountainDto {
	
	
	private String nameOfMountain;
	private double height;
	private double width;
	private String country;

}
