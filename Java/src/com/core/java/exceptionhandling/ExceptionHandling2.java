package com.core.java.exceptionhandling;

import java.io.IOException;

public class ExceptionHandling2 {
	
	static void method2() throws IOException{
			System.out.println("Method 2");
			throw new IOException();
			
	}
	
	static void method1(){
		System.out.println("Method 1");
			try {
				method2();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static void main(String[] args)  {
		method1();
		
	}
}
