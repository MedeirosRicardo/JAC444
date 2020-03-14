package functionalStudent;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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
		System.out.println("\nTask 2:");
		System.out.println("Students who got 50.0-100.0 sorted by grade:");
		list.stream()
			.filter(s -> s.getGrade() >= 50 && s.getGrade() <= 100)
			.sorted(Comparator.comparing(Student::getGrade))
			.forEach(System.out::println);
		
		// Task 3
		System.out.println("\nTask 3:\n");
		System.out.println("First Student who got 50.0-100.0:");
		Optional<Student> student = list.stream()
			.filter(s -> s.getGrade() >= 50 && s.getGrade() <= 100)
			.findFirst();
		System.out.println(student.get());
		
		// Task 4
		System.out.println("\nTask 4:\n");
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
		System.out.println("\nTask 5:\n");
		System.out.println("Unique Student last names:");
		list.stream()
			.sorted(Comparator.comparing(Student::getLastName))
			.map(Student::getLastName)
			.distinct()
			.forEach(System.out::println);
		
		// Task 6
		System.out.println("\nTask 6:\n");
		System.out.println("Student names in order by last name then first name:");
		list.stream()
			.sorted(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName))
			.map(Student::getName)
			.forEach(System.out::println);
		
		
		
	}

}
