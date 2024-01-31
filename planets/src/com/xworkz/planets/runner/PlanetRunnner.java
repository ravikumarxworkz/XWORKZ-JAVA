package com.xworkz.planets.runner;

import java.util.Comparator;
import java.util.Vector;

import com.xworkz.planets.dto.PlanetDto;

public class PlanetRunnner {

	public static void main(String[] args) {

		PlanetDto pDto = new PlanetDto("venus", 2, 243, 225);
		PlanetDto pDto1 = new PlanetDto("mercury", 1, 88, 59);
		PlanetDto pDto2 = new PlanetDto("EARTH", 3, 365, 1);
		PlanetDto pDto3 = new PlanetDto("MARS", 4, 687, 1);
		PlanetDto pDto4 = new PlanetDto("JUPITAR", 5, 11, 10);

		Vector<PlanetDto> vector = new Vector<PlanetDto>();

		vector.addElement(pDto);
		vector.addElement(pDto3);
		vector.addElement(pDto1);
		vector.addElement(pDto2);
		vector.add(pDto4);

		vector.sort(Comparator.comparing(PlanetDto::getPosition));
		for (PlanetDto v : vector) {
			System.out.println(v);
		}
		System.out.println(vector.size());
		System.out.println("=================");
		System.out.println("capcity of=" + vector.capacity());
		vector.setSize(11);
		System.out.println("set new size=" + vector.capacity());
		System.out.println(vector.size());

		System.out.println("=================");
		System.out.println("index od dto" + vector.indexOf(pDto3));
		System.out.println("=================");
		System.out.println("contains of dto=" + vector.contains(pDto1));
		System.out.println("=================");
		System.out.println("elements at=" + vector.elementAt(8));
		System.out.println("=================");
		System.out.println("first elememt=" + vector.firstElement());
		System.out.println("=================");
		System.out.println("last elememt=" + vector.lastElement());
		System.out.println("========setElementA=========");
		vector.setElementAt(new PlanetDto("saturn", 6, 30, 10), 1);

		for (PlanetDto v : vector) {
			System.out.println(v);
		}
		System.out.println("========removeelementAt=========");

		vector.removeElementAt(4);
		for (PlanetDto v : vector) {
			System.out.println(v);
		}
		System.out.println("========insertlementAt=========");

		vector.insertElementAt(pDto2, 4);
		for (PlanetDto v : vector) {
			System.out.println(v);
		}

		System.out.println("==========sub list===============");

		System.out.println(vector.subList(0, 2));
	}

}
