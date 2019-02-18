package com.dsa.geeksforgeeks.hashing;

import java.util.*;

public class AllPairsWithSum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- >0)
		{
			int n= scanner.nextInt();
			int sum= scanner.nextInt();
			int[] a = new int[n]; 
			
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();
			
			allPairs(a,sum);
				
		}

	}
	
	static void allPairs(int[] a, int sum)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		int count = 0;
		
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(sum-a[i]))
			{
				count+=map.get(sum-a[i]);
			}
			map.compute(a[i], (k,v)->v==null?1:v+1);
		}
		
		System.out.println(count);
	}

}
