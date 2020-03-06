package com.java.linkedlist;


public class SinglyLinkedList {
    ListNode head = null;
	// to get the length of the list
	public int getListLength() {
		ListNode currentNode = head;
		int length = 0;
		while(currentNode != null) {
			length ++;
			currentNode = currentNode.getNext();
		}
		return length;
	}

	// to insert the new node at the beginning
	public void insertAtBeginning(int data) {
		ListNode node = new ListNode(data);
		if(head != null) {
			node.setNext(head);
		}
		head = node;
	}

	// to insert the new node at the end
	public void insertAtEnd(int data) {
		ListNode node = new ListNode(data);
		ListNode currentNode = head;
		if(head == null) {
			head = node;
		} else {
			while(currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(node);
		}
	}

	// to insert a new node a particular index given
	public void insertAtIndex(int index, int data) {
		ListNode node = new ListNode(data);
		int pos = 0;
		ListNode currentNode = head;
		while(currentNode != null) {
			
			if(pos == index) {
				node.setNext(currentNode.getNext());
				currentNode.setNext(node);
				break;
			}
			currentNode = currentNode.getNext();
			pos ++;
		}
	}

	// to print the values of Linked list
	public void printLinkedList() {
		ListNode currentNode = head;
		System.out.print((head == null) ? "OOPS! Currently Linked List is empty: [] \n" : "[");;

		while(currentNode != null) {
			if(currentNode.getNext() != null) {
				System.out.print(currentNode.getData() + ", ");
			} else {
				System.out.print(currentNode.getData() + "]\n");
			}
			currentNode = currentNode.getNext();
		}
		
		
	}

	// to delete node from the beginning
	public void deleteFromBeginning() {
		if(head == null) {
			System.out.println("Sorry! Nothing to delete in the Linked List");
		} else {
			ListNode tempNode = head.getNext();
			head = tempNode;
		}
		System.out.println("First Node has been deleted successfully");
	}

	// to delete the node from end
	public void deleteFromEnd() {
		if(head == null) {
			System.out.println("Sorry! Nothing to delete in the Linked List");
		} else {
			ListNode currentNode = head;
			ListNode previousNode = null;
			while(currentNode.getNext() != null) {
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}
			previousNode.setNext(null);
		}
		System.out.println("Last Node has been deleted succussfully");
	}

	// to delete the node for the given index
	public void deleteForGivenIndex(int index) {
		ListNode currentNode = head;
		ListNode previousNode = null;
		int pos = 0;
		while(currentNode != null) {
			if(pos == index) {
				previousNode.setNext(currentNode.getNext());
				break;
			}
			previousNode = currentNode;
			currentNode = currentNode.getNext();
			pos ++;
		}
		System.out.println("Node for index = " + index + " has been deleted succussfully");
	}

	// to delete the node for the first matched occurrence of data
	public void deleteForGivenData(int data) {
		ListNode currentNode = head;
		ListNode previousNode = null;
		boolean hasMatchFound = false;
		if(head == null) {
			System.out.println("Sorry! Nothing to delete in the Linked List");
		} else {
			while(currentNode != null) {
				if(currentNode.getData() == data) {
					hasMatchFound = true;
					if(previousNode == null) {
						head = currentNode.getNext();
					} else {
						previousNode.setNext(currentNode.getNext());
					}
					break;
				}
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}
			if(hasMatchFound) {
				System.out.println("Node with data = " + data + " has been deleted successfully.");
			} else {
				System.out.println("Sorry! Given data is not present in the list");
			}
		}
	}
	
}
