package com.corejava.com.core.java.overridding;

import java.io.IOException;

class Parent7{
	
	public  void method1() throws IOException{
		
	}
	
	public  void method2(){
		
	}
}
class Child7 extends Parent7{
	
	public void method1(){
		
	}
	
	public  void method2() throws NullPointerException{
		
	}
	
}


public class ExceptionHanddling {

}
