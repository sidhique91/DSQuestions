package com.dsa.geeksforgeeks.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray012 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0)
		{
			int n = scanner.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();
			sort(a);
			for(int i=0;i<n;i++)
				System.out.print(a[i]+" ");
			System.out.println();
		}

	}
	
	static void sort(int[] a)
	{
		int start = 0, end = a.length-1, i=0;
		
		while(i<a.length)
		{
			if(a[i]==0)
			{
				if(i!=start)
					swap(a,i,start);
				
				i++;start++;
			}
			else if(a[i] == 2 && i<=end)
			{
				if(i!=end)
					swap(a,i,end);
				
				end--;
			}
			else
				i++;
				
		}
	}
	
	static void swap(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
