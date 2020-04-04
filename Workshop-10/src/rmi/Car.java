package rmi;

import java.io.Serializable;

/** This class creates an object of type car */
public class Car implements Serializable {
	private String model;
	private String color;
	private int mileage;
	private String plate;
	
	/**
	 * 3 parameters constructor
	 * @param model Receives a string with car's model
	 * @param color Receives a string with car's color
	 * @param mileage Receives an integer with car's mileage
	 */
	public Car(String model, String color, int mileage) {
		this.model = model;
		this.color = color;
		this.mileage = mileage;
		this.plate = "undefined";
	}
	
	// Setters
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public void setPlate(String plate) {
		this.plate = plate;
	}
	
	// Getters
	public String getModel() {
		return this.model;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getMileage() {
		return this.mileage;
	}
	
	public String getPlate() {
		return this.plate;
	}
	
	public String toString() {
		return "CAR" + "\nModel: " + getModel() + "\nColor: " + getColor() + "\nMileage: "
				+ getMileage() + "\nPlate: " + getPlate();
	}

}
