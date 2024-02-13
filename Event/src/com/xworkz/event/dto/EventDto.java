package com.xworkz.event.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDto {
	
	private String eventName;
	private String guest;
	private String venue;
	private LocalDate date;
	

}
