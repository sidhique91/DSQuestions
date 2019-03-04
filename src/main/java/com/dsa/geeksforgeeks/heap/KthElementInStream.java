package com.dsa.geeksforgeeks.heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthElementInStream {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- > 0)
		{
			int k = scanner.nextInt();
			int n = scanner.nextInt();
			
			int[] a = new int[n];
			
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();
			
			kLargeInStream(a,n,k);
			System.out.println();
		}

	}
	
	static void kLargeInStream(int[]a, int n, int k)
	{
		if(n<1)
			System.out.print(-1);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(k);
		for(int i=0;i<n;i++) {
			if(i<k-1) {
				System.out.print(-1+" ");
				pq.offer(a[i]);
				continue;
			}
			
			if(i==k-1) {
				pq.offer(a[i]);
				System.out.print(pq.peek()+" ");
				continue;
			}
			
			if(a[i] > pq.peek()) {
				pq.poll();
				pq.offer(a[i]);
				System.out.print(pq.peek()+" ");
			}
			else
				System.out.print(pq.peek()+" ");
				
		}
	}

}
