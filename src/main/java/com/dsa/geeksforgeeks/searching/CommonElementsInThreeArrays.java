package com.dsa.geeksforgeeks.searching;

import java.util.Scanner;

public class CommonElementsInThreeArrays {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- >0)
		{
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();
			int n3 = scanner.nextInt();
			
			int[] a = new int[n1];
			int[] b = new int[n2];
			int[] c = new int[n3];
			
			for(int i=0;i<n1;i++)
				a[i] = scanner.nextInt();
			
			for(int i=0;i<n2;i++)
				b[i] = scanner.nextInt();
			
			for(int i=0;i<n3;i++)
				c[i] = scanner.nextInt();
			
			printCommon(a,b,c,n1,n2,n3);
			System.out.println();
		}

	}
	
	static void printCommon(int[] a, int[] b, int[] c, int n1, int n2, int n3)
	{
		int i=0, j=0, k=0, count = 0;
		
		while(i<n1 && j<n2 && k<n3)
		{
			if(a[i] == b[j] && b[j] == c[k])
			{
				System.out.print(a[i] + " ");
				i++;j++;k++;count++;
			}
			else if(a[i] < b[j])
				i++;
			else if(b[j] < c[k])
				j++;
			else
				k++;
		}
		
		if(count == 0)
			System.out.print(-1);
	}

}
