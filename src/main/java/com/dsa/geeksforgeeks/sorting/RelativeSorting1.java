package com.dsa.geeksforgeeks.sorting;

import java.util.*;

public class RelativeSorting1 {

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
			
			for(int i=0;i<m;i++)
				System.out.print(a[i]+" ");
			System.out.println();
			
		}

	}
	
	static void relativeSort(int[] a, int[] b)
	{
		int m = a.length;
		int n = b.length;
		int k=0;
		
		int[] temp = new int[m];
		Set<Integer> visited = new HashSet<>();
		for(int i=0;i<m;i++)
			temp[i] = a[i];
		
		Arrays.sort(temp);
		
		for(int i=0;i<n;i++)
		{
			int index = Arrays.binarySearch(temp, b[i]);
			
			if(index == -1)
				continue;
			
			int j = index;
			
			while(j >= 0 && temp[j] == b[i])
			{
				a[k++] = b[i];
				j--;
			}
			
			j=index+1;
			while(j < m && temp[j] == b[i])
			{
				a[k++] = b[i];
				j++;
			}
			
			visited.add(b[i]);
			
		}
		
		for(int i=0;i<m;i++)
		{
			if(!visited.contains(temp[i]))
				a[k++] = temp[i];
		}
	}

}
