package com.xworkz.map.runner;

import java.util.Collection;
import java.util.HashMap;

public class Bank {

	public static void main(String[] args) {

		HashMap<Integer, String> accountMap = new HashMap<>();
		accountMap.put(123456789, "John Doe");
		accountMap.put(987654321, "Jane Smith");
		accountMap.put(456789123, "Alice Johnson");
		accountMap.put(789123456, "Bob Brown");
		accountMap.put(321654987, "Emily Wilson");
		accountMap.put(654321789, "David Lee");
		accountMap.put(987321456, "Sarah Taylor");
		accountMap.put(321789456, "Michael Clark");
		accountMap.put(456987123, "Laura Anderson");
		accountMap.put(789654321, "Chris Evans");

		// print all values
		for (Integer number : accountMap.keySet()) {

			System.out.println("account number+" + number + ", user name " + accountMap.get(number));

		}

		// printing all key values only

		Collection<Integer> keys = accountMap.keySet();
		System.out.println("keys values" + keys);

		// put element if keys is not present or not
		accountMap.putIfAbsent(999999, "soma");

		System.out.println(accountMap);
		// check if key is present or not
		System.out.println("keys is persent or not=" + accountMap.containsKey(789123456));

		// print size of the map
		System.out.println("size of the map =" + accountMap.size());
		// get value by key
		System.out.println("get the value by key=" + accountMap.get(789123456));
	}

}
