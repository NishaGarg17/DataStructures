package com.java.queue.linkedQueue;

import java.util.Scanner;

public class LinkedQueueUtility {

	public static void main(String[] args) {
		System.out.println("Welcome to FixedSizeCircularArrayQueue Program");
		Scanner sc = new Scanner(System.in);
		LinkedQueue linkedQueue = new LinkedQueue();
		System.out.println("Press Y to continue and N to exit");
		String str = sc.next();
		str = str.toUpperCase();
		do {
			switch (str) {
			case "Y":
				getInput(linkedQueue);
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

	private static void getInput(LinkedQueue linkedQueue) {
		Scanner sc = new Scanner(System.in);
		int index, data;
		System.out.println("Queue Operations are: ");
		System.out.println("Insert");
		System.out.println("Delete");
		System.out.println("Front");
		System.out.println("Size");
		System.out.println("Print");
		System.out.println("CheckIfEmptyQueue");
		System.out.println("Enter the operation name which you want to perform");
		String operation = sc.next().toLowerCase();

		switch (operation) {
		case "insert":
			System.out.println("Enter the data for node: ");
			data = sc.nextInt();
			linkedQueue.enQueue(data);
			System.out.println("Element " + data + " has been inserted successfully into Queue.");
			break;
		case "delete":
			System.out.println("Element " + linkedQueue.deQueue() + " has been removed successfully from the queue");
			break;
		case "front":
			data = linkedQueue.front();
			System.out.println("Front of the queue is: " + data);
			break;
		case "size":
			System.out.println("Queue size is: " + linkedQueue.size());
			break;
		case "print":
			System.out.println("Queue is: " + linkedQueue.toString());
			break;
		case "checkifemptyqueue":
			if (linkedQueue.isEmpty()) {
				System.out.println("Queue is empty");
			} else {
				System.out.println("Queue is not empty and size is: " + linkedQueue.size());
			}
			break;
		default:
			System.out.println("Wrong Operation name has been entered");

		}
	}

}
