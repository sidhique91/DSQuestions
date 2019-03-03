package com.dsa.geeksforgeeks.stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidBrackets {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0)
		{
			String str = scanner.next();
			validBrackets(str);
		}
	}
	
	static void validBrackets(String str) {
		int n = str.length();
		Stack<Integer> s = new Stack<>();
		s.push(-1);
		int count = 0;
		
		for(int i=0;i<n;i++) {
			if(str.charAt(i) == '(')
				s.push(i);
			else if(str.charAt(i) == ')') {
				s.pop();
				if(!s.isEmpty())
					count = Math.max(count, i-s.peek());
				else
					s.push(i);
			}
		}
		
		System.out.println(count);
	}

}
