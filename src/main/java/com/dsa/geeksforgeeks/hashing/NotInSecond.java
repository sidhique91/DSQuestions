package com.dsa.geeksforgeeks.hashing;

import java.util.*;

public class NotInSecond {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- >0)
		{
			int m = scanner.nextInt();
			int n= scanner.nextInt();
			
			int[] a = new int[m];
			int[] b = new int[n];
			
			for(int i=0;i<m;i++)
				a[i] = scanner.nextInt();
			
			for(int i=0;i<n;i++)
				b[i] = scanner.nextInt();
			
			notInSecond(a,b);
			System.out.println();
				
		}

	}
	
	static void notInSecond(int[] a, int[] b)
	{
		int count = 0;
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<b.length;i++)
			set.add(b[i]);
		
		for(int i=0;i<a.length;i++)
			if(!set.contains(a[i]))
			{
				System.out.print(a[i]+" ");
				count++;
			}
		
		if(count == 0)
			System.out.println(-1);
	}

}
