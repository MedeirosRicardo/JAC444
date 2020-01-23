// Name: Ricardo Medeiros - 44
// Seneca Student ID: 135745180
// Seneca email: rmedeiros7@myseneca.ca
// Date of completion: 2020-01-20
//
// I confirm that the content of this file is created by me,
//   with the exception of the parts provided to me by my professor.
//
// Workshop 1
// Stack.java

public class Stack {

	// Create an array to hold the stack
	private char[] stack;
	private int top;
	
	// Constructor
	public Stack(int size) {
		stack = new char[size];
		top = -1;
	}
	
	// Create a method that add data into stack
	public void push(char data) {
		stack[++top] = data;
	}

	// Create a method that remove data from stack
	public char pop() {
		return stack[top--];
	}
	
}