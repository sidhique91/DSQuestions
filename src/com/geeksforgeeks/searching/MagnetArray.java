package com.geeksforgeeks.searching;

import java.util.Scanner;

public class MagnetArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		while(t-- > 0)
		{
			int n = scanner.nextInt();
			int [] a = new int[n];
			
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();
			
			nullForcePoints(a);
			
		}
		
	}
	
	static void nullForcePoints(int[] a)
	{
		
		for(int i=1;i<a.length;i++)
		{
			double nullForcePoint = nullForcePoints(a,a[i-1],a[i]);
			if(nullForcePoint!=-1)
				System.out.print( String.format("%.02f", Math.round(nullForcePoint * 100.0) / 100.0) + " ");
		}
	}
	
	static double nullForcePoints(int[] a,double l, double r)
	{
		if(l>r)
			return -1;
		
		double mid = l+ (r-l)/2;
		
		double netForce = netForce(a,mid);
		
		if(Math.abs(netForce) <=0.0000000000001)
			return mid;
		
		if(netForce < 0)
			return nullForcePoints(a,l,mid);
		else
			return nullForcePoints(a,mid,r);
	}
	
	static double netForce(int[] a, double x)
	{
		double result = 0;
		
		for(int i=0;i<a.length;i++)
			result+=(1/(x-a[i]));
		
		return result;
	}

}
