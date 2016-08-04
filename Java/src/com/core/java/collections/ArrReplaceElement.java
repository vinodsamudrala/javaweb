package com.core.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrReplaceElement {

	public static void replace(ArrayList al, String rFrom, String rTo){
		int index = al.indexOf(rFrom);
		if(index > -1 ){
			al.remove(index);
			al.add(index, rTo);
		}
		
	}
	public static void main(String[] args) {
		ArrayList<String>  al = new ArrayList<String>();
		al.add("vinod");
		al.add("Rakesh");
		al.add("Dattu");
		al.add("Java");
		al.add("abc");
		
		//System.out.println("Before :"+al);
		//replace(al, "Ramu", "Shankar");
		//System.out.println("After:"+al);
		
		Iterator<String> il = al.iterator();
		while(il.hasNext()){
			
			String ele = il.next();
			if(ele.equals("Java"))
				al.remove(ele);
			//System.out.println(il.hasNext()+""+ele);
			
		}
		System.out.println(il.hasNext());
		System.out.println(al);
	}
	
	
}
