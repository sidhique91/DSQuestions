package com.dsa.geeksforgeeks.bst;

import java.util.*;

import com.dsa.geeksforgeeks.tree.Node;

public class BSTFromLevelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class NodeInfo{
		Node node;
		int min;
		int max;
		
		NodeInfo(Node node){
			this.node = node;
		}
	}
	
	public Node constructBST(int[] arr){
        
		if(arr.length < 1)
			return null;
		
		int n=arr.length;
		
		int i=0;
		NodeInfo nodeInfo = new NodeInfo(new Node(arr[i++]));
		nodeInfo.min=Integer.MIN_VALUE;
		nodeInfo.max=Integer.MAX_VALUE;
		Node root = nodeInfo.node;
		
		Queue<NodeInfo> queue = new LinkedList<>();
		queue.offer(nodeInfo);
		
		while(i<n) {
			
			NodeInfo temp = queue.poll();
			if(i<n && arr[i]>temp.min && arr[i]<temp.node.data) {
				nodeInfo.node = new Node(arr[i++]);
				nodeInfo.min=temp.min;
				nodeInfo.max=temp.node.data;
				temp.node.left=nodeInfo.node;
				queue.offer(nodeInfo);
			}
			if(i<n && arr[i]>temp.node.data && arr[i]<temp.max) {
				nodeInfo.node = new Node(arr[i++]);
				nodeInfo.min=temp.node.data;
				nodeInfo.max=temp.max;
				temp.node.right=nodeInfo.node;
				queue.offer(nodeInfo);
			}
				
		}
		return root;
		
		
    }

}
