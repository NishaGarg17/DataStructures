package com.java.linkedlist;

// class to find a loop in Singly Linked List using Floyd's Cycle Detection Algorithm without using extra space(hash set)
public class LoopDetectionInSinglyLinkedListUsingFloydAlgo {

	public static void main(String[] args) {
		SinglyLinkedList slist = new SinglyLinkedList();

		// insert the nodes in the front of the Linked List
		slist.insertAtBeginning(1);
		slist.insertAtBeginning(2);
		slist.insertAtBeginning(3);
		slist.insertAtBeginning(4);
		slist.insertAtBeginning(5);

		ListNode head = slist.head;

		// add a loop in newly created singly linked list
		slist.head.getNext().getNext().getNext().getNext().setNext(slist.head);

		boolean hasLoop = detectLoop(head);
		if (hasLoop) {
			System.out.println("Loop Found");
		} else {
			System.out.println("No Loop Found");
		}
	}

	private static boolean detectLoop(ListNode head) {
		ListNode fastPtr = head, slowPtr = head;
		
		while(slowPtr != null && fastPtr != null && fastPtr.getNext() != null) {
			slowPtr = slowPtr.getNext();
			fastPtr = fastPtr.getNext().getNext();
			if(slowPtr == fastPtr) {
				return true;
			}
			
		}
		return false;
	}

}
