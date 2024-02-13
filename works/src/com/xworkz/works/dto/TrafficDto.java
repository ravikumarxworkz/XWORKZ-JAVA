package com.xworkz.works.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TrafficDto {
	   private String location;
	    private String severity;
	    private String description;
	    private String timestamp;

}
