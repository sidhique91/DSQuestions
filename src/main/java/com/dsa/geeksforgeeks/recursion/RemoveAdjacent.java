package com.dsa.geeksforgeeks.recursion;

import java.util.Scanner;

public class RemoveAdjacent {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0)
		{
			String str = scanner.next();
			String result = remove(str,new Last());
			System.out.println(result);
			
		}

	}
	
	static String remove(String str, Last last) {
		
		if(str.length() == 0 || str.length() == 1)
			return str;
		
		if(str.charAt(0) == str.charAt(1)) {
			while(str.length() > 1 && str.charAt(0) == str.charAt(1))
				str = str.substring(1);
			last.removed = str.charAt(0);
			str = str.substring(1);
			return remove(str,last);
		}
		
		String tempStr = str;
		str = str.substring(0, 1);
		String remStr = remove(tempStr.substring(1),last);
		
		if(remStr.length() != 0 && remStr.charAt(0) == str.charAt(0)) {
			last.removed = str.charAt(0);
			return remStr.substring(1);
		}
		
		if(remStr.length() == 0 && last.removed == str.charAt(0))
			return remStr.substring(1);
		

		return str.charAt(0) + remStr;
			
	}
	
	static class Last{
		char removed;

		@Override
		public String toString() {
			return removed +"";
		}
		
		
	}

}
