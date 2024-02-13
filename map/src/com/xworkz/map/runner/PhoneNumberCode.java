package com.xworkz.map.runner;

import java.util.HashMap;

public class PhoneNumberCode {

	public static void main(String[] args) {

		HashMap<String, String> countryCodes = new HashMap<>();
		countryCodes.put("+1", "United States");
		countryCodes.put("+91", "India");
		countryCodes.put("+86", "China");
		countryCodes.put("+44", "United Kingdom");
		countryCodes.put("+81", "Japan");
		countryCodes.put("+49", "Germany");
		countryCodes.put("+33", "France");
		countryCodes.put("+55", "Brazil");
		countryCodes.put("+61", "Australia");
		countryCodes.put("+1", "Canada");

		// print all values
		for (String code : countryCodes.keySet()) {
			System.out.println("country phone number code=" + code + ",country name=" + countryCodes.get(code));

		}
		// print all key values
		System.out.println(countryCodes.keySet());

		// put element if keys is not present or not
		System.out.println(" adding element="+countryCodes.putIfAbsent("+91", "india"));

		// check if key is present or not
		System.out.println("key is present or not="+countryCodes.containsKey("+1"));

		// size of map
		System.out.println("size of map=" + countryCodes.size());
		// get the values by key value
		System.out.println("values is =" + countryCodes.get("+81"));

	}

}
