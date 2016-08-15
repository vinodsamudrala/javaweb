package com.core.java.callbyvalue;

class Test {

	int x;

	public Test(int x) {
		this.x = x;
	}

}

public class CallByValue {

	public static void main(String[] args) {

		// Pass By value
		
		System.out.println("Pass By Value");

		int x = 100;

		System.out.println("Before Calling Method1 x value :" + x);

		method1(x);

		System.out.println("After Calling Method X value :" + x);

		System.out.println("----------------------------------------");

		System.out.println("Pass By referance");

		// Pass by Reference

		Test t = new Test(100);

		System.out.println("Before Calling Method X value :" + t.x);

		method(t);

		System.out.println("After Calling Method X value :" + t.x);

	}

	static void method(Test t1) {
		t1.x = 500;
	}

	static void method1(int x) {
		x = 50;
	}

}
