package com.java.linkedlist;


public class LoopDetectionAndRemovalInSinglyLinkedListUsingFloydAlgo {

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
			System.out.println("Loop Found and Removed");
			System.out.println("Now the singly linked list is: ");
			slist.printLinkedList();
		} else {
			System.out.println("No Loop Found");
		}

	}

	private static boolean detectLoop(ListNode head) {
		ListNode fastPtr = head, slowPtr = head;

		while (slowPtr != null && fastPtr != null && fastPtr.getNext() != null) {
			slowPtr = slowPtr.getNext();
			fastPtr = fastPtr.getNext().getNext();
			if (slowPtr == fastPtr) {
				removeLoop(fastPtr, head);
				return true;
			}

		}
		return false;
	}

	// to remove the loop from Singly Linked List
	private static void removeLoop(ListNode fastPtr, ListNode head) {
		ListNode slowPtr = head;
		while(slowPtr.getNext() != fastPtr.getNext()) {
			slowPtr = slowPtr.getNext();
			fastPtr = fastPtr.getNext();
		}
		fastPtr.setNext(null);
	}

}
