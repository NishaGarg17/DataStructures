package com.java.stack.fixedSizeArrayStack;

import java.util.Scanner;

public class InfixToPostfix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Infix Expression: ");
		String infixStr = sc.next();
		Character[] stack = new Character[infixStr.length()];
		int top = -1;
		String postfixStr = "";
		for(int i = 0; i < infixStr.length(); i++) {
			if(Character.isLetterOrDigit(infixStr.charAt(i))) {
				postfixStr = postfixStr + infixStr.charAt(i);
			} else if(infixStr.charAt(i) == '(') {
				stack[++top] = infixStr.charAt(i);
			} else if(top != -1 && stack[top] == '(') {
				stack[++top] = infixStr.charAt(i);
			}
			else if(top != -1 && getPrecedence(infixStr.charAt(i)) > getPrecedence(stack[top])) {
				stack[++top] = infixStr.charAt(i);
			} else if(infixStr.charAt(i) == ')') {
				while(top != -1 && stack[top] != '(') {
					postfixStr = postfixStr + stack[top];
					stack[top] = null;
					top--;
				}
				top--;
			} else {
				while(top != -1 && getPrecedence(infixStr.charAt(i)) <= getPrecedence(stack[top])) {
					postfixStr = postfixStr + stack[top];
					stack[top] = null;
					top--;
				}
				stack[++top] = infixStr.charAt(i);
			}
		}
		if(top != -1) {
			while(top != -1) {
				if(stack[top] == '(') {
					System.out.println("Invalid Expression");
					System.exit(0);
				}
				postfixStr = postfixStr + stack[top];
				stack[top] = null;
				top--;
			}
		}
		System.out.println("Postfix Notation for given Infix form: " + infixStr + " is: " + postfixStr);
	}
	
	public static int getPrecedence(Character ch) {
		switch(ch) {
			case '+':
			case '-': 
				return 1;
			case '*':
			case '/':
				return 2;
		}
		return -1;
	}

}
