package com.dsa.geeksforgeeks.searching;

import java.util.Scanner;

public class MissingNoAP {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		while(t-- > 0)
		{
			int n = scanner.nextInt();
			int [] a = new int[n];
			
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();
			
			System.out.println(missingNo(a));
			
		}
	}

	static int missingNo(int[] a) {
		
		int n = a.length;
		int f = Math.min(a[n-1]-a[n-2], a[1]-a[0]);
		f = (a[n-1]-a[0])/n;
		
		return missingNo(a,f,0,n-1);

	}

	static int missingNo(int[] a, int f, int l, int r) {
		if (l > r)
			return -1;

		int m = l + (r - l) / 2;

		if (m > 0 && (a[m] - a[m - 1]) != f)
			return a[m] - f;
		else if (m < a.length - 1 && (a[m + 1] - a[m]) != f)
			return a[m] + f;
		else if ((a[0] + m * f) == a[m])
			return missingNo(a, f, m + 1, r);
		else
			return missingNo(a, f, l, m - 1);

	}

}
