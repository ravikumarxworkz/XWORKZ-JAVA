package com.xworkz.map.runner;

import java.util.Collection;
import java.util.HashMap;

public class Planets {

	public static void main(String[] args) {

		HashMap<String, Integer> planetPositions = new HashMap<>();
		planetPositions.put("Mercury", 1);
		planetPositions.put("Venus", 2);
		planetPositions.put("Earth", 3);
		planetPositions.put("Mars", 4);
		planetPositions.put("Jupiter", 5);
		planetPositions.put("Saturn", 6);
		planetPositions.put("Uranus", 7);
		planetPositions.put("Neptune", 8);
		planetPositions.put("Pluto", 9);

		// print all values
		for (String planet : planetPositions.keySet()) {

			System.out.println(" planet name+" + planet + ",planet name " + planetPositions.get(planet));

		}

		// printing all key values only

		Collection<String> keys = planetPositions.keySet();
		System.out.println("keys values" + keys);

		// put element if keys is not present or not
		planetPositions.putIfAbsent("pluto", 6);

		System.out.println(planetPositions);
		// check if key is present or not
		System.out.println("keys is persent or not=" + planetPositions.containsKey("erath"));

		// print size of the map
		System.out.println("size of the map =" + planetPositions.size());
		// get value by key
		System.out.println("get the value by key=" + planetPositions.get("earth"));
	}

}
