package com.core.java.clone;

class Sample implements Cloneable{
	
	int x ;
	int y;
	public Sample(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Sample [x=" + x + ", y=" + y + "]"+hashCode();
	}
	
	
	
}

public class clonableTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Sample s1 = new Sample(10,20);
		
		Sample s2 = new Sample(10,20);
		
		Sample s3 = new Sample(s1.x, s1.y);
		
		Sample s4 = (Sample) s3.clone();
		
		System.out.println(s3);
		
		System.out.println(s4);
		
	}

}
