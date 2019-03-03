package com.dsa.geeksforgeeks.tree;

import java.util.Scanner;

public class MaxSumPath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            if(n==0)
            {
                System.out.println(0);
                continue;
            }
            Node root = null;
            for(int i = 0; i < n; i++)
            {
                int a = sc.nextInt();
                int a1 = sc.nextInt();
                char lr = sc.next().charAt(0);
                if(i==0){
                    root=new Node(a);
                   
                    switch(lr){
                        case 'L':root.left=new Node(a1);
                                
                        break;
                        case 'R':root.right=new Node(a1);
                                 
                        break;
                    }
                }
                else
                {
                    insert(root, a, a1, lr);
                }
            }
           
           // System.out.println(maxPathSum(root));
        }

	}
	
	public static void insert(Node root, int a, int a1, char lr)
    {
         if(root==null){
            return;
        }
        if(root.data==a){
            switch(lr){
                case 'L':root.left=new Node(a1);
                break;
                case 'R':root.right=new Node(a1);
                break;
            }
            return;
        }
        insert(root.left,a,a1,lr);
        insert(root.right,a,a1,lr);
    }
	
	public static int maxPathSum(Node root)
    {
		return maxPathSum(root,new PathSum());
    }
	
	public static int maxPathSum(Node root, PathSum pathSum)
    {
		PathSum left = new PathSum();
		PathSum right = new PathSum();
		if(root == null) {
			pathSum.value = 0;
			return 0;
		}
		
		int leftPathSum = maxPathSum(root.left,left);
		int rightPathSum = maxPathSum(root.right,right);
		
		pathSum.value = Math.max(left.value,right.value)+root.data;
		
		return Math.max(left.value+right.value+root.data, Math.max(leftPathSum, rightPathSum));
    }
	
	static class PathSum{
		int value;
	}

}
