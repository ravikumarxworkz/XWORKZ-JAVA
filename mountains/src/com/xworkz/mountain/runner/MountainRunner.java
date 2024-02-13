<<<<<<< HEAD
package com.xworkz.mountain.runner;

import java.util.Stack;

import com.xworkz.mountains.dto.MountainDto;

public class MountainRunner {

	public static void main(String[] args) {
		MountainDto dto = new MountainDto("K2", 8611, 340, "INDIA");
		MountainDto dto1 = new MountainDto("MT Everst", 8848, 350, "NEPAL-CHINA");
		MountainDto dto2 = new MountainDto("ALPHA", 420, 80, "canada");
		MountainDto dto3 = new MountainDto("ROCKY mountain", 4500, 150, "north america");
		MountainDto dto4 = new MountainDto("muliyana giri", 1693, 10, "india");
		MountainDto dto5 = new MountainDto("javed hills", 1493, 10, "india");
		MountainDto dto6 = new MountainDto("javed hills", 1493, 10, "india");

		Stack<MountainDto> stack = new Stack<MountainDto>();

		stack.add(dto);
		stack.add(dto1);
		stack.add(dto2);
		stack.add(dto3);
		stack.push(dto4);///////////////////////////////////////////1
		stack.addElement(dto5);
		for (MountainDto mountainDto : stack) {
			System.out.println(mountainDto);
		}
		System.out.println("================================");
		System.out.println(stack.elementAt(2));
		System.out.println("================================");

		System.out.println("delete all=" + stack.pop());///////////////////2
		System.out.println("================================");

		for (MountainDto mountainDto : stack) {
			System.out.println(mountainDto);
		}
		System.out.println("================================");
		System.out.println("peek=" + stack.peek());/////////////////3
		System.out.println("================================");
		for (MountainDto mountainDto : stack) {
			System.out.println(mountainDto);
		}
		System.out.println("================================");

		System.out.println("empty method=" + stack.empty());///////////4

		System.out.println("================================");
		
		System.out.println("searching object"+stack.search(dto6));///////////5

	}

}
=======
package com.xworkz.mountain.runner;

import java.util.Stack;

import com.xworkz.mountains.dto.MountainDto;

public class MountainRunner {

	public static void main(String[] args) {
		MountainDto dto = new MountainDto("K2", 8611, 340, "INDIA");
		MountainDto dto1 = new MountainDto("MT Everst", 8848, 350, "NEPAL-CHINA");
		MountainDto dto2 = new MountainDto("ALPHA", 420, 80, "canada");
		MountainDto dto3 = new MountainDto("ROCKY mountain", 4500, 150, "north america");
		MountainDto dto4 = new MountainDto("muliyana giri", 1693, 10, "india");
		MountainDto dto5 = new MountainDto("javed hills", 1493, 10, "india");
		MountainDto dto6 = new MountainDto("javed hills", 1493, 10, "india");

		Stack<MountainDto> stack = new Stack<MountainDto>();

		stack.add(dto);
		stack.add(dto1);
		stack.add(dto2);
		stack.add(dto3);
		stack.push(dto4);///////////////////////////////////////////1
		stack.addElement(dto5);
		for (MountainDto mountainDto : stack) {
			System.out.println(mountainDto);
		}
		System.out.println("================================");
		System.out.println(stack.elementAt(2));
		System.out.println("================================");

		System.out.println("delete all=" + stack.pop());///////////////////2
		System.out.println("================================");

		for (MountainDto mountainDto : stack) {
			System.out.println(mountainDto);
		}
		System.out.println("================================");
		System.out.println("peek=" + stack.peek());/////////////////3
		System.out.println("================================");
		for (MountainDto mountainDto : stack) {
			System.out.println(mountainDto);
		}
		System.out.println("================================");

		System.out.println("empty method=" + stack.empty());///////////4

		System.out.println("================================");
		
		System.out.println("searching object"+stack.search(dto6));///////////5

	}

}
>>>>>>> ea7c79754783f3ea05204dc87cb337451f20de71
