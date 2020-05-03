package com.java.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	public ArrayList<ArrayList<Integer>> levelOrderTraverse(BinaryTreeNode root) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(root == null) {
			return res;
		} else {
			Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
			ArrayList<Integer> curr = new ArrayList<Integer>();
			queue.add(root);
			queue.add(null); // to indicated levels of tree
			while(!queue.isEmpty()) {
				BinaryTreeNode temp = queue.poll();
				
				if(temp != null) {
					curr.add(temp.data);
					if(temp.left != null) {
						queue.offer(temp.left);
					}
					if(temp.right != null) {
						queue.offer(temp.right);
					}
				} else {
					ArrayList<Integer> list = new ArrayList<Integer>(curr);
					res.add(list);
					curr.clear();
					if(!queue.isEmpty()) {
						queue.offer(null);
					}
					//System.out.println(list.toString());
				}
			}
			
			return res;
		}
	}

}
