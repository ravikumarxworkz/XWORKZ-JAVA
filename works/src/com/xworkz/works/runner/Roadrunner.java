package com.xworkz.works.runner;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.xworkz.works.dto.RoadDto;

public class Roadrunner {
	
	
	public static void main(String[] args) {
		
		 LinkedList<RoadDto> roadList = new LinkedList<>();

	        // Insert 20 RoadDto instances with different road details
	        roadList.add(new RoadDto("Main Street", 5.3, "City A"));
	        roadList.add(new RoadDto("Highway 1", 25.6, "City B"));
	        roadList.add(new RoadDto("Broadway Avenue", 3.7, "City C"));
	        roadList.add(new RoadDto("Park Road", 8.2, "City D"));
	        roadList.add(new RoadDto("Ocean Boulevard", 12.5, "City E"));
	        roadList.add(new RoadDto("Sunset Boulevard", 7.9, "City F"));
	        roadList.add(new RoadDto("Riverfront Drive", 10.1, "City G"));
	        roadList.add(new RoadDto("Mountain View Road", 15.4, "City H"));
	        roadList.add(new RoadDto("Valley Lane", 6.8, "City I"));
	        roadList.add(new RoadDto("Forest Avenue", 4.6, "City J"));
	        roadList.add(new RoadDto("Lakeside Road", 9.3, "City K"));
	        roadList.add(new RoadDto("Hillside Avenue", 11.8, "City L"));
	        roadList.add(new RoadDto("Countryside Lane", 14.2, "City M"));
	        roadList.add(new RoadDto("Downtown Drive", 16.7, "City N"));
	        roadList.add(new RoadDto("Airport Parkway", 20.5, "City O"));
	        roadList.add(new RoadDto("Harbor Road", 18.9, "City P"));
	        roadList.add(new RoadDto("School Street", 2.5, "City Q"));
	        roadList.add(new RoadDto("Industrial Road", 6.2, "City R"));
	        roadList.add(new RoadDto("Market Avenue", 4.9, "City S"));
	        roadList.add(new RoadDto("University Boulevard", 13.6, "City T"));

	        
	        System.out.println("Sort by ascending order of road names:");
	        roadList.stream()
	                .sorted(Comparator.comparing(RoadDto::getRoadName))
	                .forEach(System.out::println);

	        System.out.println("\nSort by distinct order:");
	        roadList.stream()
	                .distinct()
	                .forEach(System.out::println);

	        System.out.println("\nOnly matched roads with length 5.3:");
	        roadList.stream()
	                .filter(road -> road.getLength() == 5.3)
	                .forEach(System.out::println);

	        System.out.println("\nMatched roads with 'Highway' in road name:");
	        List<RoadDto> filteredRoads = roadList.stream()
	                .filter(road -> road.getRoadName().contains("Highway"))
	                .collect(Collectors.toList());
	        filteredRoads.forEach(System.out::println);

	        System.out.println("\nStarts with 'B':");
	        List<RoadDto> startsWithB = roadList.stream()
	                .filter(road -> road.getRoadName().startsWith("B"))
	                .collect(Collectors.toList());
	        startsWithB.forEach(System.out::println);

	        System.out.println("\nEnds with 't':");
	        List<RoadDto> endsWithT = roadList.stream()
	                .filter(road -> road.getRoadName().endsWith("t"))
	                .collect(Collectors.toList());
	        endsWithT.forEach(System.out::println);

	        Optional<RoadDto> firstRoad = roadList.stream()
	                .filter(road -> road.getRoadName().equalsIgnoreCase("Main Street"))
	                .findFirst();
	        System.out.println("\nFirst road with name 'Main Street': " + firstRoad.orElse(null));

	        Optional<RoadDto> anyRoad = roadList.stream()
	                .filter(road -> road.getRoadName().equalsIgnoreCase("Broadway Avenue"))
	                .findAny();
	        System.out.println("\nAny road with name 'Broadway Avenue': " + anyRoad.orElse(null));

	        boolean allMatch = roadList.stream().allMatch(road -> road.getLength() > 0);
	        System.out.println("\nAll roads have length greater than 0: " + allMatch);
	    
	}

}
