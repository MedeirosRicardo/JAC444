package object.serialization;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VisualSerialize extends Student {

	// Main
	public static void main(String[] args) {
		
		// Create and setup JFrame
		JFrame frame = new JFrame("Serializing object into file");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		// Create a JPanel that holds input fields
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
		frame.add(inputPanel);
		
		// Create label and textfield for student ID
		JLabel studentIDLabel = new JLabel("Student ID: ");
		JTextField studentIDText = new JTextField(10);
		inputPanel.add(studentIDLabel);
		inputPanel.add(studentIDText);
		
		// Create label and textfield for student first name
		JLabel studentFirstNameLabel = new JLabel("Student First Name: ");
		JTextField studentFirstNameText = new JTextField(20);
		inputPanel.add(studentFirstNameLabel);
		inputPanel.add(studentFirstNameText);
		
		// Create label and textfield for student last name
		JLabel studentLastNameLabel = new JLabel("Student Last Name: ");
		JTextField studentLastNameText = new JTextField(20);
		inputPanel.add(studentLastNameLabel);
		inputPanel.add(studentLastNameText);
		
		// Create label and textfield for student courses
		JLabel studentCoursesLabel = new JLabel("Student Courses (separeted by coma \",\"): ");
		JTextField studentCoursesText = new JTextField(30);
		inputPanel.add(studentCoursesLabel);
		inputPanel.add(studentCoursesText);
		
		// Creates a button that submits input information
		JButton submitButton = new JButton("SUBMIT");
		frame.add(submitButton);
		
		
		
		// JFrame setup
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
