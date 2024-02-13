package com.xworkz.country.runner;

import java.util.LinkedList;

import com.xworkz.country.dto.CountryDTO;

public class CountryDTORunner {
	
	
	public static void main(String[] args) {
		
		  LinkedList<CountryDTO> countriesList = new LinkedList<>(); 
		  
		   countriesList.add(new CountryDTO("USA", "Washington D.C.", "North America", 331449281, 9833517.0,
                   "English", "US Dollar", "Federal Republic", "The Star-Spangled Banner",
                   "Bald Eagle", "Statue of Liberty", "Bald Eagle", "Rose", "American Football",
                   "Joe Biden"));
		   
		   
		   countriesList.add(new CountryDTO("Canada", "Ottawa", "North America", 37742154, 9976140,
	                "English, French", "Canadian Dollar", "Federal Parliamentary Democracy and Constitutional Monarchy",
	                "O Canada", "Maple Leaf", "CN Tower", "Beaver", "Maple", "Ice Hockey",
	                "Justin Trudeau"));
	}

}
