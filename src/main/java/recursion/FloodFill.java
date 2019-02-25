package recursion;

import java.util.Scanner;

public class FloodFill {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0){
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			int[][] a = new int[m][n];
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					a[i][j] = scanner.nextInt();
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int k = scanner.nextInt();
			floodFill(a,m,n,x,y,k);
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					System.out.print(a[i][j]+" ");
			System.out.println();
			
		}

	}
	
	static void floodFill(int[][]a, int m, int n, int x, int y, int k) {
		
		if(x<0 || y<0 || x>=m || y>=n)
			return;
		floodFill(a,m,n,x,y,k,a[x][y]);
	}
	
	static void floodFill(int[][]a, int m, int n, int x, int y, int k, int src) {
		if(x<0 || y<0 || x>=m || y>=n)
			return;
		if(a[x][y]!=src)
			return;
		
		a[x][y] = k;
		floodFill(a,m,n,x,y-1,k,src);
		floodFill(a,m,n,x,y+1,k,src);
		floodFill(a,m,n,x-1,y,k,src);
		floodFill(a,m,n,x+1,y,k,src);
	}

}
