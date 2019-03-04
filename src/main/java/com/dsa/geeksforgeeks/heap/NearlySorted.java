package com.dsa.geeksforgeeks.heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class NearlySorted {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- > 0)
		{
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			
			int[] a = new int[n];
			
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();
			
			sort(a,n,k);
			for(int i=0;i<n;i++)
				System.out.print(a[i]+" ");
		}

	}
	
	static void sort(int[]a, int n, int k) {
		if(n<1)
			return;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(k+1);
		
		for(int i=0;i<=k&& i<n;i++)
			pq.offer(a[i]);
		
		int index = 0;
		for(int i=k+1;i<n;i++) {
			int val = pq.poll();
			a[index++] = val;
			pq.offer(a[i]);
		}
		
		while(!pq.isEmpty())
			a[index++] = pq.poll();
	}

}
