package shapes;

import java.io.*;

/** This class is used to read from file, create logic, and run the program */
public class Main {

	public static void main(String[] args) throws ParallelogramException {

		/** Data structure to hold created shapes */
		Shape shapes[] = new Shape[50];
		int count = 0;

		// Read from file
		try (BufferedReader br = new BufferedReader(new FileReader("shapes.txt"))) {

			String s;
			while ((s = br.readLine()) != null) {
				String[] tokens = s.split(",");

				
					if (tokens[0].equals("Circle")) {
						try {
							shapes[count] = new Circle(Double.parseDouble(tokens[1]));
							count++;
						} catch (CircleException e) {
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