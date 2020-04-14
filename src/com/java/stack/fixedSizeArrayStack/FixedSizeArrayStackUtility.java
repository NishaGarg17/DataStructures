package com.java.stack.fixedSizeArrayStack;

import java.util.Scanner;


public class FixedSizeArrayStackUtility {

	public static void main(String[] args) {
		System.out.println("Welcome to FixedSizeArrayStack Program");
		System.out.println("Enter the capacity for the stack");
		Scanner sc = new Scanner(System.in);
		
		// to get the capacity of the stack from the user
		int stackCapacity = sc.nextInt();
		
		if(stackCapacity > 0) {
			
			FixedSizeArrayStack fixedSizeArrayStack = new FixedSizeArrayStack(stackCapacity);
			System.out.println("Press Y to continue and N to exit");
			String str = sc.next();
			str= str.toUpperCase();
			do {
				switch (str) {
				case "Y": 
					getInput(fixedSizeArrayStack);
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
		} else {
			System.out.println("Stack capacity can't be 0 or less than 0");
		}
		System.out.println("Program has been terminated successfully.");
	}
	private static void getInput(FixedSizeArrayStack fixedSizeArrayStack) {
		Scanner sc = new Scanner(System.in);
		int index, data;
		System.out.println("Stack Operations are: ");
		System.out.println("Insert");
		System.out.println("Delete");
		System.out.println("Top");
		System.out.println("Size");
		System.out.println("Print");
		System.out.println("CheckIfFullStack");
		System.out.println("CheckIfEmptyStack");
		System.out.println("Enter the operation name which you want to perform");
		String operation = sc.next().toLowerCase();
		
		switch(operation) {
			case "insert":
				System.out.println("Enter the data for node: ");
				data = sc.nextInt();
				fixedSizeArrayStack.push(data);
				System.out.println("Now the stack is: " + fixedSizeArrayStack.toStackString());
				break;
			case "delete":
				System.out.println("Element " + fixedSizeArrayStack.pop() + " has been removed from stack");
				System.out.println("Now the stack is: " + fixedSizeArrayStack.toStackString());
				break;
			case "top":
				data = fixedSizeArrayStack.getTop();
				System.out.println("Top of the stack is: " + data);
				break;
			case "size":
				System.out.println("Stack size is: " + fixedSizeArrayStack.size());
				break;
			case "print":
				System.out.println("Stack is: " + fixedSizeArrayStack.toStackString());
				break;
			case "checkiffullstack":
				if(fixedSizeArrayStack.isFullStack()) {
					System.out.println("The Stack is full");
				} else {
					System.out.println("Stack is not full");
				}
				break;
			case "checkifemptystack":
				if(fixedSizeArrayStack.isEmptyStack()) {
					System.out.println("The stack is empty");
				} else {
					System.out.println("Stack is not empty and stack size is: " + fixedSizeArrayStack.size());
				}
				break;
			default: 
				System.out.println("Wrong Operation name has been entered");
				
		} 
		
 	}
}
