package com.xworkz.republicDay.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RepublicDayDto {
	private String RepublicDayCountry;
	private int noOfYears;
	private String guest;
	private String guest_Country;
	private String venue;
	private LocalDate date;

}
 
