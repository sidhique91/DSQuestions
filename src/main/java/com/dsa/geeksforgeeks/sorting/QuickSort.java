package com.dsa.geeksforgeeks.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] a = {12,11,13,5,6};
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));

	}
	
	static void sort(int[] a,int l, int r)
	{
		if(r<l)
			return;
		
		int pivotIndex = partition(a,l,r);
	
		if(pivotIndex > 0)
			sort(a,l,pivotIndex-1);
		
		if(pivotIndex < a.length)
			sort(a,pivotIndex+1,r);
	}
	
	static int partition(int[] a, int l, int r)
	{
		int pivot = a[l];
		int i = l+1;
		int j=r;
		
		while(i<=j)
		{
			while(i<=r && a[i] < pivot)
				i++;
			
			while(j>l && a[j] > pivot)
				j--;
			
			if(i<j)
				swap(a,i,j);
				
		}
		swap(a,l,j);
		return j;
	}
	
	static void swap(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
