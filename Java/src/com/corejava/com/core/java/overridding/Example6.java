package com.corejava.com.core.java.overridding;

class P6{

	int x =10;
	
	public static void method1(){
		
	}
}
class C6 extends P6{
	
	int x = 30;
	
	public static void method1(){
		
	}
	
	public void method4(int x){
		
		System.out.println(super.x);
	}
}

class C7 extends C6{
	
	int x = 50;
	
	public void method5(int x){
		
		P6 p6 = new P6();
		
		System.out.println(super.x);
	}
}
public class Example6 {

	
	public static void main(String[] args) {
		
		P6 pc = new C6();
		
		pc.method1();
		
		C6 c = new C6();
		
		//c.method4(100);
		
		C7 c7 = new C7();
		
		c7.method5(1000);
	}
	
}
