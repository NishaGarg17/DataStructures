package com.java.queue.impl;

import java.util.Stack;

//to implement Queue using two stacks having enQueue is of O(1) and deQueue is of O(n)
public class QueueUsingStacks1 {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	// to insert an element at rear of the queue
	public void enQueue(int element) {
		stack1.push(element);
	}

	// to delete an element from the front of the queue
	public int deQueue() throws RuntimeException {
		if (stack1.isEmpty() && stack2.isEmpty()) {
			throw new RuntimeException("OOPS! Queue is Empty!");
		} else if(stack2.empty() && !stack1.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}

	// to get the front of the queue without removing it
	public int getFront() throws RuntimeException {
		if (stack1.isEmpty() && stack2.isEmpty()) {
			throw new RuntimeException("OOPS! Queue is Empty!");
		} else if(stack2.isEmpty() && !stack1.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.peek();
	}

	// to get the size of the queue
	public int getSize() throws RuntimeException {
		if (stack1.isEmpty() && stack2.isEmpty()) {
			throw new RuntimeException("OOPS! Queue is Empty!");
		} else if (stack2.isEmpty() && !stack1.isEmpty()) {
			return stack1.size();
		} else if(stack1.isEmpty() && !stack2.isEmpty()) {
			return stack2.size();
		} 
			return stack1.size() + stack2.size();
	}

	// to check if empty queue
	public boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}

	// to print the queue in a String form
	public String toString() {
		System.out.println("Stack1: " + stack1.toString());
		System.out.println("Stack2: " + stack2.toString());
		String result = "[";
		for(int i = stack2.size()-1; i >= 0; i--) {
			
			if(stack1.isEmpty() && i == 0) {
				result = result + stack2.get(i);
			} else {
				result = result + stack2.get(i) + ",";
			}
		}
		for (int i = 0; i < stack1.size(); i++) {
			if (i == stack1.size() - 1) {
				result = result + stack1.get(i);
			} else {
				result = result + stack1.get(i) + ",";
			}
		}
		result = result + "]";

		return result;
	}


}
