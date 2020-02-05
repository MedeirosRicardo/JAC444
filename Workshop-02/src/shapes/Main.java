package shapes;

import java.io.*;

/** This class is used to read from file, create logic, and run the program */
public class Main {

	// Read from file
	private static void taskOne() {
		
		try (BufferedReader br = new BufferedReader(new FileReader("shapes.txt"))) {
			
			/** Fields that hold shapes properties */
						
			String s;
			while ((s = br.readLine()) != null) {
				String[] tokens = s.split(",");
				
				if (tokens[0] == "Circle") {
					
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) throws ParallelogramException {
		Shape c1 = new Square(12);
		String test = c1.toString();
		System.out.println(test);
	}
	
}
