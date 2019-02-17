package com.dsa.geeksforgeeks.hashing;

import java.io.*;
import java.util.*;

public class NutBoltMatching {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- > 0)
		{
			int n = scanner.nextInt();
			
			char[] a = new char[n];
			char[] b = new char[n];

			for(int j=0;j<n;j++)
					a[j]=scanner.next().charAt(0);
			
			for(int j=0;j<n;j++)
				b[j]=scanner.next().charAt(0);
			
			nutBoltmatching(a,b);
		}

	}
	
	static void nutBoltmatching(char[] a, char[] b)
	{
		char[] nutSet = {'!','#','$','%','&','*','@','^','~'};
		HashSet<Character> set = new HashSet<>();
		HashSet<Character> commonSet = new HashSet<>();
		
		for(int i=0;i<a.length;i++)
			set.add(a[i]);
		
		for(int i=0;i<b.length;i++)
			if(set.contains(b[i]))
				commonSet.add(b[i]);
		
		for(int i=0;i<nutSet.length;i++)
			if(commonSet.contains(nutSet[i]))
				System.out.print(nutSet[i]+" ");
	}

}
