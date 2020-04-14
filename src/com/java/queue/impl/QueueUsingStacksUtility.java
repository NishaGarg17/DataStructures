package com.java.queue.impl;

import java.util.Scanner;

import com.java.queue.fixedSizeCircularArrayQueue.FixedSizeCircularArrayQueue;

public class QueueUsingStacksUtility {

	public static void main(String[] args) {
		System.out.println("Welcome to QueueUsingStacks Program");
		Scanner sc = new Scanner(System.in);
		QueueUsingStacks queueUsingStacks = new QueueUsingStacks();
		System.out.println("Press Y to continue and N to exit");
		String str = sc.next();
		str = str.toUpperCase();
		do {
			switch (str) {
			case "Y":
				getInput(queueUsingStacks);
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
	

	}

	private static void getInput(QueueUsingStacks queueUsingStacks) {
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
			queueUsingStacks.enQueue(data);
			System.out.println("Element " + data + " has been inserted successfully into Queue.");
			break;
		case "delete":
			System.out.println("Element " + queueUsingStacks.deQueue()
					+ " has been removed successfully from the queue");
			break;
		case "front":
			data = queueUsingStacks.getFront();
			System.out.println("Front of the queue is: " + data);
			break;
		case "size":
			System.out.println("Queue size is: " + queueUsingStacks.getSize());
			break;
		case "print":
			System.out.println("Queue is: " + queueUsingStacks.toString());
			break;
		case "checkifemptyqueue":
			if (queueUsingStacks.isEmpty()) {
				System.out.println("Queue is empty");
			} else {
				System.out.println("Queue is not empty and queue size is: " + queueUsingStacks.getSize());
			}
			break;
		default:
			System.out.println("Wrong Operation name has been entered");

		}
	}

}
