package com.dsa.geeksforgeeks.sorting;

import java.util.*;
import java.util.Map.Entry;

public class RelativeSorting {

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
			
			relativeSort(a,b);
			
			 System.out.println(Arrays.toString(a));
			
		}

	}
	
	static void relativeSort(int[] a, int[] b)
	{
		int m = a.length;
		int n = b.length;
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<m;i++)
			map.compute(a[i], (k,v) -> v==null?1:v+1);
		
		int k = 0;
		for(int i=0;i<n;i++)
		{
			if(map.containsKey(b[i]))
			{
				int count = map.get(b[i]);
				while(count-- > 0)
					a[k++] = b[i];
				map.remove(b[i]);
			}
		}
		
		int s = k;
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for(Map.Entry<Integer, Integer> entry : entrySet)
		{
			int count = entry.getValue();
			while(count-- > 0)
				a[k++] = entry.getKey();
		}
		
		Arrays.sort(a, s, m-1);
	}

}
