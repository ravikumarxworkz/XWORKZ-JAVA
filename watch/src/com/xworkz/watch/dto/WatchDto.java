package com.xworkz.watch.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WatchDto {
	
	private String name;
	private String comapany_Name;
	private double price;
	private String madeOf;
	private boolean digitalWatch;

}
