package stackQueue;

public class Main {

	public static void main(String[] args) {
		/*
		 * creating Object 
		 * Calling method to add value at first
		 * calling method to display value of queue
		 */
		
		/*
		 * creating Object an Oject
		 */
		Queue queue = new Queue();
		/*
		 *Calling method to add
		 */
			queue.enque(56);
			queue.enque(30);
			queue.enque(70);
			
		/*
		 * calling method to display value of stack
		 */
		queue.displayQueue();
		
		/*
		 * Deleting the values of the Stack 56,30,70
		 * then Stack is empty
		 */
		queue.deque();
		queue.deque();
		queue.deque();
	}

}