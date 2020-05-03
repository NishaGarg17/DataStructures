package com.java.tree;

import java.util.Stack;

// Preorder Binary Tree Traversal Iteratively
public class BinaryTreePreOrderIteratively {
	
	public void preOrderIterative(BinaryTreeNode root) {
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		stack.push(root);
		while(!stack.isEmpty()) {
			BinaryTreeNode node = stack.pop();
			
			if(node.right != null) {
				stack.push(node.right);
			}
			
			if(node.left != null) {
				stack.push(node.left);
			}
			
			System.out.println(node.data);
		}
	}
}
