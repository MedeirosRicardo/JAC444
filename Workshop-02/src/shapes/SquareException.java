package shapes;

/** This class handles exceptions for the square class */
public class SquareException extends Exception {
	
	/**
	 * Constructor accepts a string for the message
	 * @param message A string representing the message
	 */
	public SquareException(String message) {
		super(message);
	}
}
