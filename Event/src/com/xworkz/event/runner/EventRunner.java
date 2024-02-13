package com.xworkz.event.runner;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.chrono.Chronology;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Spliterator;

import com.xworkz.event.dto.EventDto;

public class EventRunner {

	public static void main(String[] args) {

		EventDto dto = new EventDto();
		EventDto dto1 = new EventDto();
		EventDto dto2 = new EventDto();

		dto.setEventName("birthday");
		dto.setGuest("dharshan");
		dto.setDate(LocalDate.of(2020, 10, 12));
		dto.setVenue("begalurur");

		dto1.setEventName("namma oora habba");
		dto1.setGuest("virat kholi");
		dto1.setDate(LocalDate.of(2024, 2, 12));
		dto1.setVenue("belagavi");

		dto2.setEventName(" home ingaration");
		dto2.setGuest(" salam khana");
		dto2.setDate(LocalDate.of(2023, 10, 1));
		dto2.setVenue("mandya");

		HashSet<EventDto> h = new HashSet<EventDto>();
		h.add(dto);
		h.add(dto1);
		h.add(dto2);

		Spliterator<EventDto> spliterator = h.spliterator();
		spliterator.forEachRemaining(System.out::println);

	}

}
