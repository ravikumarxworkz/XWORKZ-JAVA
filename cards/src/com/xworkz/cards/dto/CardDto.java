package com.xworkz.cards.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CardDto {

	private int numberOfCards;
	private int noOfFace;
	private int noOfBlackCards;
	private int noOfredCards;

}
