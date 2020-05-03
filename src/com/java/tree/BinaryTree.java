package com.java.tree;

// to create static BinaryTree
public class BinaryTree {
	 
	// create static Binary Tree
	 public BinaryTreeNode getBinaryTree() {
		 BinaryTreeNode treeNode1 = new BinaryTreeNode(1);
		 
		 BinaryTreeNode treeNode2 = new BinaryTreeNode(2);
		 
		 BinaryTreeNode treeNode3 = new BinaryTreeNode(3);
		 
		 BinaryTreeNode treeNode4 = new BinaryTreeNode(4);
		 
		 BinaryTreeNode treeNode5 = new BinaryTreeNode(5);
		 
		 BinaryTreeNode treeNode6 = new BinaryTreeNode(6);
		 
		 BinaryTreeNode treeNode7 = new BinaryTreeNode(7);
		 
		 treeNode1.setLeft(treeNode2);
		 treeNode1.setRight(treeNode3);
		 
		 treeNode2.setLeft(treeNode4);
		 treeNode2.setRight(treeNode5);
		 
		 treeNode3.setLeft(treeNode6);
		 treeNode3.setRight(treeNode7);
		 
		 // return the root node
		 return treeNode1;
	 }
	 
}
