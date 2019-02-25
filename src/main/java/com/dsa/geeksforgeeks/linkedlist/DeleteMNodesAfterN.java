package com.dsa.geeksforgeeks.linkedlist;

import java.util.Scanner;

public class DeleteMNodesAfterN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-- > 0){
			int n = scanner.nextInt();
			Node head = new Node();
			head.data = scanner.nextInt();
			Node temp = head;
			while(n-- > 1) {
				Node node = new Node();
				node.data = scanner.nextInt();
				temp.next = node;
				temp = node;
			}
			
			int m = scanner.nextInt();
			int p = scanner.nextInt();
			
			Node newHead = delete(head,m,p);
			
			while(newHead != null) {
				System.out.print(newHead.data+" ");
				newHead = newHead.next;
			}
			
		}

	}
	
	static Node delete(Node head, int m, int n) {
		if(head == null)
			return null;
		
		Node prev = null;
		int count =0;
		Node tempHead = head;
		while(head!=null) {
			if(count == m) {
				int tempCount = n;
				while(head != null && tempCount > 0) {
					head = head.next;
					tempCount--;
				}
				if(prev != null) {
					prev.next = head;
					count = 0;
				}
			}
			else {
				count++;
				prev = head;
				head = head.next;
			}
		}
		
		return tempHead;
	}

}
