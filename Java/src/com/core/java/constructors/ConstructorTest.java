package com.core.java.constructors;

public class ConstructorTest {
	
	
	public ConstructorTest(){
		
		System.out.println("inside Constructor Test");
	}
	
	
	// method
	public void ConstructorTest(){
		
		System.out.println("inside Constructor Test Method");
	}
	
	
	
	public static void main(String[] args) {
		
		ConstructorTest constructorTest = new ConstructorTest();
		
		constructorTest.ConstructorTest();
	}

}
