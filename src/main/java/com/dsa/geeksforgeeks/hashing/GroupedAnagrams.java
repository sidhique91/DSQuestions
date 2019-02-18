package com.dsa.geeksforgeeks.hashing;

import java.util.*;

public class GroupedAnagrams {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- > 0)
		{
			int n = scanner.nextInt();
			String[] a = new String[n];
			for(int i=0;i<n;i++)
				a[i] = scanner.next();
			groupedAnagrams(a);
			System.out.println();
		}

	}
	
	static void groupedAnagrams(String[] a)
	{
		HashMap<String,Integer> map = new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			char[] charArray = a[i].toCharArray();
			Arrays.sort(charArray);
			String sortedWord = String.valueOf(charArray);
			
			map.compute(sortedWord, (k,v)-> v==null?1:v+1);
		}
		
		List<Integer> list = new ArrayList<>(map.values());
		Collections.sort(list);
		for(Integer val:list)
		{
			System.out.print(val+" ");
		}
	}

}
