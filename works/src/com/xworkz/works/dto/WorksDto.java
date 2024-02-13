package com.xworkz.works.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WorksDto {
	
    private int id;
    private String title;
    private String description;
    private String assignedTo;
    private boolean completed;

}
