package com.dsa.geeksforgeeks.tree;

import java.util.*;

public class LeftView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int maxLevel;
	
	void leftView(Node root)
    {
		maxLevel = -1;
		leftView(root,0);
    }
	
	void leftView(Node root, int level) {
		if(root == null)
			return;
		
		if(level>maxLevel) {
			System.out.print(root.data+" ");
			maxLevel = level;
		}
		
		leftView(root.left,level+1);
		leftView(root.right,level+1);
	}

}
