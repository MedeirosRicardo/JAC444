package functionalStudent;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentProcess {
	
	// Array of Student
	private static Student[] students = {
		new Student("Jack", "Smith", 50.0, "IT"),
		new Student("Aaron", "Johnson", 76.0, "IT"),
		new Student("Maaria", "White", 35.8, "Business"),
		new Student("John", "White", 47.0, "Media"),
		new Student("Laney", "White", 62.0, "IT"),
		new Student("Jack", "Jones", 32.9, "Business"),
		new Student("Wesley", "Jones", 42.89, "Media")
	};
	
	// Main
	public static void main(String[] args) {
		
		// Task 1
		System.out.println("Task 1");
		List<Student> list = Arrays.asList(students);
		list.forEach(System.out::println);
		
		// Task 2
		System.out.println("\nTask 2");
		List<Student> stream = list.stream()
				.filter(ss -> ss.getGrade() >= 50 && ss.getGrade() <= 100)
				.sorted(Comparator.comparing(Student::getGrade))
				.collect(Collectors.toList());
		stream.forEach(System.out::println);
	}

}
