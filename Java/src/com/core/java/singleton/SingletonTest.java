package com.core.java.singleton;

class Test {

	private Test(){
		
	}
	
	private static Test t = null;
	
	public static Test getInstance(){
		if(t == null){
			t = new Test();
		}
		return t;
	}
	
	@Override
	protected  Test clone() throws CloneNotSupportedException {
		return t;
	}
}

public class SingletonTest{
	public static void main(String[] args) throws CloneNotSupportedException {
		// Test t1 = new Test();
		
		Test t2 = Test.getInstance();
		
		Test t3 = Test.getInstance();
		
		Test t4 = t3.clone();
		
		System.out.println("t2 :"+t2);
		System.out.println("t3 :"+t3);
		System.out.println("t4 :"+t4);
		
		System.out.println("t2 :"+t2.hashCode());
		System.out.println("t3 :"+t3.hashCode());
		System.out.println("t4 :"+t4.hashCode());
		
		
	}
}