package com.xworkz.cards.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Cards {
	
	
	public static void main(String[] args) {
		
		
		Collection collection=new ArrayList();
		collection.add("hearts");
		collection.add("club");
		collection.add("dimonda");
		collection.add("king");
		
		System.out.println("checking list is empty="+collection.isEmpty());
		
		System.out.println("checking contains="+collection.contains("queen"));
		
		System.out.println("size of collection="+collection.size());
		
		collection.remove("king");
		
		System.out.println(collection);
		
		
		Collection c=new ArrayList();
		c.add("king");
		c.add("black");
		c.addAll(collection);
		c.add("jack");
		
		System.out.println(c);
		System.out.println("size of c="+collection.size());
		System.out.println("collection list "+c.containsAll(collection));
		 
		c.removeAll(collection);
		System.out.println("after removeAll"+c);
		
		System.out.println(c.retainAll(collection));
		
		System.out.println(c);
	}
}
