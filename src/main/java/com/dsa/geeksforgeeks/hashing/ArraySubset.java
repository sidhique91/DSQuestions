package com.dsa.geeksforgeeks.hashing;

import java.util.*;

public class ArraySubset {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- > 0)
		{
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			
			int[] a = new int[m];
			int[] b = new int[n];
			
			for(int i=0;i<m;i++)
				a[i] = scanner.nextInt();
			
			for(int i=0;i<n;i++)
				b[i] = scanner.nextInt();
			
			arraySubset(a,b);
		}

	}
	
	static void arraySubset(int[] a, int [] b)
	{
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<a.length;i++)
			set.add(a[i]);
		
		for(int i=0;i<b.length;i++)
			if(!set.contains(b[i])) {
				System.out.println("No");
				return;
			}
		
		System.out.println("Yes");
	}

}
