package com.corejava.com.core.java.staticblocks;

class Parent8{

	static{
		
		System.out.println("Parent Static Block");
	}
}
class Child8 extends Parent8{

	static{

		System.out.println("child Static Block");
	}
}


public class StaticBlocks {

	static int x = 10;
	
	int y = 0;
	

	static{
		
		String a[] = {""};
		
		main(a);
		
		System.out.println("Hello "+ x );
	}
	
	public static void main(String[] args) {
		
		System.out.println("x : "+x);
		
	}

	
	
}
