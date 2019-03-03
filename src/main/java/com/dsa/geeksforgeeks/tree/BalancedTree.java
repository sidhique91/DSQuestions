package com.dsa.geeksforgeeks.tree;

public class BalancedTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	boolean isBalanced(Node root)
    {
		if(root == null)
			return true;
		
		int left = height(root.left);
		int right = height(root.right);
		boolean isBalanced = Math.abs(left-right)>1?false:true;
		return isBalanced && isBalanced(root.left) && isBalanced(root.right);
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
