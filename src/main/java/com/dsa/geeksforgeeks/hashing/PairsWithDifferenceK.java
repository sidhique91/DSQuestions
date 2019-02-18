package com.dsa.geeksforgeeks.hashing;

import java.util.*;

public class PairsWithDifferenceK {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- >0)
		{
			int n= scanner.nextInt();
			int[] a = new int[n]; 
			
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();
			
			int k= scanner.nextInt();
			
			countPairs(a,k);
				
		}

	}
	
	static void countPairs(int[] a, int d)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		int count=0;
		
		for(int i=0;i<a.length;i++)
			map.compute(a[i], (k,v)-> v==null?1:v+1);
		
		for(int i=0;i<a.length;i++)
		{
			if(d==0)
			{
				if(map.containsKey(a[i]) && map.get(a[i]) > 1)
					count++;
			}
			else
			{
				if(map.containsKey(a[i]+d))
					count++;
				if(map.containsKey(a[i]-d))
					count++;
			}
			
			map.remove(a[i]);
		}
		
		System.out.println(count);
	}

}
