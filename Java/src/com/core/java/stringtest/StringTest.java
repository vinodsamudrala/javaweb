package com.core.java.stringtest;

public class StringTest {
public static void main(String[] args) {
	String x ="abcd";
	String y= "abcd";
	String z = new String("abcd");
	String j = new String("Abcd");
	String i = new String("abcd");
	
	System.out.println(x==y); //true;
	
	System.out.println(x==z); //false
	
	System.out.println(z==i); // false
	
	System.out.println(x.equals(j)); //false
	
	System.out.println(x.equalsIgnoreCase(j)); // true.
	}
}
