package com.java.tree;

// Preorder Binary Tree Traversal Recursively
public class BinaryTreeInOrderRecursively {
	
	public void inOrderRecursive(BinaryTreeNode root) {
		if(root != null) {
			inOrderRecursive(root.left);
			System.out.println(root.data);
			inOrderRecursive(root.right);	
		}
	}
}
