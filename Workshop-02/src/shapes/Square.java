package shapes;

import java.text.DecimalFormat;

/** This class creates a shape of type square */
public class Square implements Shape {

	/** square's size */
	private double size;
	
	/**
	 * Constructor accepts a double for the length
	 * @param size A positive double representing the length of the square
	 * @throws SquareException Throws a message if data is not valid
	 */
	public Square(double size) throws SquareException {
		if (size > 0) {
			this.size = size;
		} else {
			throw new SquareException("Invalid side!");
		}
	}
	
	// Setters
	public void setSize(double size) throws SquareException {
		if (size > 0) {
			this.size = size;
		} else {
			throw new SquareException("Invalid side!");
		}
	}
	
	// Getters
	public double getSize() {
		return size;
	}
	
	/**
	 * Calculate the perimeter of the square
	 * @return a double indicating the perimeter of the square
	 */
	@Override
	public double calculatePerimeter() {
		// Square perimeter = 4.s
		return 4 * size;
	}
	
	/**
	 * Returning a string representing the square
	 * @return a string representing the square
	 */
	@Override
	public String toString() {
		return "Square s=" + getSize() + "} perimeter = " + new DecimalFormat("#.#####").format(calculatePerimeter());
	}
}
