package com.xworkz.Sankranti.repository;

import com.xworkz.Sankranti.dto.SankranthiDto;

public class SankranthiRepositoryImplementation implements SankranthiRepository {
	private SankranthiDto[] dtos = new SankranthiDto[5];

	private int index = 0;

	@Override
	public boolean dtoOnSave(SankranthiDto sankranthiDto) {
		try {
			if (this.index >= this.dtos.length) {
				System.out.println("dto is full");
				return false;
			}
			if (this.index < this.dtos.length) {
				this.dtos[this.index] = sankranthiDto;
				this.index++;
				return true;
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public SankranthiDto[] read() {
		return dtos;
	}
}
