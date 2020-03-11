package com.java.linkedlist;

import java.util.Scanner;

public class MergeAndReverseTwoSortedLinkedLists {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, data;

		// get element count for first sorted linked list
		System.out.println("Enter the count of elements for the first sorted linked list: ");
		n1 = sc.nextInt();

		SinglyLinkedList slist1 = new SinglyLinkedList(), slist2 = new SinglyLinkedList(),
				slist3 = new SinglyLinkedList();

		// get elements for first sorted linked list
		if (n1 > 0) {
			System.out.println("Enter the elments of first sorted linked list: ");
			for (int i = 0; i < n1; i++) {
				data = sc.nextInt();
				slist1.insertAtEnd(data);
			}
		}

		// get element count for 2nd sorted linked list
		System.out.println("Enter the count of elements for the second sorted linked list: ");
		n2 = sc.nextInt();

		// get elements for 2nd sorted linked list
		if (n2 > 0) {
			System.out.println("Enter the elements of 2nd sorted linked list: ");

			for (int i = 0; i < n2; i++) {
				data = sc.nextInt();
				slist2.insertAtEnd(data);
			}
		}

		// to print first sorted linked list
		System.out.println("First Sorted Linked List is: ");
		slist1.printLinkedList();

		// to print 2nd sorted linked list
		System.out.println("2nd Sorted Linked List is: ");
		slist2.printLinkedList();

		ListNode head3 = mergeTwoSortedLinkedLists(slist1.head, slist2.head);
		slist3.head = head3;
		System.out.println("head3 data: " + head3.getData());
		// to print final merged sorted linked list
		System.out.println("The Final merged sorted linked list is: ");
		slist3.printLinkedList();
	}

	static ListNode mergeTwoSortedLinkedLists(ListNode head1, ListNode head2) {
		ListNode head3 = null, tNode = null;

		if (head1 == null) {
			return head2;
		} else if (head2 == null) {
			return head1;
		} else {
			ListNode prev = null, next = null;
			while (head1 != null || head2 != null) {
				if (head1 != null && head2 != null) {
					if (head1.getData() < head2.getData()) {
						tNode = head1;
						next = head1.getNext();
						tNode.setNext(prev);
						head1 = next;
					} else {
						tNode = head2;
						next = head2.getNext();
						tNode.setNext(prev);
						head2 = next;
					}

				} else {
					ListNode temp = head1 == null ? head2 : head1;
					tNode = temp;
					next = tNode.getNext();
					tNode.setNext(prev);

					if (head1 != null) {
						head1 = next;
					} else {
						head2 = next;
					}
				}

				prev = tNode;
			}
		}
		return tNode;
	}

}
