package com.dsa.geeksforgeeks.stack;

import java.util.*;

public class NextGreaterElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0)
		{
			int n = scanner.nextInt();
			long[] a = new long[n];
			
			for(int i=0;i<n;i++)
				a[i] = scanner.nextLong();
			
			nextGreater(a,n);
			System.out.println();
		}

	}
	
	static void nextGreater(long[] a, int n) {
		Stack<Long> s = new Stack<>();
		long[] next = new long[n];
		next[n-1] = -1;
		s.push(a[n-1]);
		for(int i=n-2;i>=0;i--) {
			while(!s.isEmpty() && a[i]>s.peek())
				s.pop();
			
			next[i] = s.isEmpty()? -1 :s.peek();
			s.push(a[i]);
		}
		
		for(int i=0;i<n;i++)
			System.out.print(next[i]+" ");
	}

}
