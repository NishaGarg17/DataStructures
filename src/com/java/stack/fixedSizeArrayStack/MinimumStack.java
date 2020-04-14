package com.java.stack.fixedSizeArrayStack;

import java.util.Scanner;
import java.util.Stack;

// program to print minimum element in stack at any point
public class MinimumStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*******Menu is: *******");
		System.out.println("Press 1 to add element in stack");
		System.out.println("Press 2 to remove element from stack");
		System.out.println("Press 3 to print minimum element in stack");
		System.out.println("***********************");
		
		
		int choice = sc.nextInt();
		String hasInput = "Y";
		int min = Integer.MAX_VALUE;
		Stack<StackNode> stack = new Stack<StackNode>();
		while("y".equalsIgnoreCase(hasInput)) {
			switch(choice) {
				case 1:
					System.out.println("Enter your value: ");
					int val = sc.nextInt();
					min = Math.min(min, val);
					stack.push(new StackNode(val, min));
					break;
				case 2:
					// pop and reset min
					if(stack.isEmpty()) {
						System.out.println("OOPS! Stack is empty");
						min = Integer.MAX_VALUE;
					} else {
						stack.pop();
						min = stack.peek().curMin;
					}
					
					break;
				case 3:
					if(stack.isEmpty()) {
						System.out.println("OOPS! Stack is empty");
					} else {
						System.out.println("Minimum of the stack is: " + stack.peek().curMin);
					}
					break;
				default:
					System.out.println("Wrong Input");		
			}
			System.out.println("Do you want to continue? Press Y to continue and N to exit: ");
			hasInput = sc.next();
			if("y".equalsIgnoreCase(hasInput)) {
				System.out.println("Enter your choice 1..or..2..or..3..");
				choice = sc.nextInt();
			} else {
				System.out.println("Program has been terminated successfully");
				System.exit(0);
			}
		}
		
		
	}

}

class StackNode {
	int val;
	int curMin;
	public StackNode(int val, int curMin) {
		this.val = val;
		this.curMin = curMin;
	}
}
