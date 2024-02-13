package com.xworkz.map.runner;

import java.util.HashMap;


public class Pincode {

	public static void main(String[] args) {

		HashMap<Integer, String> cityPincode = new HashMap<>();

		cityPincode.put(110001, "New Delhi");
		cityPincode.put(400001, "Mumbai");
		cityPincode.put(700001, "Kolkata");
		cityPincode.put(600001, "Chennai");
		cityPincode.put(560001, "Bengaluru");
		cityPincode.put(380001, "Ahmedabad");
		cityPincode.put(500001, "Hyderabad");
		cityPincode.put(682001, "Kochi");
		cityPincode.put(411001, "Pune");
		cityPincode.put(208001, "Kanpur");

		// printing all values
		for (Integer code : cityPincode.keySet()) {
			System.out.println("City pin code: " + code + ", City name: " + cityPincode.get(code));
		}
		// all key keys printing
		System.out.println("all key values="+cityPincode.keySet());
		// put element if keys is not present or not
		System.out.println(cityPincode.putIfAbsent(591316, "ugar budruk"));
		// check if key is present or not
		System.out.println("keys is persent or not=" + cityPincode.containsKey(600001));
		// print size of the map
		System.out.println("size of the map =" + cityPincode.size());
		// get value by key
		System.out.println("get the value by key=" + cityPincode.get(560001));

	}

}
