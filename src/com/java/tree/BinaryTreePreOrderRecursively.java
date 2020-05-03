package com.java.tree;

// Preorder Binary Tree Traversal Recursively
public class BinaryTreePreOrderRecursively {
	
	public void preOrderRecursive(BinaryTreeNode root) {
		if(root != null) {
			System.out.println(root.data);
			preOrderRecursive(root.left);
			preOrderRecursive(root.right);
			
		}
	}
}
