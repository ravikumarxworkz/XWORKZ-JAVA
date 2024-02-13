package com.xworkz.flowershow.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.flowershow.dto.FlowerShowDto;

public class FlowerShowRunner {

	public static void main(String[] args) {

		List<FlowerShowDto> list = new ArrayList<FlowerShowDto>();

		list.add(new FlowerShowDto("Rose", 20, "lalabgha", "10/10/2024"));
		list.add(new FlowerShowDto("LOtus", 10, "cubban park", "11/1/2024"));
		list.add(new FlowerShowDto("Lily", 50, "palce ground", "15/8/2024"));
		
		 Collections.sort(list);
		
		ListIterator<FlowerShowDto> li = list.listIterator();
             
		while (li.hasNext()) {
			System.out.println(li.next());
		}
	}

}
