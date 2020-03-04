package shapes;

import java.text.DecimalFormat;

/** This class creates a shape of type rectangle */
public class Rectangle extends Parallelogram {
		
	/**
	 * Constructor accepts two double for width and height
	 * @param width A positive double representing the width of the rectangle
	 * @param height A positive double representing the height of the rectangle
	 * @throws ParallelogramException Throws a message if data is not valid
	 */
	public Rectangle(double width, double height) throws ParallelogramException {
		super(width, height);
	}
	
	/**
	 * Returning a string representing the rectangle
	 * @return a string representing the rectangle
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName() + " {w=" + getWidth() + ", h=" + getHeight() 
			+ "} perimeter = " + new DecimalFormat("0.00000").format(calculatePerimeter())
			+ " area = " + new DecimalFormat("0.00000").format(calculateArea(getWidth(), area));
	}
	
	// Workshop 6
	/**
	 * Calculate the area of the rectangle
	 * @return a double indicating the area of the rectangle
	 */
	public double calculateArea(double area, ShapeArea s) {
		return s.calculateArea(area);
	}
	
	ShapeArea area = width-> getWidth() * getHeight();

}
