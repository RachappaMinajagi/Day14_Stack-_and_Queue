package stackQueue;

public class Node {
	/*
	 * creating Object
	 */
	Stack List = new Stack();
	
	/*
	 * calling method through object
	 */
	public void push(Object data) {
		List.addFirst(data);
	}

	/*
	 * calling method to display value in linkedList/stack
	 */
	public void displayStack() {
			List.display();
	}
}