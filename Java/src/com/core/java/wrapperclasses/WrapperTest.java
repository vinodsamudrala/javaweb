package com.core.java.wrapperclasses;

public class WrapperTest {
	public static void main(String[] args) {
		
		int x = 100;
		
		Integer i = new Integer(100);
		
		int y = i; // y = i.intValue(); added by compiler. // Unboxing
		
		Integer j = x; // j = new Integer(x); coverted bt compiler // boxing
		
		System.out.println( y == j);
		
		System.out.println(x +" "+ i +" "+j+" "+y );
	
	}

}
