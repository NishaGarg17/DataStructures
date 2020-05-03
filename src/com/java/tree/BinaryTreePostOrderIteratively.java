package com.java.tree;

import java.util.Stack;

// Postorder Binary Tree Traversal Iteratively
public class BinaryTreePostOrderIteratively {
	
	public void postOrderIterative(BinaryTreeNode root) {
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		BinaryTreeNode prev = null;
		BinaryTreeNode curr = null;
		stack.push(root);
		while(!stack.isEmpty()) {
			curr = stack.peek();
			
			if(prev == null || prev.left == curr || prev.right == curr) {
				// if the prev was the parent of the current node 
				// then traverse the tree down, if left is present push the left 
				// to the stack otherwise push the right node to the stack.
				
				if(curr.left != null) {
					stack.push(curr.left);
				} else if(curr.right != null) {
					stack.push(curr.right);
				}
			} else if(curr.left == prev) {
				if(curr.right != null) {
					stack.push(curr.right);
				}
			} else {
				System.out.println(stack.pop().data);
				
			}
			prev = curr;
		}
	}
}
