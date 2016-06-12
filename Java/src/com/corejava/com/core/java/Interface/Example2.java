package com.corejava.com.core.java.Interface;

interface Test2{
	
	int x = 100; // compiler will convert to public static final int
	
	public static final int y = 0;
		
	final int z =10; // compiler will convert to public static final int
	
	public void method1();
	
	public void method3();
	
	public void method4();
	
}

interface Test3{
	
	final int z = 20;

	public void method2();
	
	public void method3();
	
	//public int method4(); //same method with different return type. 

} 


public class Example2 implements Test2, Test3 {
	
	public static void main(String[] args) {
	
		System.out.println(x);
		
		//Test2.x = 20;
		
		//System.out.println(z);// ambiguos
		
		System.out.println(Test2.z);
		
		System.out.println(Test3.z);
	
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
	}

}
