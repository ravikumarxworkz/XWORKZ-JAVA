package com.xworkz.hospital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HospitalDto {

	private String hopsital_Name;
	private String doctor;
	private long phonenumber;
	private String adress;

}
