package com.xworkz.republicDay.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

import com.xworkz.republicDay.dto.RepublicDayDto;

public class RepublicDayRunner {

	public static void main(String[] args) {

		RepublicDayDto republicDayDto1 = new RepublicDayDto("usa", 248, " ratan tata", "india", "new york",
				LocalDate.now());
		RepublicDayDto republicDayDto3 = new RepublicDayDto("Ireland", 77, " modi", "Italy", "paris",
				LocalDate.of(2020, 10, 12));
		RepublicDayDto republicDayDto2 = new RepublicDayDto("india", 77, "Giorgia Meloni", "Italy", "dehali",
				LocalDate.of(100, 10, 26));
		List<RepublicDayDto> list = new ArrayList<RepublicDayDto>();
		list.add(republicDayDto1);
		list.add(republicDayDto2);
		list.add(republicDayDto3);

		list.sort(Comparator.comparing(RepublicDayDto::getDate));

		ListIterator<RepublicDayDto> iterator = list.listIterator();

		  
		if(iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		// System.out.println(list);

	}

}
