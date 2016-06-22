package com.core.java.arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int intArray[] = new int[2];
		
		intArray[0] = 10;
		
		intArray[1] = 200;
		
		for(int a : intArray){
			
			//System.out.println(a);
		}
		
		int x[][] = new int[2][2];
		
		x[0][0] = 10;
		x[0][1] = 20;
		x[1][0] = 30;
		x[1][1] = 40;
		
		
		int y[][] = new int[4][];
		y[0] = new int[3];
		y[1] = new int[2];
		y[2] = new int[4];
		y[3] = new int[1];
		
		y[0][0] = 10;
		y[0][1] = 10;
		y[0][2] = 10;
		y[1][0] = 10;
		y[1][1] = 10;
		y[2][0] = 10;
		y[2][1] = 10;
		y[2][2] = 10;
		y[2][3] = 10;
		y[3][0] = 10;
				
		for(int a[] : x){
			
			for(int b : a){
				
				//System.out.println(b);
			}
		}
		
		for(int []a : y){
			
			for(int b : a){
				
				System.out.print(b+" ");
			
			}
			
			System.out.println("");
		}
		
		
	}
}
