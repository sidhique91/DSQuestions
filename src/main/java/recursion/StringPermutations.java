package recursion;

import java.util.Arrays;
import java.util.Scanner;

import recursion.RemoveAdjacent.Last;

public class StringPermutations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0)
		{
			String str = scanner.next();
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			perm(String.valueOf(arr),"");
			System.out.println();
			
		}

	}
	
	static void perm(String str, String prefix) {
		if(str.length() == 0)
			System.out.print(prefix+" ");
		
		for(int i=0;i<str.length();i++) {
			String tempStr = str.substring(0, i)+str.substring(i+1,str.length());
			perm(tempStr,prefix+str.charAt(i));
		}
	}

}
