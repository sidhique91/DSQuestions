package com.dsa.geeksforgeeks.matrix;

import java.util.Scanner;

public class CountPairsInTwoMatrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- >0)
		{
			int n= scanner.nextInt();
			int sum = scanner.nextInt();
			int[][] a = new int[n][n]; 
			int[][] b = new int[n][n]; 
			
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					a[i][j] = scanner.nextInt();
			
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					b[i][j] = scanner.nextInt();
			
			System.out.println(countPairs(a,b,n,sum));
				
		}

	}
	
	static int countPairs(int[][]a,int[][]b,int n, int sum) {
		int count = 0;
		int r1 =0,c1=0;
		int r2=n-1,c2=n-1;
		
		while(r1<n && r2>=0) {
			
			int tempSum = a[r1][c1] + b[r2][c2];
			if(tempSum == sum) {
				count++;
				c1++;
				c2--;
			}
			else if(tempSum<sum)
				c1++;
			else
				c2--;
			
			if(c1==n) {
				c1=0;
				r1++;
			}
			
			if(c2==-1) {
				c2=n-1;
				r2--;
			}
	
		}
		return count;
	}

}
