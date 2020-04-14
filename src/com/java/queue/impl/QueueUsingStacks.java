package com.java.queue.impl;

import java.util.Stack;

// to implement Queue using two stacks having enQueue is of O(n) and deQueue is of O(1)
public class QueueUsingStacks {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	// to insert an element at rear of the queue
	public void enQueue(int element) {
		if (stack1.isEmpty()) {
			stack1.push(element);
		} else {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.peek());
				stack1.pop();
			}
			stack1.push(element);
			while (!stack2.isEmpty()) {
				stack1.push(stack2.peek());
				stack2.pop();
			}
		}
		// System.out.println(stack1.toString());
	}

	// to delete an element from the front of the queue
	public int deQueue() throws RuntimeException {
		if (stack1.isEmpty()) {
			throw new RuntimeException("OOPS! Queue is Empty!");
		}
		return stack1.pop();
	}

	// to get the front of the queue without removing it
	public int getFront() throws RuntimeException {
		if (stack1.isEmpty()) {
			throw new RuntimeException("OOPS! Queue is Empty!");
		}
		return stack1.peek();
	}

	// to get the size of the queue
	public int getSize() throws RuntimeException {
		if (stack1.isEmpty()) {
			throw new RuntimeException("OOPS! Queue is Empty!");
		}
		return stack1.size();
	}

	// to check if empty queue
	public boolean isEmpty() {
		return stack1.isEmpty();
	}

	// to print the queue in a String form
	public String toString() {

		String result = "[";
		for (int i = stack1.size() - 1; i >= 0; i--) {
			if (i == 0) {
				result = result + stack1.get(i);
			} else {
				result = result + stack1.get(i) + ",";
			}
		}
		result = result + "]";

		return result;
	}

}
