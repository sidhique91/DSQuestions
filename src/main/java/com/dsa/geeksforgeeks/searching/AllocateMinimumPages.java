package com.dsa.geeksforgeeks.searching;

import java.util.Scanner;

public class AllocateMinimumPages {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		while(t-- > 0)
		{
			int n = scanner.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();
			int m = scanner.nextInt();
			
			System.out.println(allocateMin(a,m));
		}

	}
	
	static long allocateMin(int [] a, int m)
	{
		long start = 0, end = 0;
		long result = Long.MAX_VALUE;
		
		if(a.length < m)
			return -1;
		
		for(int i=0;i<a.length;i++)
		{
			end+=a[i];
		}
		
		while(start<=end)
		{
			long mid = start+(end-start)/2;
			
			if(isPossible(a,m,mid))
			{
				result = Math.min(result, mid);
				end = mid-1;
			}
			else
				start = mid+1;
		}
		
		return result;
	}
	
	static boolean isPossible(int[] a, long m,  long maxPages)
	{
		int currMax = 0;
		int studentCount = 1;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] > maxPages)
				return false;
			
			if(currMax+a[i] > maxPages)
			{
				currMax = a[i];
				studentCount++;
				
				if(studentCount > m)
					return false;
			}
			else
			{
				currMax += a[i];
			}
		}
		
		return true;
	}

}
