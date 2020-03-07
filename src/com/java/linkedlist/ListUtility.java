package com.java.linkedlist;
import java.util.Scanner;

public class ListUtility {

	public static void main(String[] args) {
		System.out.println("Welcome to SinglyLinkedList Program");
		System.out.println("Press Y to continue and N to exit");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str= str.toUpperCase();
		SinglyLinkedList slist = new SinglyLinkedList();
		do {
			switch (str) {
			case "Y": 
				getInput(slist);
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

	private static void getInput(SinglyLinkedList slist) {
		Scanner sc = new Scanner(System.in);
		int index, data;
		System.out.println("Linked List Operations are: ");
		System.out.println("Insert");
		System.out.println("Delete");
		System.out.println("Find");
		System.out.println("Count");
		System.out.println("Print");
		System.out.println("Clear");
		System.out.println("enter the operation name which you want to perform");
		String operation = sc.next().toLowerCase();
		
		
		switch(operation) {
			case "insert":
				System.out.println("Enter the index where you want to insert new node: ");
				index = sc.nextInt();
				System.out.println("Enter the data for node: ");
				data = sc.nextInt();
				if(index <= 0) {
					slist.insertAtBeginning(data);
				} else if(index >= slist.getListLength()) {
					slist.insertAtEnd(data);
				} else {
					slist.insertAtIndex(index, data);
				}
				break;
			case "print":
				System.out.println("Linked List is: ");
				slist.printLinkedList();
				break;
			case "find":
				System.out.println("Enter the element to find position in the list: ");
				data = sc.nextInt();
				slist.getPosition(data);
				break;
			case "count":
				System.out.println("Total number of elements in the Linked list are: " + slist.getListLength());
				break;
			case "delete":
				System.out.println("Enter 'index' to delete node using index and 'data' to delete node as per the data");
				String type = sc.next().toLowerCase();
				
				switch(type) {
					case "index":
						System.out.println("Enter the index of node which you want to delete: ");
						index = sc.nextInt();
						if(index <= 0) {
							slist.deleteFromBeginning();
						} else if(index >= slist.getListLength()) {
							slist.deleteFromEnd();
						} else {
							slist.deleteForGivenIndex(index);
						}
						break;
					case "data":
						System.out.println("Enter the data which you want to delete");
						data = sc.nextInt();
						slist.deleteForGivenData(data);
						break;
					default:
						System.out.println("Invalid Input");
				}
				break;
			case "clear":
				slist.clearList();
				break;
			default: 
				System.out.println("Wrong Operation name has been entered");
				
		} 
		
 	}

		
}


