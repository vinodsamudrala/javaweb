package com.core.java.finaliized;

class GC1 {

	String str;
	int id;

	GC1(int i) {
		this.str = new String("abcdefghijklmnopqrstuvwxyz");
		this.id = i;
	}

	protected void finalize() {
		System.out.println("GC1 object " + id + " has been finalized.");
	}

}

public class TestFinallized {

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();
		
		System.out.println("Available Free Memory: " + rt.freeMemory());
		GC1 x = null;
		for (int i = 0; i < 10000; i++) {
			 x = new GC1(i);
		}

		System.out.println("Free Memory before call to gc(): " + rt.freeMemory());

		System.gc();
		
		System.out.println(" Free Memory after call to gc(): " + rt.freeMemory());
		
            x=null;
            System.gc();
            System.out.println(" Free Memory after call to gc(): " + rt.freeMemory());
        	System.gc();
	}
}

