package com.java.stack.fixedSizeArrayStack;

import java.util.Arrays;

// class to behave as fixed size stack array and to perform operation on it
public class FixedSizeArrayStack {
	
	// length of the array used to implement the stack
	int capacity;

	// Index of the top element of the stack in the array, -1 to show stack is empty
	int top = -1;

	// declares default capacity of the stack
	static final int CAPACITY = 10;

	// declares the stack array
	int[] stack;
	// int[] stack1;

	public FixedSizeArrayStack() {
		this(CAPACITY);
	}

	public FixedSizeArrayStack(int capacity) {
		this.capacity = capacity;
		stack = new int[capacity];
	}
	
	// Stack Operations
	
	// to insert an element at the top of the stack and throw exception if stack is already full
	public void push(int element) throws RuntimeException {
		
		if(top == stack.length - 1) {
			throw new RuntimeException("Stack is full.");
		}
		stack[++top] = element;
	}
	
	// to remove an element from the stack
	public int pop() throws RuntimeException {
		if(top < 0) {
			throw new RuntimeException("Stack is empty");
		}
		int data = stack[top];
		stack[top--] = Integer.MIN_VALUE;
		return data;
	}
	
	// Auxiliary Operations
	
	// to get the last inserted element without removing it
	public int getTop() throws RuntimeException{
		if(top < 0)
			throw new RuntimeException("Stack is Empty");
		return stack[top];
	}
	
	// to get the size of the stack
	public int size() {
		return top + 1;
	}
	
	// to check if the stack is empty or not
	public boolean isEmptyStack() {
		if(top < 0) {
			return true;
		}
		return false;
	}
	
	// to check if the stack if full or not
	public boolean isFullStack() {
		if(top == capacity - 1) {
			return true;
		}
		return false;
	}
	
	// to give the string representation of the stack or to print all the the elements of the stack
	public String toStackString() {
		return Arrays.toString(stack);
	}
}
