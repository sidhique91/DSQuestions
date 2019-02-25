package com.dsa.geeksforgeeks.matrix;

import java.util.Scanner;

public class SquaresInMatrix {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- >0)
		{
			int m = scanner.nextInt();
			int n= scanner.nextInt();
			countSquares(m,n);
				
		}

	}
	
	static void countSquares(int m, int n)
	{
		if (n < m) 
	    { 
	        int temp = m; 
	        m = n; 
	        n = temp; 
	    } 
	          
	    long count =  m * (m + 1) * (2 * m + 1) /  
	        6 + (n - m) * m * (m + 1) / 2; 
		
		System.out.println(count);
		
	}

}
