package functionalStudent;

import java.text.DecimalFormat;

/** This class creates objects of type Student */
public class Student {
	
	/** fields */
	private String firstName;
	private String lastName;
	private double grade;
	private String department;
	
	/**
	 * Constructor accepts 4 arguments
	 * @param firstName A string representing the student first name
	 * @param lastName A string representing the student last name
	 * @param grade A double representing the student grade
	 * @param department A string representing the student department
	 */
	public Student(String firstName, String lastName, double grade, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.department = department;
	}
	
	/** Setters */
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
	
	/** Getters */
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
	
	/**
	 * Return student full name
	 * @return A string representing student full name
	 */
	public String getName() {
		return this.firstName + " " + this.lastName;
	}
	
	/**
	 * Return a string representing the student object
	 * @return A string representing the student object
	 */
	@Override
	public String toString() {
		return getFirstName() + "\t" + getLastName() + "\t\t" 
				+ new DecimalFormat("0.00").format(getGrade()) + "\t"
				+ getDepartment();
	}
	
	/**
	 * Compare if student fields are equals
	 * @param obj A student object
	 * @return A boolean representing if student objects are equal
	 */
	public boolean equals(Student obj) {
		return this.getFirstName() == obj.getFirstName() && this.getLastName() == obj.getLastName()
			&& this.getGrade() == obj.getGrade() && this.getDepartment() == obj.getDepartment();
	}

}
