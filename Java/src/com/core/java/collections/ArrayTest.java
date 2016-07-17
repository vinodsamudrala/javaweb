package com.core.java.collections;

import java.lang.reflect.Array;

class Student{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class ArrayTest {
	
	public static boolean isExist(int[] intArr, int intVal){
		boolean returnVal = false;
		for(int x : intArr){
			if(x == intVal){
				returnVal = true;
			}
		}
		return returnVal;
	}
	
	public static void main(String[] args) {
		Student st[] = new Student[10];
		st[0] =new Student(1, "Rakesh");
		st[1] =new Student(3, "Java");
		st[2] =new Student(4, "vinod");
		st[3] =new Student(2, "Ramesh");
		
		for(Student s : st){
			System.out.println(s);
		}
		
		
		
		
		int[] arr = {20,10,5,3,14,1};
		
		int[] newArr = new int[arr.length];

		/*	for(int i = 0; i< arr.length ;i++){  //finding first minimal value untill size of length
			
			int minval = arr[0];
			
			for(int a : arr){ // checking with all elements.
				
				if(a < minval && ! isExist(newArr, a)){
					
					minval = a;
				}
				//System.out.println(a);
			}
			
			newArr[i]=minval; //{1,3,5,10,14,20}
			
			System.out.println(minval);
			
		}
		
		*/
		
		for(int i=0 ; i < arr.length; i++){
			for(int j=0 ; j < arr.length-1; j++){
				if(arr[j] > arr[j+1]){
					int temp =arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int s : arr){
			System.out.println(s);
		}
		
	}
}
