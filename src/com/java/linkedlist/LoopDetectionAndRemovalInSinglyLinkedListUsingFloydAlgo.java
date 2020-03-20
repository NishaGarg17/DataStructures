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
		ListNode ptr1 = fastPtr, ptr2 = fastPtr;
		int k = 1;
		
		// count the number of nodes present in the loop
		while(ptr1.getNext() != ptr2) {
			ptr1 = ptr1.getNext();
			k++;
		}
		
		// Set ptr1 and ptr2 to head
		ptr1 = head;
		ptr2 = head;
		
		// Now move the ptr2 to k number of nodes from head
		for(int i = 0; i < k; i ++) {
			ptr2 = ptr2.getNext();
		}
		
		// Move both pointers one by one and they will meet at loop node
		while(ptr1 != ptr2) {
			ptr1 = ptr1.getNext();
			ptr2 = ptr2.getNext();
		}
		
		// get pointer to the last node
		
		while(ptr2.getNext() != ptr1) {
			ptr2 = ptr2.getNext();
		}
		
		// Set the last node pointer to null to fix the loop
		ptr2.setNext(null);
	}

}
