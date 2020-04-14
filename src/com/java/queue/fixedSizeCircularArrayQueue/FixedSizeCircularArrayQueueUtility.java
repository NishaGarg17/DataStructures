package com.java.queue.fixedSizeCircularArrayQueue;

import java.util.Scanner;

import com.java.stack.fixedSizeArrayStack.FixedSizeArrayStack;
import com.java.stack.linkedstack.LinkedStack;

public class FixedSizeCircularArrayQueueUtility {

	public static void main(String[] args) {
		System.out.println("Welcome to FixedSizeCircularArrayQueue Program");
		System.out.println("Enter the capacity for the queue");
		Scanner sc = new Scanner(System.in);
		
		// to get the capacity of the queue from the user
		int queueCapacity = sc.nextInt();
		
		if(queueCapacity > 0) {
			
			FixedSizeCircularArrayQueue fixedSizeCircularArrayQueue = new FixedSizeCircularArrayQueue(queueCapacity);
			System.out.println("Press Y to continue and N to exit");
			String str = sc.next();
			str= str.toUpperCase();
			do {
				switch (str) {
				case "Y": 
					getInput(fixedSizeCircularArrayQueue);
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
			System.out.println("Queue capacity can't be 0 or less than 0");
		}
		System.out.println("Program has been terminated successfully.");

	}
	private static void getInput(FixedSizeCircularArrayQueue fixedSizeCircularArrayQueue) {
		Scanner sc = new Scanner(System.in);
		int index, data;
		System.out.println("Queue Operations are: ");
		System.out.println("Insert");
		System.out.println("Delete");
		System.out.println("Front");
		System.out.println("Size");
		System.out.println("Print");
		System.out.println("CheckIfEmptyQueue");
		System.out.println("CheckIfFullQueue");
		System.out.println("Enter the operation name which you want to perform");
		String operation = sc.next().toLowerCase();
		
		switch(operation) {
			case "insert":
				System.out.println("Enter the data for node: ");
				data = sc.nextInt();
				fixedSizeCircularArrayQueue.enQueue(data);
				System.out.println("Element " + data + " has been inserted successfully into Queue.");
				break;
			case "delete":
				System.out.println("Element " + fixedSizeCircularArrayQueue.deQueue() + " has been removed successfully from the queue");
				break;
			case "front":
				data = fixedSizeCircularArrayQueue.getFront();
				System.out.println("Front of the queue is: " + data);
				break;
			case "size":
				System.out.println("Queue size is: " + fixedSizeCircularArrayQueue.getSize());
				break;
			case "print":
				System.out.println("Queue is: " + fixedSizeCircularArrayQueue.toString());
				break;
			case "checkifemptyqueue":
				if(fixedSizeCircularArrayQueue.isEmpty()) {
					System.out.println("Queue is empty");
				} else {
					System.out.println("Queue is not empty and queue size is: " + fixedSizeCircularArrayQueue.getSize());
				}
				break;
			case "checkiffullqueue":
				if(fixedSizeCircularArrayQueue.isFull()) {
					System.out.println("Queue is Full");
				} else {
					System.out.println("Queue is not empty and queue size is: " + fixedSizeCircularArrayQueue.getSize());
				}
				break;
			default: 
				System.out.println("Wrong Operation name has been entered");
				
		}
	}
}
