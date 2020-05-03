package com.java.stack.impl;

import java.util.Stack;

public class EqualStacks {

	public static void main(String[] args) {
		int[] h1 = {3,2,1,1,1};
		int[] h2 = {4,3,2};
		int[] h3 = {1,1,4,1};
		int height = equalStacks(h1, h2, h3);
		System.out.println("Height is: " + height);
	}
	
	static int equalStacks(int[] h1, int[] h2, int[] h3) {
	       Stack stack1 = getStackFromArray(h1);
	       Stack stack2 = getStackFromArray(h2);
	       Stack stack3 = getStackFromArray(h3);
	       //System.out.println(stack1.peek());
	       int height1 = getHeightTotal(stack1);
	       int height2 = getHeightTotal(stack2);
	       int height3 = getHeightTotal(stack3);
	       if(height1 == height2 && height2 == height3 && height3 == height1) {
	           return height1;
	       } else {
	           int minHeight = 0;
	            while(!(height1 == height2 && height2 == height3 && height3 == height1)) {
	              minHeight = Math.min(height1, height2);
	                minHeight = Math.min(height3, minHeight);
	                if(height1 > minHeight) {	                	
	                    height1 = height1 - (int)stack1.pop();
	                }
	                if(height2 > minHeight) {	                    
	                    height2 = height2 - (int) stack2.pop();
	                }
	                if(height3 > minHeight) {
	                    height3 = height3 - (int) stack3.pop();
	                }   
	            }
	            return minHeight;
	       }
	      


	    }
	    public static Stack getStackFromArray(int[] h) {
	        Stack<Integer> stack = new Stack<Integer>();
	        for(int i = h.length -1 ; i >= 0; i--) {
	        	stack.push(h[i]);
	        }
	        return stack; 
	    }
	    public static int getHeightTotal(Stack stack) {
	        int height = 0;
	        for(int i = 0; i < stack.size(); i++) {
	            height = height + (int) stack.get(i);
	        }
	        return height;
	    }

}
