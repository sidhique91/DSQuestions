package com.dsa.geeksforgeeks.tree;

public class HeightOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int height(Node node) 
    {
        if(node == null)	
        	return 0;
        
        int left = height(node.left);
        int right = height(node.right);
        return 1+Math.max(left, right);
    }

}
