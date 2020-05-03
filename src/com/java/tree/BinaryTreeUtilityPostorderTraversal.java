package com.java.tree;

public class BinaryTreeUtilityPostorderTraversal {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		BinaryTreeNode rootNode = tree.getBinaryTree();
		
		// to traverse a tree in postorder recursively
		BinaryTreePostOrderRecursively postOrderRecObj = new BinaryTreePostOrderRecursively();
		
		System.out.println("Postorder traversal recursively: ");
		postOrderRecObj.postOrderRecursive(rootNode);
		
		// to traverse a tree in postorder iteratively
		
		  System.out.println("Postorder traversal iteratively: ");
		  BinaryTreePostOrderIteratively postOrderItrObj = new BinaryTreePostOrderIteratively(); 
		  postOrderItrObj.postOrderIterative(rootNode);
		 
	}
}
