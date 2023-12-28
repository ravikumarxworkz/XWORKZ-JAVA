package com.xworkz.voterId.service;

import com.xworkz.voterId.dto.VoterIdDto;

public interface VoterIdService {

	boolean validateAndSaveDto(VoterIdDto voterIdDto);

	VoterIdDto[] readDto();

	boolean updateDto(long oldAadhar_Number, long newAadhar_Number);

	boolean deleteDto(long aadhar_Number);

}
