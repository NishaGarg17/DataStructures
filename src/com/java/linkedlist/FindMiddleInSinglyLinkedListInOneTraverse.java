package com.java.linkedlist;

import java.util.Scanner;

public class FindMiddleInSinglyLinkedListInOneTraverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList slist = new SinglyLinkedList();
		
		System.out.println("Enter the number of elements of singly linked list: ");
		int n = sc.nextInt(), data;
		
		// create a singly linked list by inserting the given data at the end of list
		if(n > 0) {
			System.out.println("Enter the elements of the singly linked list: ");
			for(int i = 0; i < n; i++) {
				data = sc.nextInt();
				slist.insertAtEnd(data);
			}
			
			ListNode head = slist.head, slowPtr = head, fastPtr = head;
			
			while(fastPtr != null && fastPtr.getNext() != null) {
				fastPtr = fastPtr.getNext().getNext();
				slowPtr = slowPtr.getNext();
			}
			
			System.out.println("The middle element of the singly linked list is: " + slowPtr.getData());
		}
		else {
			System.out.println("No Element in the list, so there is no middle element exists");
		}
		
		
	}

}
