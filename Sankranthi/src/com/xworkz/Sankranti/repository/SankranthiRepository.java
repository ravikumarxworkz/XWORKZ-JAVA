package com.xworkz.Sankranti.repository;

import com.xworkz.Sankranti.dto.SankranthiDto;

public interface SankranthiRepository {
	
	
	
	boolean dtoOnSave(SankranthiDto sankranthiDto);
	
	SankranthiDto[] read();
	

}