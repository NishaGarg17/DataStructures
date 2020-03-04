package com.java.linkedlist;
import java.util.Scanner;

public class ListUtility {

	public static void main(String[] args) {
		System.out.println("Welcome to SinglyLinkedList Program");
		System.out.println("Enter Y to continue and N to exit");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str= str.toUpperCase();
		do {
			switch (str) {
			case "Y": {
				getInput();
				System.out.println("Do you want to continue? Press Y to continue and N to exit");
				str = sc.next();
				break;
			}
			case "N": {
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Please enter the valid input, Press Y to continue and N to exit");
				str = sc.next();
			}
			}
		} while (!str.equals("N"));

	}

	private static void getInput() {
		Scanner sc = new Scanner(System.in);
		int index;
		System.out.println("Linked List Operations are: ");
		System.out.println("Insert");
		System.out.println("Delete");
		System.out.println("Find");
		System.out.println("Count");
		System.out.println("Print");
		System.out.println("enter the operation name which you want to perform");
		String operation = sc.next().toLowerCase();
		SinglyLinkedList slist = new SinglyLinkedList();
		
		switch(operation) {
			case "insert": {
				System.out.println("Enter the index where you want to insert new node: ");
				index = sc.nextInt();
				if(index < 0 || index == 0) {
					slist.insertAtBeginning();
				} else if(index > slist.getListLength() || index == slist.getListLength()) {
					slist.insertAtEnd();
				} else {
					slist.insertAtIndex(index);
				}
			}
		} 
		
 	}
		
}


