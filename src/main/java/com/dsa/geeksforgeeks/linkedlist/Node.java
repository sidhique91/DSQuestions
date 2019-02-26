package com.dsa.geeksforgeeks.linkedlist;

public class Node {

	public int data;
	public Node next;
	
	public Node(){
		
	}
	
	public Node(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return ""+data;
	}
}
