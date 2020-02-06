package shapes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/** This class is used to read from file, create logic, and run the program */
public class Main {

	/**
	 * Main
	 * @param args
	 * @throws ParallelogramException Throw a message if input data is invalid
	 */
	public static void main(String[] args) throws ParallelogramException {

		/** Data structure to hold created shapes */
		Shape shapes[] = new Shape[50];
		int count = 0;
		
		/**
		 * Task 1
		 */
		System.out.println("------->JAC 444 Assignment 2 & 3<-------");
		System.out.println("------->Task 1 ... <-------");

		/**
		 * Method that reads a file line by line
		 */
		try (BufferedReader br = new BufferedReader(new FileReader("shapes.txt"))) {
			
			// String that holds current line
			String s;
			while ((s = br.readLine()) != null) {
				
				// Array that split current line
				String[] tokens = s.split(",");

				/**
				 * If Circle
				 * Validates input and calls circle's constructor
				 */
				if (tokens[0].equals("Circle") && tokens.length == 2) {
					try {
						shapes[count] = new Circle(Double.parseDouble(tokens[1]));
						count++;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				
				/**
				 * If Triangle
				 * Validates input and calls triangle's constructor
				 */
				else if (tokens[0].equals("Triangle") && tokens.length == 4) {
					try {
						shapes[count] = new Triangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
						count++;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				
				/**
				 * If Square
				 * Validates input and calls square's constructor
				 */
				else if (tokens[0].equals("Square") && tokens.length == 2) {
					try {
						shapes[count] = new Square(Double.parseDouble(tokens[1]));
						count++;
					} catch (Exception e) {
						System.out.println("Invalid side!");
					}
				}
				
				/**
				 * If Parallelogram
				 * Validates input and calls parallelogram's constructor
				 */
				else if (tokens[0].equals("Parallelogram") && tokens.length == 3) {
					try {
						shapes[count] = new Parallelogram(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
						count++;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				
				/**
				 * If Rectangle
				 * Validates input and calls rectangle's constructor
				 */
				else if (tokens[0].equals("Rectangle") && tokens.length == 3) {
					try {
						shapes[count] = new Rectangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
						count++;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		/**
		 * Task 1 output
		 */
		System.out.println();
		System.out.println(count + " shapes were created:");
		for (int i = 0; i < count; i++) {
			System.out.println(shapes[i]);
			System.out.println();
		}
		
		/**
		 * Task 2
		 */
		System.out.println("*********");
		double smallestTriangle = 10^6;
		double largestCircle = 0;
		int resultCount = 0;
		for (int i = 0; i < count; i++) {
			if (shapes[i].getClass().getSimpleName().contentEquals("Triangle")) {
				if (shapes[i].calculatePerimeter() < smallestTriangle) {
					smallestTriangle = shapes[i].calculatePerimeter();
				}
			}
			if (shapes[i].getClass().getSimpleName().contentEquals("Circle")) {
				if (shapes[i].calculatePerimeter() > largestCircle) {
					largestCircle = shapes[i].calculatePerimeter();
				}
			}
		}
		
		for (int i = 0; i < count; i++) {
			if (shapes[i].getClass().getSimpleName().contentEquals("Triangle")) {
				if (shapes[i].calculatePerimeter() == smallestTriangle) {
					resultCount++;
				}
			}
			if (shapes[i].getClass().getSimpleName().contentEquals("Circle")) {
				if (shapes[i].calculatePerimeter() == largestCircle) {
					resultCount++;
				}
			}
		}
		
		resultCount = count - resultCount;
		Shape resultShapes[] = new Shape[resultCount];
		int index = 0;
		for (int i = 0; i < count; i++) {
			if (shapes[i].getClass().getSimpleName().contentEquals("Triangle")) {
				if (shapes[i].calculatePerimeter() != smallestTriangle) {
					resultShapes[index] = shapes[i];
					index++;
				}
			}
			
			else if (shapes[i].getClass().getSimpleName().contentEquals("Circle")) {
				if (shapes[i].calculatePerimeter() != largestCircle) {
					resultShapes[index] = shapes[i];
					index++;
				}
			}
			
			else {
				resultShapes[index] = shapes[i];
				index++;
			}
		}
		
		// Task2 output
		for (int i = 0; i < resultCount; i++) {
			System.out.println(resultShapes[i]);
			System.out.println();
		}
		System.out.println("*********");
		
		/**
		 * Task 3
		 */
		double parallelogramTotalPerimeter = 0;
		double triangleTotalPerimeter = 0;
		for (int i = 0; i < resultCount; i ++) {
			if (resultShapes[i].getClass().getSimpleName().contentEquals("Triangle")) {
				triangleTotalPerimeter += resultShapes[i].calculatePerimeter();
			}
			
			if (resultShapes[i].getClass().getSimpleName().contentEquals("Parallelogram")) {
				parallelogramTotalPerimeter += resultShapes[i].calculatePerimeter();
			}
		}
		
		// Task 3 output
		System.out.println("------->Task 3 ... <-------");
		System.out.println("Total perimeter of Parallelogram is: " + parallelogramTotalPerimeter);
		System.out.println("Total perimeter of Triangle is: " + triangleTotalPerimeter);
	}
}