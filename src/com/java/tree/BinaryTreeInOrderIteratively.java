package com.java.tree;

import java.util.Stack;

// to traverse a tree using inOrder traversal iteratively
public class BinaryTreeInOrderIteratively {
	public void inOrderIterative(BinaryTreeNode root) {
		BinaryTreeNode currentNode = root;
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		boolean done = false;
		while(!done) {
			if(currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			} else {
				if(stack.isEmpty()) {
					done = true;
				} else {
					currentNode = stack.pop();
					System.out.println(currentNode.data);
					currentNode = currentNode.right;
				}
							
			}
		}
	}
}
