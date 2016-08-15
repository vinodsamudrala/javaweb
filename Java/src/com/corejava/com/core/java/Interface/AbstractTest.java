package com.corejava.com.core.java.Interface;

abstract class ATest{
	
	int x = 20;
	
	abstract void method1();
	
}

abstract class ATest1 extends ATest{
	
	int x = 30;
	void method2(){
		
	}
	
	abstract void method3();
	
}


public class AbstractTest extends ATest1 {

	@Override
	void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void method1() {
		// TODO Auto-generated method stub
		
	}
	

}
