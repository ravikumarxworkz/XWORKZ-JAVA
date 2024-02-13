package com.xworkz.entertainment.runner;

import java.util.ArrayList;
import java.util.Comparator;

import com.xworkz.entertainment.EntertainmentDto;

public class EntertainmentRunner {
	
	public static void main(String[] args) {
		
		
		EntertainmentDto dto=new EntertainmentDto("snow city","bengaluru","gmaes", 1000);
		EntertainmentDto dto1=new EntertainmentDto("wonderla","hydrbad","gmaes",1500);
		EntertainmentDto dto2=new EntertainmentDto("pvr cenima","hublli","movie", 200);
		EntertainmentDto dto3=new EntertainmentDto("fun  city","bengaluru","gmaes", 900);
		
		
		ArrayList<EntertainmentDto> list=new ArrayList<EntertainmentDto>();
		
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		
		
		list.sort(Comparator.comparing(EntertainmentDto::getName));
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
	}

}
