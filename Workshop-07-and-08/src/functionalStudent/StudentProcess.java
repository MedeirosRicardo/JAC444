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
		System.out.println("Task 1");
		List<Student> list = Arrays.asList(students);
		list.forEach(System.out::println);
		
		// Task 2
		System.out.println("\nTask 2");
		list.stream()
			.filter(s -> s.getGrade() >= 50 && s.getGrade() <= 100)
			.sorted(Comparator.comparing(Student::getGrade))
			.forEach(System.out::println);
		
		// Task 3
		System.out.println("\nTask 3");
		Optional<Student> student = list.stream()
			.filter(s -> s.getGrade() >= 50 && s.getGrade() <= 100)
			.findFirst();
		System.out.println(student.get());
	}

}
