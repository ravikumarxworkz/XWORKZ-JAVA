package com.xworkz.voterId.repository;

import com.xworkz.voterId.dto.VoterIdDto;

public interface VoterIdRepository {

	boolean saveDto(VoterIdDto voterIdDto);

	VoterIdDto[] readDto();

	boolean updateDto(long aadhar_Number);

	boolean deleteDto(long aadhar_Number);

}
