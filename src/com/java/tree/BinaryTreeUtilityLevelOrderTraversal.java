package com.java.tree;

import java.util.ArrayList;

public class BinaryTreeUtilityLevelOrderTraversal {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		BinaryTreeNode rootNode = tree.getBinaryTree();
		
		// to traverse a tree using level order traversal
		BinaryTreeLevelOrderTraversal levelOrderObj = new BinaryTreeLevelOrderTraversal();
		
		System.out.println("Level Order traversal: ");
		ArrayList<ArrayList<Integer>> levelWiseBinaryTreeList = levelOrderObj.levelOrderTraverse(rootNode);
		
		for(ArrayList list : levelWiseBinaryTreeList) {
			list.forEach(i -> System.out.print(i + " "));
			System.out.println();
		}
	}
}
