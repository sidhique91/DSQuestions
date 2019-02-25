package com.dsa.geeksforgeeks.matrix;

import java.util.Scanner;

public class ZerosInSortedMatrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- >0)
		{
			int n = scanner.nextInt();
			int[][] a = new int[n][n]; 
			
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					a[i][j] = scanner.nextInt();
			
			System.out.println(countZeros(a,n));
				
		}

	}
	
	static int countZeros(int[][] a, int n) {
		
		int count=0;
		int row = n-1;
		int col = 0;
		
		while(col < n) {
			
			while(a[row][col] == 1) {
				if(row-- <= 0)
					return count;
			}
			
			count+=(row+1);
			col++;
		}
		
		return count;
	}

}
