package com.dsa.geeksforgeeks.searching;

import java.util.Scanner;

public class SearchRotatedArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		while(t-- > 0)
		{
			int n = scanner.nextInt();
			int [] a = new int[n];
			
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();
			
			int k = scanner.nextInt();
			
			System.out.println(searchRotated(a,k,0,a.length-1));
			
		}
	}
	
	static int searchRotated(int[] a, int k, int l,int r)
	{
		if(l>r)
			return -1;
		
		int m = l+(r-l)/2;
		
		if(a[m] == k)
			return m;
		
		if(l < m && a[l] <= a[m-1])
		{
			if(a[l] <= k && a[m-1] >= k)
				return searchRotated(a,k,l,m-1);
			else
				return searchRotated(a,k,m+1,r);
		}
		else
		{
			if(a[m-1] <= k && a[r] >= k)
				return searchRotated(a,k,m+1,r);
			else
				return searchRotated(a,k,l,m-1);
		}
	}
}
