package com.java.stack.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// to implement Stack using Queues
public class StackUsingQueues {
	
	Queue<Integer> queue1 = new LinkedList<Integer>();
	Queue<Integer> queue2 = new LinkedList<Integer>();
	List<Integer> list = new ArrayList<Integer>();
	// Stack Operations
	
	// to implement a push operation using two queues by making push operation costly
	public void push(int element) {
		if(queue1.isEmpty()) {
			queue1.add(element);
		} else {
			while(!queue1.isEmpty()) {
				queue2.add(queue1.poll());
			}
			queue1.add(element);
			while(!queue2.isEmpty()) {
				queue1.add(queue2.poll());
			}
		}
	}
	
	// to implement the pop operation using queue
	public int pop() throws RuntimeException {
		if(queue1.isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return queue1.poll();
	}
	
	// Auxiliary Operations
	
	// to get the last inserted element without removing it
	public int getTop() throws RuntimeException{
		if(queue1.isEmpty())
			throw new RuntimeException("Stack is Empty");
		return queue1.peek();
	}
	
	// to get the size of the stack
	public int size() {
		return queue1.size();
	}
	
	// to check if the stack is empty or not
	public boolean isEmptyStack() {
		if(queue1.isEmpty()) {
			return true;
		}
		return false;
	}
	
	// to give the string representation of the stack or to print all the the elements of the stack
	public String toStackString() {
		// to clear out the previous elements added in the list
		list.clear();
	
		list.addAll(queue1);
		Collections.reverse(list);
		return list.toString();
	}
}
