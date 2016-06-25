package com.core.java.stringtest;

public class StringTest2 {

	public static void main(String[] args) {
		
		String name = "xyz;vinod;rakesh";
		
		name = name.replace(";", " ");
		
		System.out.println(name);
		
		System.out.println("String length()"+name.length());
		
		String content = "HiJavaWelcomeJavaByeJavaJavavinodJava";// "hiwelcomebye";
		
		String searchingWord = "Java";
		
		int totalLen = content.length();
		
		content = content.replace(searchingWord,"");
		
		int newlen = content.length();
		 
		System.out.println( (totalLen-newlen) / searchingWord.length());
		
		
	}
}
