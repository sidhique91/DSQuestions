package com.dsa.geeksforgeeks.tree;

public class LCA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Node LCA(Node root, int n1,int n2)
	{
		Status status = new Status();
		Node res= LCA(root,n1,n2,status);
		
		if(status.v1 && status.v2)
			return res;
		
		return null;
		
	}
	
	Node LCA(Node root, int n1,int n2,Status status)
	{
		if(root == null)
			return null;
		
		Node temp = null;
		
		if(root.data == n1) {
			temp = root;
			status.v1 = true;
		}
		
		if(root.data == n2) {
			temp = root;
			status.v2 = true;
		}
		
		Node left = LCA(root.left,n1,n2,status);
		Node right = LCA(root.right,n1,n2,status);
		
		if(temp!=null)
			return temp;
		
		if(left !=null && right!=null)
			return root;
		
		return left!=null?left:right;
		
		
	}
	
	class Status{
		boolean v1=false;
		boolean v2=false;
	}

}
