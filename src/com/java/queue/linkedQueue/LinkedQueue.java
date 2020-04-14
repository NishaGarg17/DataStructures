package com.java.queue.linkedQueue;

public class LinkedQueue {
	ListNode front = null, rear = null;
	
	// to insert a new node in the list at the end
	public void enQueue(int data) {
		ListNode node = new ListNode(data);
		if(front == null && rear == null) {
			front = node;
		} else {
			rear.setNext(node);
		}
		rear = node;
	}
	
	// to delete a node from the beginning of the list
	public int deQueue() throws RuntimeException {
		if(front == null) {
			throw new RuntimeException("Overflow: Queue is empty!");
		} 
		int data = front.getData();
		front = front.getNext();
		return data;
	}
	
	// to get the size of the queue
	public int size() {
		int size = 0;
		ListNode currentNode = front;
		while(currentNode != null) {
			size ++;
			currentNode = currentNode.getNext();
		}
		return size;
	}
	
	// to check if the queue is empty
	public boolean isEmpty() {
		return (front == null);
	}
	
	// to get the front of the node
	public int front() throws RuntimeException {
		if(front == null) {
			throw new RuntimeException("OOPS! Queue is Empty");
		} 
		return front.getData();
	}
	
	// to print the String Representation of the Linked Queue
	public String toString() {
		String result = "[";
		ListNode currentNode = front;
		//System.out.println("data is: " + front.getData());
		while(currentNode != null) {
			if(currentNode.getNext() != null) {
				result = result + currentNode.getData() + ",";
			} else {
				result = result + currentNode.getData();
			}
			currentNode = currentNode.getNext();
		}
		result = result + "]";
		return result;
	}
}
