package rmi;

/** This class creates an object of type car */
public class Car {
	private String model;
	private String color;
	private int mileage;
	private String plate;
	
	
	public Car(String model, String color, int mileage) {
		this.model = model;
		this.color = color;
		this.mileage = mileage;
		this.plate = "";
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

}
