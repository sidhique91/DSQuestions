package com.dsa.geeksforgeeks.matrix;

import java.util.Scanner;

public class RowWithMaxOnes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- >0)
		{
			int m = scanner.nextInt();
			int n= scanner.nextInt();
			int[][] a = new int[m][n]; 
			
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					a[i][j] = scanner.nextInt();
			
			System.out.println(count(a,m,n));
				
		}

	}
	
	static int count(int[][] a, int m, int n) {
		
		int row = 0;
		int col = n-1;
		int maxRow = 0;
		
		while(row<m && col>=0) {
			if(a[row][col] == 1) {
				col--;
				maxRow=row;
			}
			else
				row++;
		}
		return maxRow;
	}

}
