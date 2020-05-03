package com.java.tree;

// PostOrder Binary Tree Traversal Recursively
public class BinaryTreePostOrderRecursively {
	
	public void postOrderRecursive(BinaryTreeNode root) {
		if(root != null) {
			postOrderRecursive(root.left);
			postOrderRecursive(root.right);
			System.out.println(root.data);
		}
	}
}
