package com.core.java.constructors;


class Parent {
	
	int total;
	
	static{
		System.out.println("static block in parent");		
	}

	{

		String loaddrivers = "process initialized";
		System.out.println("loaddrivers.....!!!!!!!");
		System.out.println("instance block in parent");
	}
	
	public Parent() {
		//String loaddrivers = "process initialized";
	
		System.out.println("0 arg Parent");
	}

	public Parent(int total) {
		//this();
		this.total = total;
		System.out.println("1 arg Parent");
	}
	
	public Parent(int total, int arg) {
		//this();//loadDrivers
		System.out.println("2 arg parent");
	}
	
	
}

class Test extends Parent{
	
	int x;
	
	static{
		
		System.out.println("inside static block child");
	}
	
	public Test() {
		
		System.out.println("0 arg child");
	}

	public Test(int x) {
		//super(10,20);
		
		//super(x,200);
		this();
		this.x = x;
		
		System.out.println("1 arg child");
	}
	
	
}


public class Test2 {

	public static void main(String[] args) {
		Test t =  new Test(10);
		
	//	Parent p1 = new Parent(200);
		
	//	Parent p2 = new Parent(200,100);
		
		
	}
}
