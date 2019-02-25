package com.dsa.geeksforgeeks.recursion;

import java.util.Arrays;

public class TestClass {

	public static void main(String[] args) {
		
		
		int[] a = {1,2,3,4,5};
		int[] b = Arrays.copyOf(a, 3);
		int[] c = Arrays.copyOfRange(a, 0, 4);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));

	}

}
