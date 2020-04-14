package com.java.stack.impl;

import java.util.Scanner;

import com.java.queue.impl.QueueUsingStacks;

public class StackUsingQueuesUtility1 {

	public static void main(String[] args) {
		System.out.println("Welcome to StackUsingQueues Program");
		Scanner sc = new Scanner(System.in);

		StackUsingQueues stackUsingQueues = new StackUsingQueues();
		System.out.println("Press Y to continue and N to exit");
		String str = sc.next();
		str = str.toUpperCase();
		do {
			switch (str) {
			case "Y":
				getInput(stackUsingQueues);
				System.out.println("Do you want to continue? Press Y to continue and N to exit");
				str = sc.next();
				str = str.toUpperCase();
				break;
			case "N":
				System.out.println("Program has been terminated successfully.");
				System.exit(0);
				break;
			default:
				System.out.println("Please enter the valid input, Press Y to continue and N to exit");
				str = sc.next();
				str = str.toUpperCase();
			}
		} while (!str.equals("N"));
		System.out.println("Program has been terminated successfully.");
	}

	private static void getInput(StackUsingQueues stackUsingQueues) {
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

		switch (operation) {
		case "insert":
			System.out.println("Enter the data for node: ");
			data = sc.nextInt();
			stackUsingQueues.push(data);
			System.out.println("Now the stack is: " + stackUsingQueues.toStackString());
			break;
		case "delete":
			System.out.println("Element " + stackUsingQueues.pop() + " has been removed from stack");
			System.out.println("Now the stack is: " + stackUsingQueues.toStackString());
			break;
		case "top":
			data = stackUsingQueues.getTop();
			System.out.println("Top of the stack is: " + data);
			break;
		case "size":
			System.out.println("Stack size is: " + stackUsingQueues.size());
			break;
		case "print":
			System.out.println("Stack is: " + stackUsingQueues.toStackString());
			break;
		case "checkifemptystack":
			if (stackUsingQueues.isEmptyStack()) {
				System.out.println("The stack is empty");
			} else {
				System.out.println("Stack is not empty and stack size is: " + stackUsingQueues.size());
			}
			break;
		default:
			System.out.println("Wrong Operation name has been entered");

		}

	}
}
