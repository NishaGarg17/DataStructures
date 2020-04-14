package com.java.stack.linkedstack;

import java.util.Scanner;

import com.java.linkedlist.SinglyLinkedList;
import com.java.stack.fixedSizeArrayStack.FixedSizeArrayStack;

public class LinkedStackUtitlity {

	public static void main(String[] args) {
		System.out.println("Welcome to SinglyLinkedList Program");
		System.out.println("Press Y to continue and N to exit");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str= str.toUpperCase();
		LinkedStack stack = new LinkedStack();
		do {
			switch (str) {
			case "Y": 
				getInput(stack);
				System.out.println("Do you want to continue? Press Y to continue and N to exit");
				str = sc.next();
				str= str.toUpperCase();
				break;
			case "N": 
				System.out.println("Program has been terminated successfully.");
				System.exit(0);
				break;
			default:
				System.out.println("Please enter the valid input, Press Y to continue and N to exit");
				str = sc.next();
				str= str.toUpperCase();
			}
		} while (!str.equals("N"));
		System.out.println("Program has been terminated successfully.");

	}
	private static void getInput(LinkedStack stack) {
		Scanner sc = new Scanner(System.in);
		int index, data;
		System.out.println("Stack Operations are: ");
		System.out.println("Insert");
		System.out.println("Delete");
		System.out.println("Top");
		System.out.println("Size");
		System.out.println("Print");
		System.out.println("CheckIfEmptyStack");
		System.out.println("Enter the operation name which you want to perform");
		String operation = sc.next().toLowerCase();
		
		switch(operation) {
			case "insert":
				System.out.println("Enter the data for node: ");
				data = sc.nextInt();
				stack.push(data);
				System.out.println("Element " + stack.top.getData() + " has been inserted successfully into stack.");
				break;
			case "delete":
				System.out.println("Element " + stack.pop() + " has been removed successfully from the stack");
				break;
			case "top":
				data = stack.peek();
				System.out.println("Top of the stack is: " + data);
				break;
			case "size":
				System.out.println("Stack size is: " + stack.size());
				break;
			case "print":
				System.out.println("Stack is: " + stack.toStackString());
				break;
			case "checkifemptystack":
				if(stack.isEmptyStack()) {
					System.out.println("The stack is empty");
				} else {
					System.out.println("Stack is not empty and stack size is: " + stack.size());
				}
				break;
			default: 
				System.out.println("Wrong Operation name has been entered");
				
		} 
		
 	}

}
