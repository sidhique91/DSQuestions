package com.dsa.geeksforgeeks.sorting;

import java.util.*;

public class MinimumSwapsForSortedArray {

	public static void main(String[] args) {
		int[] A = {3,5,2,4,6,8};
		System.out.println(minSwaps(A, A.length));
	}
	
	public static int minSwaps(int A[], int N){
	    
		int count = 0;
		Pair[] pairs = new Pair[N];
		for(int i=0;i<N;i++)
			pairs[i] = new Pair(i,A[i]);
		
		Arrays.sort(pairs, Comparator.comparing(Pair::getValue));
		
		boolean[] visited = new boolean[N];
		Arrays.fill(visited, false);
		
		for(int i=0;i<N;i++)
		{
			if(pairs[i].index == i || visited[i])
				continue;
			
			int cycleSize = 0;
			int j=i;
			
			while(!visited[j])
			{
				visited[j] = true;
				j=pairs[j].index;
				cycleSize++;
			}
				
			count = count+cycleSize-1;
			
		}
		
		return count;
	}
	
	public static class Pair {
		int value;
		int index;
		
		Pair(int index,int value)
		{
			this.value = value;
			this.index = index;
		}
		
		int getValue() {
			return this.value;
		}
	}

}
