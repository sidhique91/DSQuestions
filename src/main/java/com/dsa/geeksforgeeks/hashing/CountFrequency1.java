package com.dsa.geeksforgeeks.hashing;

import java.util.Scanner;

public class CountFrequency1 {

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
		int i=0;
		
		while(i<n)
		{
			if(a[i] <= 0)
			{
				i++;
				continue;
			}
			
			int elementIndex = a[i]-1;
			
			if(a[elementIndex] > 0)
			{
				a[i] = a[elementIndex];
				a[elementIndex] = -1;
			}
			else
			{
				a[elementIndex]--;
				a[i] = 0;
				i++;
			}
		}
		
		for(int j=0;j<n;j++)
		{
			int count = Math.abs(a[j]);
			System.out.print(count+" ");
		}
	}

}
