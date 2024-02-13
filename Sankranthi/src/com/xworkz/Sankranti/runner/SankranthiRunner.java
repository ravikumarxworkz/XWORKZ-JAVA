package com.xworkz.Sankranti.runner;

import com.xworkz.Sankranti.dto.SankranthiDto;
import com.xworkz.Sankranti.repository.SankranthiRepository;
import com.xworkz.Sankranti.repository.SankranthiRepositoryImplementation;
import com.xworkz.Sankranti.service.SankranthiSerivceImplementation;
import com.xworkz.Sankranti.service.SankranthiService;

public class SankranthiRunner {

	public static void main(String[] args) {

		SankranthiDto dto = new SankranthiDto();
		SankranthiDto dto1 = new SankranthiDto();
		SankranthiDto dto2 = new SankranthiDto();
 
		SankranthiRepository repository = new SankranthiRepositoryImplementation();

		SankranthiService service = new SankranthiSerivceImplementation(repository);

		//dto.setFoodName("Sherpa biscuit(khapse)");
		dto.setState(null);
		dto.setDay("sunday");
		dto.setSpecialThings("spirit of merry making.");
		dto.setTypeOfFestival("Tibetan New year");
		dto.setGames("dancing, music");
		service.validateAndSave(dto);

		dto1.setFoodName("dried cocount");
		dto1.setState("karnataka");
		dto1.setDay("sunday");
		dto1.setSpecialThings("suggi");
		dto1.setTypeOfFestival("harvest festival for formers");
		dto1.setGames("dancing, music");
		service.validateAndSave(dto1);
		dto2.setFoodName("pongal dessert");
		dto2.setState("tamil nadu");
		dto2.setDay("sunday");
		dto2.setSpecialThings("bhogi");
		dto2.setTypeOfFestival("old has come to an end and the nea has beagun");
		dto2.setGames("dancing, music");
		service.validateAndSave(dto2);
		System.out.println("==============================");
		service.read();
	}

}
