package com.dsa.geeksforgeeks.stack;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack);
		reverse(stack);
		System.out.println(stack);

	}
	
	static void reverse(Stack<Integer> s) {
		if(s.isEmpty())
			return;
		
		int val = s.pop();
		reverse(s);
		insertAtBottom(s,val);
	}
	
	static void insertAtBottom(Stack<Integer> s, int x) {
		
		if(s.isEmpty()) {
			s.push(x);
			return;
		}
		int val = s.pop();
		insertAtBottom(s,x);
		s.push(val);
	}

}
