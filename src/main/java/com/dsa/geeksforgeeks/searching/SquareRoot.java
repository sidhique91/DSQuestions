package com.dsa.geeksforgeeks.searching;

public class SquareRoot {

	public static void main(String[] args) {
		
		//System.out.println(floorSqrt(10));

	}
	
	long floorSqrt(long x) {
		
		return floorSqrt(x,1,x);
	}

	long floorSqrt(long x,long l,long r	) {

		if(l>r)
			return 0;
		
		long m = l+(r-l)/2;
		
		if(m*m == x)
			return m;
		else if(m*m < x)
			return Math.max(floorSqrt(x,m+1,r),m);
		else
			return floorSqrt(x,l,m-1);
	}

}
