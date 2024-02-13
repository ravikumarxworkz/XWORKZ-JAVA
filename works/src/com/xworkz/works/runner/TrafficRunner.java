package com.xworkz.works.runner;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Optional;

import com.xworkz.works.dto.TrafficDto;

public class TrafficRunner {

	public static void main(String[] args) {
		LinkedList<TrafficDto> trafficList = new LinkedList<>();

		trafficList.add(new TrafficDto("New York", "High", "Accident on Main Street", "2018-09-9 08:30"));
		trafficList.add(new TrafficDto("Los Angeles", "Medium", "Road construction on Highway 1", "2020-10-12 09:15"));
		trafficList.add(new TrafficDto("Chicago", "Low", "Traffic congestion on Broadway Avenue", "2024-05-1 10:00"));
		trafficList.add(new TrafficDto("Houston", "High", "Vehicle breakdown on I-45", "2023-12-11 10:30"));
		trafficList.add(new TrafficDto("Phoenix", "Medium", "Lane closure on Loop 101", "2024-03-15 11:00"));
		trafficList.add(new TrafficDto("Philadelphia", "Low", "Minor accident on Market Street", "2016-01-21 11:30"));
		trafficList.add(new TrafficDto("San Antonio", "High", "Major road construction on I-10", "2017-10-31 12:00"));
		trafficList.add(new TrafficDto("San Diego", "Medium", "Traffic jam on I-5", "2023-02-28 12:30"));
		trafficList.add(new TrafficDto("Dallas", "Low", "Traffic signal malfunction on US-75", "2020-08-19 13:00"));
		trafficList.add(new TrafficDto("San Jose", "High", "Serious accident on CA-85", "2022-05-26 13:30"));
		trafficList.add(new TrafficDto("Austin", "Medium", "Construction work on Mopac Expressway", "2024-02-10 14:00"));
		trafficList.add(new TrafficDto("Jacksonville", "Low", "Vehicle fire on I-95", "2024-02-10 14:30"));
		trafficList.add(new TrafficDto("Fort Worth", "High", "Overturned truck on I-30", "2024-02-10 15:00"));
		trafficList.add(new TrafficDto("Columbus", "Medium", "Heavy traffic on I-70", "2024-02-10 15:30"));
		trafficList.add(new TrafficDto("Charlotte", "Low", "Minor accident on I-77", "2024-02-10 16:00"));
		trafficList.add(new TrafficDto("San Francisco", "High", "Police activity on US-101", "2024-02-10 16:30"));
		trafficList.add(new TrafficDto("Indianapolis", "Medium", "Lane closure on I-465", "2024-02-10 17:00"));
		trafficList.add(new TrafficDto("Seattle", "Low", "Traffic congestion on I-5", "2024-02-10 17:30"));
		trafficList.add(new TrafficDto("Denver", "High", "Major accident on I-25", "2024-02-10 18:00"));
		trafficList.add(new TrafficDto("Washington", "Medium", "Road closure on I-495", "2024-02-10 18:30"));

		System.out.println("Sort by ascending order of Location:");
		trafficList.stream().sorted(Comparator.comparing(TrafficDto::getLocation)).forEach(System.out::println);

		System.out.println("\nSort by distinct order:");
		trafficList.stream().distinct().forEach(System.out::println);

		System.out.println("\nOnly matched traffic with severity is high");
		trafficList.stream().filter(TrafficDto -> TrafficDto.getSeverity().equalsIgnoreCase("LOW"))
				.forEach(System.out::println);
		System.out.println("\nStarts with 'S':");
		trafficList.stream().filter(TrafficDto -> TrafficDto.getLocation().startsWith("S"))
				.forEachOrdered(System.out::println);
		System.out.println("\nEnds with 'e':");
		trafficList.stream().filter(TrafficDto -> TrafficDto.getLocation().endsWith("e"))
				.forEachOrdered(System.out::println);

		Optional<TrafficDto> firestSeverity = trafficList.stream()
				.filter(TrafficDto -> TrafficDto.getSeverity().equalsIgnoreCase("high")).findFirst();

		System.out.println("\nFirst irestSeverity with name 'high': " + firestSeverity.orElse(null));

		Optional<TrafficDto> anytime = trafficList.stream()
				.filter(TrafficDto -> TrafficDto.getTimestamp().contains("2024")).findAny();

		System.out.println("\nFirst irestSeverity with name 'high': " + anytime.orElse(null));

		boolean allmatch = trafficList.stream().allMatch(TrafficDto -> TrafficDto.getTimestamp().contains("20"));

		System.out.println("all trattic time cantains '20'=" + allmatch);

	}
}
