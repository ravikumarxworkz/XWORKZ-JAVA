package com.xworkz.voterId.service;

import com.xworkz.voterId.dto.VoterIdDto;
import com.xworkz.voterId.repository.VoterIdRepository;

public class VoterIdServiceImplementation implements VoterIdService {

	private VoterIdRepository repository;

	public VoterIdServiceImplementation(VoterIdRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSaveDto(VoterIdDto voterIdDto) {

		if (voterIdDto != null) {

			if (resultOfvalidate(voterIdDto)) {
				if (!aadharNumberExit(voterIdDto.getAadhar_Number())) {
					if (this.repository.saveDto(voterIdDto)) {
						System.out.println("dto is saved");
					} else {
						System.out.println("dto is not saved");
					}
				} else {
					System.out.println("aadhar card number is already present");
				}
			} else {
				System.out.println("dto is not saved");
			}

		}
		return false;
	}

	@Override
	public VoterIdDto[] readDto() {
		return null;
	}

	@Override
	public boolean updateDto(long oldAadhar_Number, long newAadhar_Number) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteDto(long aadhar_Number) {
		// TODO Auto-generated method stub
		return false;
	}
	/////// validation part

	private boolean aadharNumberExit(long aadharNumber) {

		if (!(aadharNumber < 0)) {
			VoterIdDto[] voIdDtos = this.repository.readDto();
			if (voIdDtos != null) {
				for (int i = 0; i < voIdDtos.length; i++) {
					if (voIdDtos[i] != null) {
						if (voIdDtos[i].getAadhar_Number() == aadharNumber) {
							return true;
						}
					}
				}
			}

		}

		return false;

	}

	private boolean resultOfvalidate(VoterIdDto voterIdDto) {

		if (voterIdDto != null) {
			boolean resultOfAadharnumber = validateAadharnumber(voterIdDto.getAadhar_Number());
			boolean resultOfName = validateName(voterIdDto.getName());
			boolean resultOfAge = validateAge(voterIdDto.getAge());
			boolean resultOfCurrentAdress = validateCurrentAdress(voterIdDto.getCurrent_Adress());

			if (resultOfAadharnumber && resultOfAge && resultOfCurrentAdress && resultOfName) {
				return true;
			}

		}
		return false;

	}

	private boolean validateAadharnumber(long aadharNumber) {
		int count = 0;
		while (aadharNumber > 0) {
			aadharNumber = aadharNumber / 10;
			count++;
		}
		if (count != 12) {
			System.out.println("Aadhar not contain 12 number");
			return false;
		}
    
		return true;

	}

	private boolean validateName(String name) {
		if (name != null) {
			if (name == "null") {
				System.out.println(" name not be null value");
				return false;
			}
			if (name.isEmpty()) {
				System.out.println(" name is empty");
				return false;
			}
			if (!(name.length() > 3)) {
				System.out.println(" name length greater than 3");
				return false;
			}
		} else {
			System.out.println("name is null");
			return false;
		}
		return true;

	}

	private boolean validateAge(int age) {

		if (age < 17) {
			System.out.println("age of condiate must be 18 or above only accept");
			return false;
		}
		return true;

	}

	private boolean validateCurrentAdress(String CurrentAdress) {
		if (CurrentAdress != null) {
			if (CurrentAdress == "null") {
				System.out.println(" Current Adress not be null value");
				return false;
			}
			if (CurrentAdress.isEmpty()) {
				System.out.println(" Current Adress is empty");
				return false;
			}
			if (!(CurrentAdress.length() > 3 && CurrentAdress.length() < 25)) {
				System.out.println(" Current Adress length lies b/w 4 to 24");
				return false;
			}
		} else {
			System.out.println("current adress is null");
			return false;
		}
		return true;
	}

}
