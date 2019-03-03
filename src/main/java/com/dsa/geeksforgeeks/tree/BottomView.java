package com.dsa.geeksforgeeks.tree;

import java.util.*;

public class BottomView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	TreeMap<Integer,Data> map;
	
	public void bottomView(Node root)
    {
		map = new TreeMap<>();
		bottomView(root,0,0);
		map.entrySet().stream().forEach(entry-> System.out.print(entry.getValue().value+" "));
    }
	
	public void bottomView(Node root,int height,int plane)
    {
        if(root == null)
        	return;
        
        Data data = map.get(plane);
        if(data == null)
        	map.put(plane, new Data(root.data,height));
        else {
        	if(data.height<=height) {
        		data.height = height;
        		data.value=root.data;
        	}
        }
        
        bottomView(root.left,height+1,plane-1);
        bottomView(root.right,height+1,plane+1);
    }
	
	class Data{
		int value;
		int height;
		
		public Data(int value,int height) {
			this.value = value;
			this.height = height;
		}
	}

}
