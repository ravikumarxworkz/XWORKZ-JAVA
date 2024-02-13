package com.xworkz.works.runner;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Optional;

import com.xworkz.works.dto.WorksDto;

public class WorksRunner {

	public static void main(String[] args) {

		LinkedList<WorksDto> workList = new LinkedList<>();

		// Adding 20 instances of Work to the LinkedList
		workList.add(new WorksDto(1, "Task 1", "painting", "John", false));
		workList.add(new WorksDto(2, "Task 2", "cleaning", "Alice", true));
		workList.add(new WorksDto(3, "Task 3", "sweeping", "Bob", false));
		workList.add(new WorksDto(5, "Task 5", "cleaning bike", "soma", false));
		workList.add(new WorksDto(6, "Task 6", "teaching", "venki", true));
		workList.add(new WorksDto(7, "Task 7", "dancing", "basu", true));
		workList.add(new WorksDto(8, "Task 8", "prepare phoone", "manju", false));
		workList.add(new WorksDto(9, "Task 9", "washing cloth", "nimmi", true));
		workList.add(new WorksDto(10, "Task 10", "cleaning ", "sheetal", false));
		workList.add(new WorksDto(11, "Task 11", "cleaning bike", "sandeep", true));
		workList.add(new WorksDto(12, "Task 12", "teaching", "santhosh", true));
		workList.add(new WorksDto(13, "Task 13", "dancing", "sakshi", false));
		workList.add(new WorksDto(14, "Task 14", "devlop code", "John", true));
		workList.add(new WorksDto(15, "Task 15", "report", "Alice", true));
		workList.add(new WorksDto(16, "Task 16", "repare car", "bhaya", false));
		workList.add(new WorksDto(17, "Task 17", "wash dish", "amrut", false));
		workList.add(new WorksDto(18, "Task 18", "typing", "akasha", true));
		workList.add(new WorksDto(19, "Task 19", "dancing", "avin", false));
		workList.add(new WorksDto(20, "Task 20", "clean water tank", "sudheer", false));

		System.out.println("ascending order");
		workList.stream().sorted(Comparator.comparing(WorksDto::getAssignedTo)).forEach(System.out::println);

		System.out.println("only disctinct dtos");

		workList.stream().distinct().forEach(System.out::println);
		System.out.println("only matched dto");
		workList.stream().filter(WorksDto::isCompleted).forEach(System.out::println);

		System.out.println("only  with matched dto");
		workList.stream().filter(WorksDto -> WorksDto.getTitle().contains("star")).forEach(System.out::println);

		System.out.println("only  cantains 'a'");
		workList.stream().filter(WorksDto -> WorksDto.getTitle().contains("a")).forEach(System.out::println);

		System.out.println("only  startsWith 'a'");
		workList.stream().filter(WorksDto -> WorksDto.getAssignedTo().startsWith("a")).forEach(System.out::println);

		System.out.println("only  endwith 'd'");
		workList.stream().filter(WorksDto -> WorksDto.getAssignedTo().endsWith("d")).forEach(System.out::println);

		System.out.println("find first");
		Optional<WorksDto> find = workList.stream()
				.filter(WorksDto -> WorksDto.getAssignedTo().equalsIgnoreCase("soma")).findFirst();
		System.out.println("find name=" + find);

		System.out.println("find first");
		Optional<WorksDto> any = workList.stream().filter(WorksDto -> WorksDto.getAssignedTo().contains("a")).findAny();
		System.out.println("find any=" + any);

		System.out.println("all match");
		boolean t = workList.stream().allMatch(WorksDto -> WorksDto.getAssignedTo().endsWith("a"));

		System.out.println("all matches=" + t);

	}

}
