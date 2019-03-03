package com.dsa.geeksforgeeks.tree;

import java.util.*;

public class BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void levelOrder(Node node) 
    {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        
        while(!queue.isEmpty()) {
        	Node curr = queue.poll();
        	System.out.print(curr.data+" ");
        	if(curr.left!=null)
        		queue.offer(curr.left);
        	if(curr.right!=null)
        		queue.offer(curr.right);
        }
    }

}
