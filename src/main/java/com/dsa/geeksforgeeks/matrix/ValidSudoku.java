package com.dsa.geeksforgeeks.matrix;

import java.util.Scanner;

public class ValidSudoku {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- >0)
		{
			int[][] a = new int[9][9]; 
			
			for(int i=0;i<9;i++)
				for(int j=0;j<9;j++)
					a[i][j] = scanner.nextInt();
			
			if(isSudokuValid(a))
				System.out.println(1);
			else
				System.out.println(0);
				
		}

	}
	
	static boolean isSudokuValid(int[][] a) {
		
		boolean isSolved = true;
		int row = -1, col = -1;
		
		for(int i=0;i<9;i++)
			for(int j=0;j<9;j++)
				if(a[i][j] == 0) {
					isSolved = false;
					row = i;
					col = j;
					break;
				}
		
		if(isSolved)
			return true;
		
		for(int num = 1;num<=9;num++) {
			if(isSafe(a,num,row,col)) {
				a[row][col] = num;
				if(isSudokuValid(a))
					return true;
				a[row][col] = 0;
				
			}
			
		}
					
		return false;
	}
	
	static boolean isSafe(int[][] a, int num, int row, int col)
	{
		for(int i=0;i<9;i++)
			if(a[row][i] == num || a[i][col] == num)
				return false;
		
		int b = 3;
		int rStart = row-(row%b);
		int colStart = col-(col%b);
		
		for(int i=rStart;i<rStart+b;i++)
			for(int j=colStart;j<colStart+b;j++)
				if(a[i][j] == num)
					return false;
		
		return true;
	}

}
