package com.xworkz.map.runner;

import java.util.HashMap;

public class Ratings {

	public static void main(String[] args) {

		HashMap<Double, String> ratingsMap = new HashMap<>();
		ratingsMap.put(4.5, "Excellent");
		ratingsMap.put(4.0, "Very Good");
		ratingsMap.put(3.5, "Good");
		ratingsMap.put(3.0, "Fair");
		ratingsMap.put(2.5, "Average");
		ratingsMap.put(2.0, "Below Average");
		ratingsMap.put(1.5, "Poor");
		ratingsMap.put(1.0, "Very Poor");
		ratingsMap.put(0.5, "Terrible");
		ratingsMap.put(0.0, "Not Rated");

		// print all values
		System.out.println(ratingsMap);
		// all key keys printing
		System.out.println("all key values=" + ratingsMap.keySet());
		// put element if keys is not present or not
		System.out.println(ratingsMap.putIfAbsent(5.5, "hit"));
		// check if key is present or not
		System.out.println("keys is persent or not=" + ratingsMap.containsKey(1.5));
		// check if value is present or not
		System.out.println("values is presnet=" + ratingsMap.containsValue("GOOD"));
		// print size of the map
		System.out.println("size of the map =" + ratingsMap.size());
		// get value by key
		System.out.println("get the value by key=" + ratingsMap.get(3.5));

	}
}
