package com.core.java.collections;

import java.util.ArrayList;

public class ArrListTest2 {

	public static void main(String[] args) {
		
		 ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");
		  al.add("Rakesh");
		    
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Ravi");  
		  al2.add("Hanumat");  
		  al2.add("vinod");  
		 
		  al.removeAll(al2);  
		  
		  System.out.println(al);
		 /* 
		  ArrayList<String> al3=new ArrayList<String>();  
		  
		  for(String se: al){
			  if(al2.indexOf(se) == -1){
				  al3.add(se);
				  //al.remove(se);
			  }
		  }
		  al=al3;*/
		  System.out.println(al);
		  //System.out.println(al3);
		  
		  
		  
	}
}
