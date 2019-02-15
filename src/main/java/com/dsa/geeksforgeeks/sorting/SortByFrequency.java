package com.dsa.geeksforgeeks.sorting;

import java.util.*;

public class SortByFrequency {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		while(t-- > 0)
		{
			int n = scanner.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();
			sortByFrequency(a);
			for(int i=0;i<n;i++)
				System.out.print(a[i]+" ");
			
		}

	}
	
	static void sortByFrequency(int[] a)
	{
		HashMap<Integer,Node> map = new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(a[i]))
				map.get(a[i]).count++;
			else
				map.put(a[i], new Node(i,a[i]));
		}
		
		List<Node> list = new ArrayList<>(map.values());
		Comparator<Node> comp= Comparator.comparing(Node::getCount).reversed().thenComparing(Node::getValue);
		Collections.sort(list, comp);
		
		int k=0;
		
		for(Node node:list)
		{
			int value= node.value;
			int count = node.count;
			
			while(count-->0)
				a[k++] = value;
		}
		
		
	}
	
	static class Node
	{
		int index;
		int count;
		int value;
		
		
		Node(int index,int value)
		{
			this.index = index;
			this.value = value;
			this.count = 1;
		}


		public int getIndex() {
			return index;
		}
		
		public int getCount() {
			return count;
		}
		
		public int getValue() {
			return value;
		}
		
	}

}
