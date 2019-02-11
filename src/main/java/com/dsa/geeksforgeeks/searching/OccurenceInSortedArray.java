package com.dsa.geeksforgeeks.searching;

import java.util.Scanner;

public class OccurenceInSortedArray {

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
			
			System.out.println(countOccurence(a,k));
			
		}

	}
	
	static int countOccurence(int[] a, int k)
	{

		int count = -1;
		
		int index = findIndex(a,k,0,a.length-1);
		
		if(index!=-1)
		{
			int i = index;
			while(i>=0 && a[i] == k)
				i--;
			
			int leftCount = index-i;
			i = index;
			
			while(i<a.length && a[i] == k)
				i++;
			
			int rightCount = i-index;
			
			count = leftCount+rightCount-1;
		}
		
		return count;
				
	}
	
	static int findIndex(int[] a, int k, int l, int r)
	{
		if(l>r)
			return -1;
		
		int m = l+(r-l)/2;
		
		if(a[m] == k)
			return m;
		else if(a[m] <k)
			return findIndex(a,k,m+1,r);
		else
			return findIndex(a,k,l,m-1);
	}

}
