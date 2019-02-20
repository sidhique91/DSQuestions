package com.dsa.geeksforgeeks.matrix;

import java.util.Scanner;

public class SpiralForm {

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
			
			printSpiral(a,m,n);
			System.out.println();
				
		}

	}
	
	static void printSpiral(int[][] a,int m, int n)
	{
		int rowStart=0,rowEnd=m-1,colStart=0,colEnd=n-1;
		
		while(rowStart<=rowEnd && colStart<=colEnd) {
			
			for(int i=colStart;i<=colEnd;i++)
				System.out.print(a[rowStart][i]+" ");
			rowStart++;
			
			for(int i=rowStart;i<=rowEnd;i++)
				System.out.print(a[i][colEnd]+" ");
			colEnd--;
			
			if(rowStart<=rowEnd) {
				for(int i=colEnd;i>=colStart;i--)
					System.out.print(a[rowEnd][i]+" ");
				rowEnd--;
			}
			
			if(colStart<=colEnd) {
				for(int i=rowEnd;i>=rowStart;i--)
					System.out.print(a[i][colStart]+" ");
				colStart++;
			}
		}
	}

}
