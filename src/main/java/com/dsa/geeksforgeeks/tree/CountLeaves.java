package com.dsa.geeksforgeeks.tree;

public class CountLeaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int countLeaves(Node node) 
    {
		if(node == null)
			return 0;
		
		if(node.left == null && node.right == null)
			return 1;
		
		int left = countLeaves(node.left);
		int right = countLeaves(node.right);
		return left+right;
    }

}
