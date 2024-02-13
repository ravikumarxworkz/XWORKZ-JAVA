package com.xworkz.Sankranti.service;

import com.xworkz.Sankranti.dto.SankranthiDto;
import com.xworkz.Sankranti.repository.SankranthiRepository;

public class SankranthiSerivceImplementation implements SankranthiService {

	SankranthiRepository repository;

	public SankranthiRepository getRepository() {
		return repository;
	}

	public SankranthiSerivceImplementation(SankranthiRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(SankranthiDto sankranthiDto) {

		try {
			//System.out.println("try block");
			if (validateInput(sankranthiDto)) {

				if (unqiue(sankranthiDto.getState())) {
					System.out.println("this state is already present in dto");
				} else {
					boolean save = this.repository.dtoOnSave(sankranthiDto);
					if (save) {
						System.out.println("dto is saved");
					} else {
						System.out.println("dto is not saved");
					}
				}

			}

		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void read() {

		SankranthiDto[] read = this.repository.read();

		for (SankranthiDto dto : read) {
			System.out.println(dto);
		}

	}

	private boolean unqiue(String state) {
		try {
			SankranthiDto[] read = this.repository.read();
			for (int i = 0; i < read.length; i++) {
				try {
					if (read[i].getState().equalsIgnoreCase(state)) {
						return true;
					}
				} catch (Exception e) {
					break;
				}

			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		return false;
	}

	private boolean foodName(String foodName) {
		try {
			if (foodName.isEmpty()) {
				System.out.println("food names is empty");
				return false;
			}
			if (!(foodName.length() > 2)) {
				System.out.println("name length greater than 2");
				return false;
			}

		} catch (NullPointerException e) {
			//System.out.println("null");
			e.printStackTrace();
		}
		return true;

	}

	private boolean validateInput(SankranthiDto sankranthiDto) {
              try { 
		boolean foodName = foodName(sankranthiDto.getFoodName());
		boolean day = foodName(sankranthiDto.getDay());
		boolean state = foodName(sankranthiDto.getState());
		boolean specialThings = foodName(sankranthiDto.getSpecialThings());
		boolean typeOfFestival = foodName(sankranthiDto.getTypeOfFestival());
		boolean gmaes = foodName(sankranthiDto.getGames());

		if (foodName || day || state || specialThings || typeOfFestival || gmaes) {
			return true;
		}
              }
              catch (NullPointerException e) {
            	  System.out.println("null");
			}
		return false;

	}

}
