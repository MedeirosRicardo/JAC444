package object.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/** A swing based class that deserializes and reads students objects from a file */
public class VisualDeserialize extends Student {

	// Main
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// Labels that will display file information		
		final JLabel stdIDLabel;
		final JLabel firstNameLabel;
		final JLabel lastNameLabel;
		final JLabel coursesLabel;
		
		// Read object from file
		File f = new File("objectOutput.bin");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// Create object from file
		Student newStudent = (Student) ois.readObject();
		
		// Close file reader
		ois.close();
		
		// Create and setup JFrame
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.setVisible(true);
		
		// Set values to labels and append to JFrame
		stdIDLabel = new JLabel("Student ID: " + newStudent.getStdID());
		frame.add(stdIDLabel);
		
		firstNameLabel = new JLabel("Student First Name: " + newStudent.getFirstName());
		frame.add(firstNameLabel);
		
		lastNameLabel = new JLabel("Student Last Name: " + newStudent.getLastName());
		frame.add(lastNameLabel);
		
		coursesLabel = new JLabel("Courses: " + newStudent.getCourses());
		frame.add(coursesLabel);
		
	}
	
	
}
