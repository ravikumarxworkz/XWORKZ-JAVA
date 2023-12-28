package com.xworkz.voterId.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class VoterIdDto {
	private long aadhar_Number;
	private String name;
	private int age;
	private String current_Adress;
	
	

}
