package com.corejava.com.core.java.nonstatic;


public class NonStatic {

	int x= 10;
	
	static int y=20;
	
	int z = 50;

	static{

		System.out.println("Inside Static Block");
		
	}
	
	//bdomas
	
	//non -static block
	{
		System.out.println("load drivers..");
	}
	
	NonStatic(){
		//System.out.println("load drivers..");
		System.out.println("Inside Constructor");
	}
	
	NonStatic(int z){
		//System.out.println("load drivers..");
		System.out.println("Inside Constructor with 1 param");
	}
	
	NonStatic(int z, int x){
		//System.out.println("load drivers..");
		System.out.println("Inside Constructor with 2 params ");
	}
	public static void main(String[] args) {
		
		NonStatic nonStatic = new NonStatic(10);
	}

}
