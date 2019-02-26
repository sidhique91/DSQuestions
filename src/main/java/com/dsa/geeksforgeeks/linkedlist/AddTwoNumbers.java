package com.dsa.geeksforgeeks.linkedlist;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		Node a = new Node(3);
		a = addData(a,new Node(2));
		a = addData(a,new Node(1));
		
		Node b = new Node(9);
		b = addData(b,new Node(8));
		b = addData(b,new Node(7));
		
		Node result = addNumbers(a,b);
		printList(result);

	}
	
	static Node addData(Node head, Node val) {
		if(val != null) {
			val.next = head;
			head = val;
		}
		return head;
	}
	
	static void printList(Node head) {
		while(head!= null) {
			System.out.print(head.data);
			head = head.next;
		}
	}
	
	static Node addNumbers(Node a, Node b) {
		Node carry = new Node(0);
		Node result = addSame(a,b,carry);
		if(carry.data!= 0) {
			carry.next = result;
			return carry;
		}
		return result;
	}
	
	static Node addSame(Node a, Node b,Node carry) {
		if(a == null)
			return null;
		
		Node nextNode = addSame(a.next,b.next,carry);
		Node result = new Node();
		int sum = a.data+b.data+carry.data;
		carry.data = sum/10;
		result.data = sum%10;
		result.next = nextNode;
		return result;
	}

}
