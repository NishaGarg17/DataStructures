package com.java.stack.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// to implement Stack using Queues
public class StackUsingQueues1 {
	
	Queue<Integer> queue1 = new LinkedList<Integer>();
	Queue<Integer> queue2 = new LinkedList<Integer>();
	List<Integer> list = new ArrayList<Integer>();
	// Stack Operations
	
	// to implement a push operation using two queues by making push operation of O(1)
	public void push(int element) {
		queue1.add(element);
	}
	
	// to implement the pop operation using queue by making pop operation costly O(n)
	public int pop() throws RuntimeException {
		if(queue1.isEmpty()) {
			throw new RuntimeException("OOPS! Stack is empty");
		}
		while(queue1.size() != 1) {
			queue2.add(queue1.poll());
		}
		int data = queue1.poll();
		Queue queue = queue1;
		queue1 = queue2;
		queue2 = queue;
		return data;
	}
	
	// Auxiliary Operations
	
	// to get the last inserted element without removing it
	public int getTop() throws RuntimeException{
		if(queue1.isEmpty())
			throw new RuntimeException("Stack is Empty");
		while(queue1.size() != 1) {
			queue2.add(queue1.poll());
		}
		int data = queue1.peek();
		queue2.add(queue1.poll());
		Queue queue = queue1;
		queue1 = queue2;
		queue2 = queue;
		return data;
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
		return list.toString();
	}
}
