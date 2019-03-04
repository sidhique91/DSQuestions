package com.dsa.geeksforgeeks.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MedianInStream {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++)
			a[i] = scanner.nextInt();
		
		median(a,n);


	}
	
	static void median(int[] a, int n) {
		
		PriorityQueue<Integer> min = new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Integer> max = new PriorityQueue<>();
		
		for(int i=0;i<n;i++) {
			if(min.isEmpty())
				min.offer(a[i]);
			else if(max.isEmpty())
				max.offer(a[i]);
			
			else if(a[i] <= min.peek())
				min.offer(a[i]);
			
			else if(a[i] > max.peek())
				max.offer(a[i]);
			
			if(min.size()-max.size()>1)
				max.offer(min.poll());
			
			if(min.size()==max.size())
				System.out.println((min.peek()+max.peek())/2);
			else
				System.out.println(min.peek());
		}
	}

}
