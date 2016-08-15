package com.corejava.com.core.java.singleton;

class Test{
	
	private Test(){
	
	}
	
	static Test testObj = null;
	
	public static Test getTestObject(){

		//Test testObj = new Test();
		
		if(testObj == null){
			
			testObj = new Test();
		}

		return testObj;
	}
	
	@Override

	protected Object clone() throws CloneNotSupportedException  {
	
		return testObj;
	}
}

public class Singleton {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//Test t1 = new Test();
		Test t1 = Test.getTestObject();
		System.out.println("t1"+t1);
		
		
		Test t2 = Test.getTestObject();
		System.out.println("t2"+t2);
		
		Test t3 = Test.getTestObject();
		System.out.println("t3"+t3);
		
		
		Test t4 = (Test) t1.clone();
		System.out.println("t2 :"+t4);
	}
}
