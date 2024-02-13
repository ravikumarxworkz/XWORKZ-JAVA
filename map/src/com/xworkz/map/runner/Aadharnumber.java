package com.xworkz.map.runner;

import java.util.HashMap;

public class Aadharnumber {

	public static void main(String[] args) {

		HashMap<Long, String> aadharMap = new HashMap<>();
		aadharMap.put(123452567890L, "soma huddar");
		aadharMap.put(234567368901L, "venki");
		aadharMap.put(345688789012L, "sandeeip sj");
		aadharMap.put(456789630123L, "ramesha");
		aadharMap.put(567890441234L, "santhosh");
		aadharMap.put(678903612345L, "ravkumar");
		aadharMap.put(789012783456L, "amrut");
		aadharMap.put(890123364567L, "manjula");
		aadharMap.put(901234536678L, "niramla");
		aadharMap.put(912355456789L, "virajitha");

		// print all values
		System.out.println(aadharMap);
		// all key keys printing
		System.out.println("all key values=" + aadharMap.keySet());
		// put element if keys is not present or not
		System.out.println(aadharMap.putIfAbsent(657348829632l, "sharanu"));
		// check if key is present or not
		System.out.println("keys is persent or not=" + aadharMap.containsKey(5678901234l));
		// check if value is present or not
		System.out.println("values is presnet="+aadharMap.containsValue("soma"));
		// print size of the map
		System.out.println("size of the map =" + aadharMap.size());
		// get value by key
		System.out.println("get the value by key=" + aadharMap.get(5678901234l));
	}

}
