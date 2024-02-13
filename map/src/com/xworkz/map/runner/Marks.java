package com.xworkz.map.runner;

import java.util.HashMap;

public class Marks {

	public static void main(String[] args) {
		HashMap<Character, Integer> marksMap = new HashMap<>();
		marksMap.put('A', 90);
		marksMap.put('B', 85);
		marksMap.put('C', 80);
		marksMap.put('D', 75);
		marksMap.put('E', 70);
		marksMap.put('F', 65);
		marksMap.put('G', 60);
		marksMap.put('H', 55);
		marksMap.put('I', 50);
		marksMap.put('J', 45);

		// all print values
		System.out.println(marksMap);

		// all key values only
		System.out.println("key values=" + marksMap.keySet());
		// add value if absent
		System.out.println("adding values=" + marksMap.putIfAbsent('K', 40));

		System.out.println("keys is persent or not=" + marksMap.containsKey('C'));
		// check if value is present or not
		System.out.println("values is presnet=" + marksMap.containsValue(30));
		// print size of the map
		System.out.println("size of the map =" + marksMap.size());
		// get value by key
		System.out.println("get the value by key=" + marksMap.get('E'));
	}
}
