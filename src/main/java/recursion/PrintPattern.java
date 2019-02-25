package recursion;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		while(t-- > 0)
		{
			int n = scanner.nextInt();
			printPattern(n);
			System.out.println();
			
		}

	}
	
	static void printPattern(int n) {
		if( n==0 || n<0 ) {
			System.out.print(n+" ");
			return;
		}
		
		System.out.print(n+" ");
		printPattern(n-5);
		System.out.print(n+" ");
	}

}
