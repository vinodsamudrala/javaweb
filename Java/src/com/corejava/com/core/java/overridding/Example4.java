package com.corejava.com.core.java.overridding;
class P{
	
	int x = 100;
	
	public void method1(){
		System.out.println("Inside Parent Method1");
	}
	
	public void method2(){
		System.out.println("Inside Parent Method2");
	}
}
class C extends P{
	
	int x = 200;
	
	public void method1(){
		System.out.println("Inside child");
	}
}

public class Example4 {

	
	public static void main(String[] args) {

		P p = new P();
		
		System.out.println(p.x);
		
		p.method1();
		
		C c = new C();
		
		System.out.println(c.x);
		
		c.method1();
		
		P pc = new C();
		
		System.out.println(pc.x);
		
		pc.method1();
		
		pc.method2();
		
	}
}
