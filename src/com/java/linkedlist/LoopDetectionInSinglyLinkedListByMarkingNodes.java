package com.java.linkedlist;

public class LoopDetectionInSinglyLinkedListByMarkingNodes {

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
		if(hasLoop) {
			System.out.println("Loop Found");
		} else {
			System.out.println("No Loop Found");
		}
	}

	private static boolean detectLoop(ListNode head) {
		ListNode tNode = new ListNode();
		ListNode next;
		while(head != null) {
			if(head.getNext() == null) {
				return false;
			}
			if(head.getNext() == tNode) {
				return true;
			}
			next = head.getNext();
			head.setNext(tNode);
			head = next;
			
		}
		return false;
	}

}
