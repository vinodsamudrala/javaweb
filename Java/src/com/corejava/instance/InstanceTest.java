package com.corejava.instance;

public class InstanceTest {

	int x = 10;
	
	// alt + shit + s -> generate constructor 

	public  InstanceTest() {
		
		System.out.println("Constructor");
		
	}

	{
		//m1();
		
		System.out.println("Non Static Block 1");
	}
	
	public void m1(){
		
		System.out.println(y);
	}
	
	{
		System.out.println("Non Static Block 2");
	}
	
	int y = 20;
	
	public static void main(String[] args) {
		
		InstanceTest test = new InstanceTest();
		
		test.m1();
	}
}
