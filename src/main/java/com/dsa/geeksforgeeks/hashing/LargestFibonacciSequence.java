package com.dsa.geeksforgeeks.hashing;

import java.util.*;

public class LargestFibonacciSequence {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- >0)
		{
			int n= scanner.nextInt();
			Integer[] a = new Integer[n]; 
			
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();
			
			largestFibonacciSequence(a);
			System.out.println();
				
		}

	}
	
	static void largestFibonacciSequence(Integer[] a)
	{
		int max = Collections.max(Arrays.asList(a));
		Set<Integer> fibSet = generateFibonacci(max);
		for(int i=0;i<a.length;i++)
			if(fibSet.contains(a[i]))
				System.out.print(a[i]+" ");
	}
	
	static Set<Integer> generateFibonacci(int max)
	{
		Set<Integer> result	 = new HashSet<>();
		result.add(0);
		result.add(1);
		int first = 0;
		int second = 1;
		
		while(second <=max)
		{
			int sum = first+second;
			
			if(sum > max)
				break;
			
			result.add(sum);
			first = second;
			second = sum;
		}
		
		return result;
	}

}
