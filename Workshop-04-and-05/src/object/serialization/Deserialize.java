package object.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize extends Student {
	
	
	// Main
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// Read object from file
		File f = new File("objectOutput.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// Create object from file
		Student newStudent = (Student) ois.readObject();
		
		ois.close();
		
		// Print object data
		System.out.println(newStudent.getStdID());
		System.out.println(newStudent.getFirstName());
		System.out.println(newStudent.getLastName());
		System.out.println(newStudent.getCourses());
	}
	
}