package com.xworkz.works.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RoadDto {
	
    private String roadName;
    private double length;
    private String location;

}
