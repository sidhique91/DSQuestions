package com.dsa.geeksforgeeks.hashing;

import java.util.*;
import java.util.Map.Entry;

public class DistinctElements {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- > 0)
		{
			int n = scanner.nextInt();
			int[][] a = new int[n][n];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					a[i][j] = scanner.nextInt();
			
			countDistinct(a,n);
			
		}
	}
	
	static void countDistinct(int[][] a,int n)
	{
		int count = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++)
			map.put(a[0][i], 1);
		
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(map.containsKey(a[i][j]) && map.get(a[i][j]) == i)
				{
					map.compute(a[i][j], (k,v)-> v+1);
					if(i==n-1)
						count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
