package com.java.stack.linkedstack;

public class ListNode {
	private int data;
	private ListNode next;
	ListNode() {
		
	}
	ListNode(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	public ListNode getNext() {
		return this.next;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNext(ListNode next) {
		this.next = next;
	}

}
