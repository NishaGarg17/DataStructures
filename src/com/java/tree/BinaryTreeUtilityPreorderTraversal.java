package com.java.tree;

public class BinaryTreeUtilityPreorderTraversal {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		BinaryTreeNode rootNode = tree.getBinaryTree();
		
		// to traverse a tree in preorder recursively
		BinaryTreePreOrderRecursively preOrderRecObj = new BinaryTreePreOrderRecursively();
		
		System.out.println("Preorder traversal recursively: ");
		preOrderRecObj.preOrderRecursive(rootNode);
		
		// to traverse a tree in preorder iteratively
		System.out.println("Preorder traversal iteratively: ");
		BinaryTreePreOrderIteratively preOrderItrObj = new BinaryTreePreOrderIteratively();
		preOrderItrObj.preOrderIterative(rootNode);
	}
}
