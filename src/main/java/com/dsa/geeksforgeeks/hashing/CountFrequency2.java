package com.dsa.geeksforgeeks.hashing;

import java.util.Scanner;

public class CountFrequency2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- > 0)
		{
			int n = scanner.nextInt();
			
			int[] a = new int[n];
			
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();
			
			countFreq(a,n);
		}

	}
	
	static void countFreq(int[] a,int n)
	{
		for(int i=0;i<n;i++)
		{
			int index = (a[i]-1)%(n+1);
			a[index] += (n+1);
		}
		
		for(int j=0;j<n;j++)
		{
			int count = a[j]/(n+1);
			System.out.print(count+" ");
		}
	}

}
