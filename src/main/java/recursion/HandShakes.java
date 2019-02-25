package recursion;

import java.util.Scanner;

public class HandShakes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		while(t-- > 0)
		{
			int n = scanner.nextInt();
			int res = handShakes(n);
			System.out.println(res);
			
		}

	}
	
	static int handShakes(int n) {
		if(n%2!=0)
			return 0;
		return catalan(n/2);
	}
	
	static int catalan(int n) {
		
		if(n<=0)
			return 1;
		
		int result = 0;
		
		for(int i=0;i<n;i++)
			result+=catalan(i)*catalan(n-i-1);
		
		return result;
	}

}
