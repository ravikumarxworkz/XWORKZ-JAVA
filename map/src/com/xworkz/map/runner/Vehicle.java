package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Set;

public class Vehicle {
	public static void main(String[] args) {

		HashMap<Integer, String> vehicleMap = new HashMap<>();

		vehicleMap.put(1234, "soma huddar");
		vehicleMap.put(5678, "venki Smith");
		vehicleMap.put(9012, " manjula");
		vehicleMap.put(3456, " sandeeep sj");
		vehicleMap.put(7890, "surya parkash");
		vehicleMap.put(2345, "David Lee");
		vehicleMap.put(6789, "basu gowda");
		vehicleMap.put(8901, " virat kholi");
		vehicleMap.put(4567, "k l Anderson");
		vehicleMap.put(8903, " will jacks");

		// printing all values
		for (Integer code : vehicleMap.keySet()) {
			System.out.println("vehicle number: " + code + ", owner1 name: " + vehicleMap.get(code));
		}

		// all key keys printing
		Set<Integer> key = vehicleMap.keySet();

		System.out.println(key);

		// put element if keys is not present or not
		vehicleMap.putIfAbsent(1111, "megha patil");

		System.out.println(vehicleMap);
		// check if key is present or not
		System.out.println("keys is persent or not=" + vehicleMap.containsKey(7598));

		// print size of the map
		System.out.println("size of the map =" + vehicleMap.size());
		// get value by key
		System.out.println("get the value by key=" + vehicleMap.get(1111));
	}
}
