package com.java.tree;

public class BinaryTreeUtilityInorderTraversal {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		BinaryTreeNode rootNode = tree.getBinaryTree();
		
		// to traverse a tree in inOrder recursively
		BinaryTreeInOrderRecursively inOrderRecObj = new BinaryTreeInOrderRecursively();
		
		System.out.println("Inorder traversal recursively: ");
		inOrderRecObj.inOrderRecursive(rootNode);
		
		// to traverse a tree in inorder iteratively
		
		  System.out.println("Inorder traversal iteratively: ");
		  BinaryTreeInOrderIteratively inOrderItrObj = new BinaryTreeInOrderIteratively();
		  inOrderItrObj.inOrderIterative(rootNode);
		 
	}
}
