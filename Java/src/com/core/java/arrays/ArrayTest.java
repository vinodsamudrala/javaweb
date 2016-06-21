package com.core.java.arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int intArray[] = new int[2];
		
		intArray[0] = 10;
		
		intArray[1] = 20;
		
		for(int a : intArray){
			
			System.out.println(a);
		}
		
		int x[][] = new int[2][2];
		
		x[0][0] = 10;
		x[0][1] = 20;
		x[1][0] = 30;
		x[1][1] = 40;
		
		
		int y[][] = new int[2][];
		y[0] = new int[2];
		y[1] = new int[2];
		
		y[0][0] = 10;
		y[0][1] = 20;
		y[1][0] = 30;
		y[1][1] = 40;
		
		for(int a[] : x){
			
			for(int b : a){
				
				System.out.println(b);
			}
		}
		
		
		
	}
}
