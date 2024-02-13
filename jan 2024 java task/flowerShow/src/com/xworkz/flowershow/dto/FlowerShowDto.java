package com.xworkz.flowershow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FlowerShowDto implements Comparable<FlowerShowDto> {
	
	private String FlowerShowName;
	private int varities;
	private String venue;
	private String date;
	@Override
	public int compareTo(FlowerShowDto o) {
		// TODO Auto-generated method stub
		return this.FlowerShowName.compareToIgnoreCase(o.FlowerShowName);
	}
	
	
	

}
