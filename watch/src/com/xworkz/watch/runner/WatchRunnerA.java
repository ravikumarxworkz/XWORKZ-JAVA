package com.xworkz.watch.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.xworkz.watch.dto.WatchDto;

public class WatchRunnerA {

	public static void main(String[] args) {
		
	

		WatchDto dto1 = new WatchDto("Karishma Analog", "titan", 1500, "steel", false);
		WatchDto dto2 = new WatchDto("SONATA", "poza", 2000, "steel", false);
		WatchDto dto3 = new WatchDto("fastrack175", "fastrack", 1500, "palstic", true);
		WatchDto dto4 = new WatchDto("classic", "casio", 6000, "SILVER", false);
		WatchDto dto5 = new WatchDto("Rolex men", "ROLEX", 5000, "PLSTIC", false);
		WatchDto dto6 = new WatchDto("TissotWATCH", "Tissot", 500, "PLASTIC", true);
		WatchDto dto7 = new WatchDto("Cartier", "Richard", 6350, "SILVER", false);
		WatchDto dto8 = new WatchDto("TAG Heuer", "tata", 10000, "steel", false);
		WatchDto dto9 = new WatchDto("Vacheron Constantin", "HMT", 5000, "STEEL", false);
		WatchDto dto10 = new WatchDto("MIBAND", "MI ", 00, "PLASTIC", true);

		ArrayList<WatchDto> l = new ArrayList<WatchDto>();
		l.add(dto1);
		l.add(dto2);
		l.add(dto3);
		l.add(dto4);
		l.add(dto5);
		l.add(dto6);
		l.add(dto7);
		l.add(dto8);
		l.add(dto9);
		l.add(dto10);

		System.out.println("sort by name");

		l.sort(Comparator.comparing(WatchDto::getName));
		for (WatchDto watchDto : l) {
			System.out.println(watchDto);
		}
		System.out.println("sort by price");

		l.sort(Comparator.comparing(WatchDto::getPrice));
		for (WatchDto watchDto : l) {
			System.out.println(watchDto);
		}
		System.out.println("find watch detailes by name");
		for (int i = 0; i < l.size(); i++) {

			if (l.get(i).getComapany_Name().equalsIgnoreCase("rolex")) {
				System.out.println(l.get(i));
			}
		}
		System.out.println("find watch detailes by price");
		for (int i = 0; i < l.size(); i++) {

			if (l.get(i).getPrice() == 1500) {
				System.out.println(l.get(i));
			}
		}

		System.out.println("after remove watch detailes by name");
		for (int i = 0; i < l.size(); i++) {

			if (l.get(i).getComapany_Name().equalsIgnoreCase("rolex")) {
				l.remove(i);
			}
		}
		for (WatchDto watchDto : l) {
			System.out.println(watchDto);
		}
		System.out.println("after remove watch detailes by price");
		for (int i = 0; i < l.size(); i++) {

			if (l.get(i).getPrice() == 1500) {
				l.remove(i);
			}
		}
		for (WatchDto watchDto : l) {
			System.out.println(watchDto);
		}

	}
}
