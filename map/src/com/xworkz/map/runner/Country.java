package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Country {

	public static void main(String[] args) {

		HashMap<Integer, String> countryMap = new HashMap<>();
		countryMap.put(1, "United States");
		countryMap.put(2, "Canada");
		countryMap.put(3, "United Kingdom");
		countryMap.put(4, "Germany");
		countryMap.put(5, "France");
		countryMap.put(6, "Japan");
		countryMap.put(7, "China");
		countryMap.put(8, "India");
		countryMap.put(9, "Brazil");
		countryMap.put(10, "Australia");

		// printing all values
		for (Integer code : countryMap.keySet()) {
			System.out.println("Country code: " + code + ", Country name: " + countryMap.get(code));
		}

		// all key keys printing
		Set<Integer> key = countryMap.keySet();

		System.out.println(key);
		
		// put element if keys is not present or not
		countryMap.putIfAbsent(11, "japan");

		System.out.println(countryMap);
		// check if key is present or not
		System.out.println("keys is persent or not=" + countryMap.containsKey(5));

		// print size of the map
		System.out.println("size of the map =" + countryMap.size());
		// get value by key
		System.out.println("get the value by key=" + countryMap.get(10));

	}
}
