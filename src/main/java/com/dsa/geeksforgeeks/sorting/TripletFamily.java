package com.dsa.geeksforgeeks.sorting;

import java.util.Arrays;
import java.util.HashSet;

public class TripletFamily {

	public static void main(String[] args) {
		int[] a = {8, 10, 16, 6, 15, 25};
		tripletFamily1(a);

	}
	
	static void tripletFamily(int[] a)
	{
		Arrays.sort(a);
		
		for(int i=2;i<a.length;i++)
		{
			int l = 0;
			int r = i-1;
			
			while(l<r)
			{
				if(a[l]+a[r] == a[i])
				{
					System.out.println(a[l]+" "+a[r]+" "+a[i]);
					l++;r--;
				}
				else if(a[l]+a[r] < a[i])
					l++;
				else
					r--;
			}
		}
		
	}
	
	static void tripletFamily1(int[] a)
	{
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<a.length;i++)
			set.add(a[i]);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(set.contains(a[j]+a[i]))
					System.out.println(a[i]+" "+a[j]+" "+(a[i]+a[j]));
			}
		}
		
	}

}
