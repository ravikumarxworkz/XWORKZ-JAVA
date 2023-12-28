package com.xworkz.voterId.runner;

import com.xworkz.voterId.dto.VoterIdDto;
import com.xworkz.voterId.repository.VoterIdRepository;
import com.xworkz.voterId.repository.VoterIdRepositoryImplementation;
import com.xworkz.voterId.service.VoterIdService;
import com.xworkz.voterId.service.VoterIdServiceImplementation;

public class VoterIdRunner {

	public static void main(String[] args) {

		VoterIdDto voterIdDto = new VoterIdDto();
		VoterIdDto voterIdDto1 = new VoterIdDto();

		VoterIdRepository repository = new VoterIdRepositoryImplementation();
		VoterIdService service = new VoterIdServiceImplementation(repository);

		voterIdDto.setAadhar_Number(123456789789l);
		voterIdDto.setName("ravi");
		voterIdDto.setAge(20);
		voterIdDto.setCurrent_Adress("uagr budruk");
		service.validateAndSaveDto(voterIdDto);
		
		System.out.println("===========");
		voterIdDto1.setAadhar_Number(123456789780l);
		voterIdDto1.setName("soma");
		voterIdDto1.setAge(20);
		voterIdDto1.setCurrent_Adress("vijayangar");
		service.validateAndSaveDto(voterIdDto1);

	}

}
