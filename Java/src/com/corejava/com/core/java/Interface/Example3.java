package com.corejava.com.core.java.Interface;

interface i1{

	void method1();
}

interface i2 extends i1{
	void method2();
}

public class Example3 implements i2{ // concreate 

	@Override
	public void method1() {
		// TODO Auto-generated method stub
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
	

}
