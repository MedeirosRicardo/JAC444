package functionalStudent;

import java.text.DecimalFormat;

public class Student {
	
	// Fields
	private String firstName;
	private String lastName;
	private double grade;
	private String department;
	
	// Constructor
	public Student(String firstName, String lastName, double grade, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.department = department;
	}
	
	// Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	// Getters
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public double getGrade() {
		return this.grade;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	// GetName - return full name
	public String getName() {
		return this.firstName + " " + this.lastName;
	}
	
	// ToString
	@Override
	public String toString() {
		return getFirstName() + "\t" + getLastName() + "\t\t" 
				+ new DecimalFormat("0.00").format(getGrade()) + "\t"
				+ getDepartment();
	}
	
	// Equals
	public boolean equals(Student obj) {
		/*if (this === obj) {
			return true;
		}*/
		
		return this.getFirstName() == obj.getFirstName() && this.getLastName() == obj.getLastName()
				&& this.getGrade() == obj.getGrade() && this.getDepartment() == obj.getDepartment();
	}

}
