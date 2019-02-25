package com.dsa.geeksforgeeks.matrix;

import java.util.Scanner;

public class SearchInSortedMatrix {

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
			
			int k = scanner.nextInt();
			
			System.out.println(search(a,m,n,k));
				
		}

	}
	
	static int search(int[][] a,int m, int n, int k)
	{
		
		int row = m-1;
		int col = 0;
		
		while(col<n && row>=0) {
			
			if(a[row][col] == k)
				return 1;
			
			if(a[row][col] > k)
				row--;
			else
				col++;
		}
		return 0;
	}

}
