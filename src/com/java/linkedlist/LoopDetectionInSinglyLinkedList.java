package com.java.linkedlist;

import java.util.HashSet;

public class LoopDetectionInSinglyLinkedList {

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
		HashSet<ListNode> hashSet = new HashSet<ListNode>();
		while(head != null) {
			// if node is already present in hashset then return true to indicate that loop in Singly Linked List
			if(hashSet.contains(head)) {
				return true;
			}
			hashSet.add(head);
			head = head.getNext();
		}
		return false;
	}

}
