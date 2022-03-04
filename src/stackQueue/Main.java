package stackQueue;

public class Main {

	public static void main(String[] args) {
		/*
		 * creating Object an Oject and Calling method to push value to stack calling 
		 * method to display value of stack
		 */

		/*
		 * creating Object an Oject
		 */
		Node stack = new Node();
		/*
		 * Calling method to push value to stack
		 */
		stack.push(70);
		stack.push(30);
		stack.push(56);
		/*
		 * calling method to display value of stack
		 */
		stack.displayStack();
		stack.pop();
		stack.displayStack();
		
	}

}