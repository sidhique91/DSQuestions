package com.dsa.geeksforgeeks.matrix;

import java.util.Scanner;

public class BooleanMatrix {

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
			
			booleanMatrix(a,m,n);
				
		}

	}
	
	static void booleanMatrix(int[][] a, int m, int n) {
		
		boolean rowFlag = false;
		boolean colFlag = false;
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j] == 1) {
					
					if(i==0)
						rowFlag = true;
					if(j==0)
						colFlag = true;
					
					a[0][j] = 1;
					a[i][0] = 1;
				}
			}
		}
		
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				if(a[0][j] == 1 || a[i][0] == 1) {
					a[i][j] = 1;
				}
			}
		}
		
		if(rowFlag)
			for(int i=0;i<n;i++)
				a[0][i] = 1;
		
		if(colFlag)
			for(int i=0;i<m;i++)
				a[i][0] = 1;
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		
		
	}

}
