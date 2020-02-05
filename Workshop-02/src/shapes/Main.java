package shapes;

import java.io.*;

/** This class is used to read from file, create logic, and run the program */
public class Main {

	public static void main(String[] args) throws ParallelogramException {

		/** Data structure to hold created shapes */
		Shape shapes[] = new Shape[50];
		int count = 0;

		/**
		 * Method that reads a file line by line
		 */
		try (BufferedReader br = new BufferedReader(new FileReader("shapes.txt"))) {
			
			// String that holds current line
			String s;
			while ((s = br.readLine()) != null) {
				
				// Array that split current line
				String[] tokens = s.split(",");

				// Circle
				if (tokens[0].equals("Circle") && tokens.length == 2) {
					try {
						shapes[count] = new Circle(Double.parseDouble(tokens[1]));
						count++;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				
				// Triangle
				else if (tokens[0].equals("Triangle") && tokens.length == 4) {
					try {
						shapes[count] = new Triangle(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
						count++;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				
				// Square
				else if (tokens[0].equals("Square") && tokens.length == 2) {
					try {
						shapes[count] = new Square(Double.parseDouble(tokens[1]));
						count++;
					} catch (Exception e) {
						System.out.println("Invalid side!");
					}
				}
				
				// Parallelogram
				else if (tokens[0].equals("Parallelogram") && tokens.length == 3) {
					try {
						shapes[count] = new Parallelogram(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
						count++;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				
				// Rectangle
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
		
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			System.out.println(shapes[i].toString());
		}
	}
}