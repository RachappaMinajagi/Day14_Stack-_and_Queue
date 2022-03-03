package stackQueue;

public class Stack {
	Node head;

	class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
		}
	}
	/*
	 * addFirst - To add the elements in stack
	 * display - To print the output 
	 */

	/*
	 * Method to add elements
	 */
	public void addFirst(Object data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	/*
	 * Method to Displaying num of elements
	 */
	public void display() {
		if (head == null) {
			System.out.println("No elements to display");
		} else {
			Node temp = head;
			while (temp.next != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
}
