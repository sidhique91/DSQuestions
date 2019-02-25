package com.dsa.geeksforgeeks.divideandconquer;

import java.util.Arrays;
import java.util.Scanner;

public class KthElementInTwoSorted {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0)
		{
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();
			int k = scanner.nextInt();
			
			int[] a = new int[n1];
			int[] b = new int[n2];
			
			for(int i=0;i<n1;i++)
				a[i] = scanner.nextInt();
			
			for(int i=0;i<n2;i++)
				b[i] = scanner.nextInt();
			
			
			int result = kthVal(a,0,n1,b,0,n2,k);
			System.out.println(result);
		}

	}
	
	static int kthVal(int[] a, int[] b, int k) {
		
		if(a.length+b.length < k)
			return -1;
		
		if(a.length == 0)
			return b[k-1];
		
		if(b.length == 0)
			return a[k-1];
		
		if(a.length == 1) {
			if(a[0] < b[0])
				return kthVal(Arrays.copyOf(a, 0),b,k-1);
			else
				return kthVal(a,Arrays.copyOfRange(b, 1, b.length),k-1);
		}
		
		if(b.length == 1) {
			if(b[0] < a[0])
				return kthVal(a,Arrays.copyOf(b, 0),k-1);
			else
				return kthVal(Arrays.copyOfRange(a, 1, a.length),b,k-1);
		}
		
		
		
		int m1 = a.length/2;
		int m2 = b.length/2;
		
		if(m1+m2 < k) {
			if(a[m1] > b[m2])
				return kthVal(a,Arrays.copyOfRange(b, m2, b.length),k-m2);
			else
				return kthVal(Arrays.copyOfRange(a, m1, a.length),b,k-m1);
		}
		else {
			if(a[m1] > b[m2])
				return kthVal(Arrays.copyOfRange(a, 0, m1),b,k);
			else
				return kthVal(a,Arrays.copyOfRange(b, 0, m2),k);
		}
	}
	
	static int kthVal(int[] a, int s1,int e1, int[] b, int s2, int e2, int k) {
		
		if((e1-s1)+(e2-s2) < k)
			return -1;
		
		if(s1==e1)
			return b[k-1];
		
		if(s2==e2)
			return a[k-1];	
		
		int m1 = (e1+s1)/2;
		int m2 = (e2+s2)/2;
		
		if((m1-s1)+(m2-s2) < k) {
			if(a[m1] > b[m2])
				return kthVal(a,s1,e1,b,m2,e2,k-m2);
			else
				return kthVal(a,m1,e1,b,s2,e2,k-m1);
		}
		else {
			if(a[m1] > b[m2])
				return kthVal(a,s1,m1,b,s2,e2,k);
			else
				return kthVal(a,s1,e1,b,s2,m2,k);
		}
	}
	
	

}
