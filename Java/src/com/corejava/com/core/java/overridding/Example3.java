package com.corejava.com.core.java.overridding;

import java.io.IOException;

public class Example3 {

}


abstract class Parent4{
	
	public abstract void method1();
	
		
	public void method2() throws IOException{
		
	}

	public abstract void method3();
		
	public  Object method4(){
		return null;
	}
	
	public void method5(){
		
	}
	
}
abstract class Child4 extends Parent4{
	
	public  void method1(){
		
	}
	
	public abstract void method2();
	
	public abstract void method3() throws ArithmeticException;
	
	/* public final void method4(){
		
	}*/ //Not possible
	
	public Integer method4(){
		
		return new Integer(0);
	}
	public final void method5(){
		
	}
	
}