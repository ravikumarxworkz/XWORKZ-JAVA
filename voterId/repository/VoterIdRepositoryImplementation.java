package com.xworkz.voterId.repository;

import com.xworkz.voterId.dto.VoterIdDto;

public class VoterIdRepositoryImplementation implements VoterIdRepository {

	private VoterIdDto[] voterIdDtos = new VoterIdDto[4];
	private int index = 0;

	@Override
	public boolean saveDto(VoterIdDto voterIdDto) {
		if (this.index >= this.voterIdDtos.length) {
			System.out.println(" dto is full");
		} else {
			if (this.index < this.voterIdDtos.length) {
				this.voterIdDtos[this.index] = voterIdDto;
				this.index++;
				return true;
			}
		}
		return false;
	}

	@Override
	public VoterIdDto[] readDto() {
		return voterIdDtos;
	}

	@Override
	public boolean updateDto(long aadhar_Number) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteDto(long aadhar_Number) {
		// TODO Auto-generated method stub
		return false;
	}

}
