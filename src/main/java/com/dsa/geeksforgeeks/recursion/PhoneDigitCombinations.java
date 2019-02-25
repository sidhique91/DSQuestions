package com.dsa.geeksforgeeks.recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDigitCombinations {
	
	static Map<Integer,String> map = new HashMap<Integer,String>() {
		{
			put(1,"");
			put(2,"abc");
			put(3,"def");
			put(4,"ghi");
			put(5,"jkl");
			put(6,"mno");
			put(7,"pqrs");
			put(8,"tuv");
			put(9,"wxyz");
		}
	};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0){
			int n = scanner.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();
			combination(a,n,0,"");
			System.out.println();
		}

	}
	
	static void combination(int[] a,int n,int pos,String prefix) {
		
		if(pos == n) {
			System.out.print(prefix+" ");
			return;
		}
		
		String str = map.get(a[pos]);
		if(str.length() == 0) {
			combination(a,n,pos+1,prefix);
		}
			
		for(int i=0;i<str.length();i++) {
			combination(a,n,pos+1,prefix+str.charAt(i));
		}
		
	}

}
