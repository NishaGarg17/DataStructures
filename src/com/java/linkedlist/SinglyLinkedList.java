package com.java.linkedlist;


public class SinglyLinkedList {
    ListNode head = null;
	
	public int getListLength() {
		ListNode currentNode = head;
		int length = 0;
		while(currentNode != null) {
			length ++;
			currentNode = currentNode.getNext();
		}
		return length;
	}

	public void insertAtBeginning() {
		// TODO Auto-generated method stub
		
	}

	public void insertAtEnd() {
		// TODO Auto-generated method stub
		
	}

	public void insertAtIndex(int index) {
		// TODO Auto-generated method stub
		
	}
	
}
