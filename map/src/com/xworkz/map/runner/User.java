package com.xworkz.map.runner;

import java.util.Collection;
import java.util.HashMap;

public class User {

	public static void main(String[] args) {
		HashMap<String, String> userMap = new HashMap<>();
		userMap.put("john11@gmail.com", "John Doe");
		userMap.put("smith15@gmail.com", "Jane Smith");
		userMap.put("aliceJohnson@gmail.com", "Alice Johnson");
		userMap.put("bob4@gmail.com", "Bob Brown");
		userMap.put("emliy555@gmail.com", "Emily Wilson");
		userMap.put("lee777@gmail.com", "David Lee");
		userMap.put("taylor333@gmail.com", "Sarah Taylor");
		userMap.put("clark8@gmail.com", "Michael Clark");
		userMap.put("laura9@gmail.com", "Laura Anderson");
		userMap.put("evans1@example.com", "Chris Evans");

		
	      // print all values
		for (String user : userMap.keySet()) {

			System.out.println("user email id+" + user + ", user name " + userMap.get(user));

		}

		// printing all key values only

		Collection<String> keys = userMap.keySet();
		System.out.println("keys values" + keys);

		// put element if keys is not present or not
		userMap.putIfAbsent("venki78@gmail.com", "venki yoyo");

		System.out.println(userMap);
		// check if key is present or not
		System.out.println("keys is persent or not=" + userMap.containsKey("venki78@gmail.com"));

		// print size of the map
		System.out.println("size of the map =" + userMap.size());
		// get value by key
		System.out.println("get the value by key=" + userMap.get("bob4@gmail.com"));

	}

}
