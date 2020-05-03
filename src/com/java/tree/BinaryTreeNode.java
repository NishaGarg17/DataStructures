package com.java.tree;

public class BinaryTreeNode {
	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	public BinaryTreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	
	public BinaryTreeNode getLeft() {
		return this.left;
	}
	
	public BinaryTreeNode getRight() {
		return this.right;
	}
	
	public int getData() {
		return this.data;
	}
}
