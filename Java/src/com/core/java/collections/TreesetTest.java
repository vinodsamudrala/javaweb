package com.core.java.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreesetTest {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(new Integer(80));
		treeSet.add(70);
		treeSet.add(40);
		treeSet.add(50);
		treeSet.add(60);
		treeSet.add(20);
		treeSet.add(10);
		treeSet.add(30);
		
		System.out.println(treeSet);
		
		
		
	}
}
