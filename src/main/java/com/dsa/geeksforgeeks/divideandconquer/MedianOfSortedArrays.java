package com.dsa.geeksforgeeks.divideandconquer;

import java.util.Arrays;

public class MedianOfSortedArrays {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 6};  
	    int b[] = {4, 6, 8, 10};
	    System.out.println(findMedian(a,b,a.length));
	}
	
	static int findMedian(int[] a, int[] b, int n) {
		if(n<=0)
			return -1;
		if(n==1)
			return (a[0]+b[0])/2;
		
		if(n==2)
			return (Math.max(a[0], b[0])+Math.min(a[1], b[1]))/2;
		
		int m1 = median(a,n);
		int m2 = median(b,n);
		
		if(m1 > m2) {
			if(n%2 == 0)
				return findMedian(Arrays.copyOfRange(a, 0, n/2),Arrays.copyOfRange(b, n/2, n),n/2);
			return findMedian(Arrays.copyOfRange(a, 0, n/2+1),Arrays.copyOfRange(b, n/2, n),n/2+1);
		}
		else {
			if(n%2 == 0)
				return findMedian(Arrays.copyOfRange(b, 0, n/2),Arrays.copyOfRange(a, n/2, n),n/2);
			return findMedian(Arrays.copyOfRange(b, 0, n/2+1),Arrays.copyOfRange(a, n/2, n),n/2+1);
		}
	}
	
	static int median(int[] a, int n) {
		if(n%2 == 0)
			return (a[n/2]+a[(n/2) + 1])/2;
		else
			return a[n/2];
	}

}
