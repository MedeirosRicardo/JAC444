package shapes;

/** This class creates a shape of type rectangle */
public class Rectangle implements Shape{
	
	/** rectangle's width and height */
	private double width;
	private double height;
	
	/**
	 * Constructor accepts two double for width and height
	 * @param width A positive double representing the width of the rectangle
	 * @param height A positive double representing the height of the rectangle
	 * @throws RectangleException Throws a message if data is no valid
	 */
	public Rectangle(double width, double height) throws RectangleException {
		if (width > 0 && height > 0) {
			this.width = width;
			this.height = height;
		} else {
			throw new RectangleException("Invalid data!");
		}
	}
	
	// Setters
	public void setWidth(double width) throws RectangleException {
		if (width > 0) {
			this.width = width;
		} else {
			throw new RectangleException("Invalid width!");
		}
	}
	
	public void setHeight(double height) throws RectangleException {
		if (height > 0) {
			this.height = height;
		} else {
			throw new RectangleException("Invalid height!");
		}
	}
	
	// Getters
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	/**
	 * Calculate the perimeter of the rectangle
	 * @return a double indicating the perimeter of the rectangle
	 */
	@Override
	public double calculatePerimeter() {
		// Rectangle perimeter = 2.w + 2.h
		return 2 * width + 2 * height;
	}
	
	/**
	 * Returning a string representing the rectangle
	 * @return a string representing the rectangle
	 */
	@Override
	public String toString() {
		return this.getClass().getName() + "{w=" + getWidth() + ", h=" + getHeight() + "} perimeter = " + calculatePerimeter();
	}
}
