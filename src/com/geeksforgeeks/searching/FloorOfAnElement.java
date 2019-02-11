package com.geeksforgeeks.searching;

import java.util.Scanner;

public class FloorOfAnElement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		while(t-- > 0)
		{
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int [] a = new int[n];
			
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();
			
			System.out.println(floorSearch(a,k));
			
		}
	}
	
	static int floorSearch(int[] a, int k)
	{
		if(k < a[0])
			return -1;
		else
			return floorSearch(a,k,0,a.length-1);
	}
	
	static int floorSearch(int[]a,int k, int l, int r)
	{
		if(l>r)
			return -1;
		
		int m = l+(r-l)/2;
		
		if(a[m] == k)
			return m;
		
		else if(a[m] < k)
			return Math.max(floorSearch(a,k,m+1,r), m);
		
		else
			return floorSearch(a,k,l,m-1);

	}

}
