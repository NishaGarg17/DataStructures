package com.java.stack.linkedstack;

import java.util.Arrays;

// class to implement stack using linked list and to perform operations on stack
public class LinkedStack {

	// Index of the top element of the stack in the array, -1 to show stack is empty
	ListNode top = null;

	// Stack Operations

	// to insert an element at the beginning of the linked list
	public void push(int data) {
		ListNode temp = new ListNode(data);
		if (top != null) {
			temp.setNext(top);
		}
		top = temp;
	}

	// to remove an element from the beginning of the linked list and return reoved
	// element
	public int pop() throws RuntimeException {
		if (top == null) {
			throw new RuntimeException("Stack is Empty");
		}
		int data = top.getData();
		top = top.getNext();
		return data;
	}

	// Auxiliary Operations

	// to get the last inserted element without removing it
	public int peek() throws RuntimeException {
		if (top == null)
			throw new RuntimeException("Stack is Empty");
		return top.getData();
	}

	// to get the size of the stack
	public int size() {
		int count = 0;
		ListNode currentNode = top;
		while (currentNode != null) {
			count++;
			currentNode = currentNode.getNext();
		}
		return count;
	}


	// to check if the stack is empty or not
	public boolean isEmptyStack() {
		if (top == null) {
			return true;
		}
		return false;
	}

	// to give the string representation of the stack
	public String toStackString() {
		ListNode currentNode = top;
		String list = "[";
		if(currentNode != null) {
			while (currentNode.getNext() != null) {
				list = list + currentNode.getData() + ", ";
				currentNode = currentNode.getNext();
			}
			list += currentNode.getData();
		} 
		list += "]";
		return list;
	}
}
