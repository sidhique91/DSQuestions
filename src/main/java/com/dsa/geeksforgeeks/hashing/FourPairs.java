package com.dsa.geeksforgeeks.hashing;

import java.util.*;
import java.util.stream.Collectors;

public class FourPairs {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- > 0)
		{
			int n= scanner.nextInt();
			int sum= scanner.nextInt();
			int[] a = new int[n]; 
			
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();
			
			fourPairs(a,sum);
			System.out.println();
		}

	}
	
	static void fourPairs(int[] a,int sum)
	{
		HashMap<Integer,List<Pair>> map = new HashMap<>();
		Set<String> resultSet = new HashSet<>();
		List<Quadruple> resultList = new ArrayList<>();
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(map.containsKey(a[i]+a[j]))
					map.get(a[i]+a[j]).add(new Pair(a[i],a[j]));
				else {
					List<Pair> list = new ArrayList<>();
					list.add(new Pair(a[i],a[j]));
					map.put(a[i]+a[j], list);
				}
					
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(map.containsKey(sum-(a[i]+a[j]))) {
					List<Pair> list = map.get(sum-(a[i]+a[j]));
					for(Pair pair: list)
					{
						if(pair.a != a[i] && pair.b != a[j] &&pair.b != a[i] && pair.a != a[j]) {
							List<Integer> temp = Arrays.asList(a[i],a[j],pair.a,pair.b);
							Collections.sort(temp);
							String result="";
							for(Integer val : temp)
								result = result + val + " ";
							resultSet.add(result);
						}
							
					}
				}
				
			}
		}
		
		System.out.println(resultSet.size());
		
		
		
		if(resultSet.isEmpty()) {
			System.out.print(-1);
			return;
		}
		
		Comparator<Quadruple> comp = Comparator.comparing(Quadruple::getFirst)
											   .thenComparing(Quadruple::getSecond)
											   .thenComparing(Quadruple::getThird)
											   .thenComparing(Quadruple::getFourth);
		
		resultList = resultSet.stream().map(Quadruple::new).collect(Collectors.toList());
		Collections.sort(resultList, comp);
		
		for(Quadruple result : resultList)
			System.out.print(result.toString()+"$");
		

	}
	
	static class Pair
	{
		int a,b;
		Pair(int a, int b)
		{
			this.a = a;
			this.b = b;
		}
	}
	
	static class Quadruple {
		
		int first,second,third,fourth;

		Quadruple(int first, int second, int third, int fourth) {
			super();
			this.first = first;
			this.second = second;
			this.third = third;
			this.fourth = fourth;
		}
		
		Quadruple(String value) {
			super();
			String[] a = value.split(" ");
			this.first = Integer.valueOf(a[0]);
			this.second = Integer.valueOf(a[1]);;
			this.third = Integer.valueOf(a[2]);;
			this.fourth = Integer.valueOf(a[3]);;
		}

		int getFirst() {
			return first;
		}

		int getSecond() {
			return second;
		}

		int getThird() {
			return third;
		}

		int getFourth() {
			return fourth;
		}

		@Override
		public String toString() {
			return first + " " + second + " " + third + " " + fourth + " ";
		}
		
		
		
	}

}
