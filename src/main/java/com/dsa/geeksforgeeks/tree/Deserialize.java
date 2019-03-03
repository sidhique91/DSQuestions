package com.dsa.geeksforgeeks.tree;

import java.util.ArrayList;

public class Deserialize {

	public static void main(String[] args) {
		
		//int[] a = {20,8,4,-1,-1,12,10,-1,-1,14,-1,-1,22,-1,-1};
		//Position pos = new Position();
		//Node root = deserialize(a,pos);
		//inOrder(root);

	}
	
	static void inOrder(Node root) {
		if(root == null)
			return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public String serialize(Node root,ArrayList<Integer> aa) {
		preOrder(root,aa);
		String result = "";
		for(Integer val:aa)
			result= result+val+" ";
		
		return result;
	}
	
	public Node deSerialize(String data) {
		String[] a = data.split(" ");
		Position pos = new Position();
		return deserialize(a,pos);
	}
	
	public void preOrder(Node root, ArrayList<Integer> a) {
		
		if(root.data == -1)
			a.add(-1);
		
		a.add(root.data);
		preOrder(root.left,a);
		preOrder(root.right,a);
	}
	
	Node deserialize(String[] a, Position pos) {
		if(a[pos.value] == "-1") {
			pos.value++;
			return null;
		}
		
		Node root = new Node(Integer.valueOf(a[pos.value++]));
		root.left = deserialize(a,pos);
		root.right = deserialize(a,pos);
		return root;
	}
	
	class Position {
		int value=0;
		
		public String toString() {
			return ""+value;
		}
	}

}
