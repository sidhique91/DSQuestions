package com.dsa.geeksforgeeks.stack;

import java.util.Scanner;
import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {


	}
	
	static Stack<Integer> sort(Stack<Integer> s) {
		if(s.isEmpty())
			return s;
		
		int temp = s.pop();
		sort(s);
		insert(s,temp);
		return s;
	}
	
	static void insert(Stack<Integer> s, int k) {
		if(s.isEmpty() || s.peek() <= k) {
			s.push(k);
			return;
		}
		
		int temp = s.pop();
		insert(s,k);
		s.push(temp);
	}

}
