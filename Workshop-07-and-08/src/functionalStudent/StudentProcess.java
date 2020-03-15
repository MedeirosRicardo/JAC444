// Name: Ricardo Medeiros - 44
// Seneca Student ID: 135745180
// Seneca email: rmedeiros7@myseneca.ca
// Date of completion: 2020-03-11
//
// I confirm that the content of this file is created by me,
//   with the exception of the parts provided to me by my professor.
//
// Workshop 7-8
// StudentProcess.java

package functionalStudent;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
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
		System.out.println("Task 1:\n");
		System.out.println("Complete Student list:");
		List<Student> list = Arrays.asList(students);
		list.forEach(System.out::println);
		
		// Task 2
		System.out.println("\n\nTask 2:");
		System.out.println("Students who got 50.0-100.0 sorted by grade:");
		list.stream()
			.filter(s -> s.getGrade() >= 50 && s.getGrade() <= 100)
			.sorted(Comparator.comparing(Student::getGrade))
			.forEach(System.out::println);
		
		// Task 3
		System.out.println("\n\nTask 3:\n");
		System.out.println("First Student who got 50.0-100.0:");
		Optional<Student> student = list.stream()
			.filter(s -> s.getGrade() >= 50 && s.getGrade() <= 100)
			.findFirst();
		System.out.println(student.get());
		
		// Task 4
		System.out.println("\n\nTask 4:\n");
		System.out.println("Students in ascending order by last name then first:");
		list.stream()
			.sorted(Comparator.comparing(Student::getFirstName))
			.sorted(Comparator.comparing(Student::getLastName))
			.forEach(System.out::println);
		
		System.out.println("\nStudents in descending order by last name then first:");
		list.stream()
			.sorted(Comparator.comparing(Student::getFirstName).reversed())
			.sorted(Comparator.comparing(Student::getLastName).reversed())
			.forEach(System.out::println);
		
		// Task 5
		System.out.println("\n\nTask 5:\n");
		System.out.println("Unique Student last names:");
		list.stream()
			.sorted(Comparator.comparing(Student::getLastName))
			.map(Student::getLastName)
			.distinct()
			.forEach(System.out::println);
		
		// Task 6
		System.out.println("\n\nTask 6:\n");
		System.out.println("Student names in order by last name then first name:");
		list.stream()
			.sorted(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName))
			.map(Student::getName)
			.forEach(System.out::println);
		
		// Task 7
		System.out.println("\n\nTask 7:\n");
		System.out.println("Students by department:");
		Map<String, List<Student>> task7 = list.stream()
			.collect(Collectors.groupingBy(Student::getDepartment));
		task7.forEach((key, value) -> {
			System.out.println(key);
			value.forEach(System.out::println);
		});
		
		// Task 8
		System.out.println("\n\nTask 8:\n");
		System.out.println("Count of Students by department:");
		Map<String, Long> task8 = list.stream()
			.collect(Collectors.groupingBy(Student::getDepartment))
			.entrySet()
			.stream()
			.collect(Collectors.toMap(Map.Entry::getKey, value -> Long.valueOf(value.getValue().size())));
		new TreeMap<String, Long>(task8).forEach((key, value) -> {
			System.out.println(key + " has " + value + " Student(s)");
		});
		
		// Task 9
		System.out.println("\n\nTask 9:\n");
		System.out.println("Sum of Students' grades: " + list.stream()
		.mapToDouble(Student::getGrade)
		.summaryStatistics()
		.getSum());
		
	}

}
