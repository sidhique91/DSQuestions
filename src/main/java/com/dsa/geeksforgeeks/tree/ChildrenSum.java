package com.dsa.geeksforgeeks.tree;

public class ChildrenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int isSumProperty(Node node)
    {
        if(node == null)
        	return 1;
        
        int left = node.left==null?0:node.left.data;
        int right = node.right ==null?0:node.right.data;
        
        if(left+right == node.data && isSumProperty(node.left) == 1 && isSumProperty(node.right) == 1)
        	return 1;
        else
        	return 0;
    }

}
