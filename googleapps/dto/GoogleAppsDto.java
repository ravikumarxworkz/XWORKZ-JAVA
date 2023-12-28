package com.xworkz.googleapps.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class GoogleAppsDto {

	private String applicationId;
	private String applicationName;
	private String applicationVersion;
	private double applicationCost;
	private int applicationStorageLimit;

}
