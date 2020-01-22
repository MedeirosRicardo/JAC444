// Name: Ricardo Medeiros
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
	private char[] stack = new char[0];
		
	// Create a method that dynamically add data into stack
	public void push(char data) {
		char[] newStack = new char[stack.length + 1];
		for (int i = 0; i < stack.length; i++) {
			newStack[i] = stack[i];
		}
		stack = newStack;
		stack[stack.length - 1] = data;
	}
	
	// Create a method that dynamically remove data from stack
	public char pop() {
		char temp = stack[stack.length - 1];
		char[] newStack = new char[stack.length - 1];
		for (int i = 0; i < stack.length - 1; i++) {
			newStack[i] = stack[i];
		}
		stack = newStack;
		return temp;
	}
	
	// Create a method that shows stack
	public void show() {
		for (int i = 0; i < stack.length; i++) {
			System.out.print(stack[i]);
		}
	}
	
}