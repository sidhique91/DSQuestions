package com.dsa.geeksforgeeks.tree;

import java.util.*;

public class RightView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int maxLevel;
	
	void rightView(Node root)
    {
		maxLevel = -1;
		rightView(root,0);
    }
	
	void rightView(Node root, int level) {
		if(root == null)
			return;
		
		if(level>maxLevel) {
			System.out.print(root.data+" ");
			maxLevel = level;
		}
		
		rightView(root.right,level+1);
		rightView(root.left,level+1);
	}

}
