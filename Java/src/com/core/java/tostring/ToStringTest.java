package com.core.java.tostring;

/**
 * @author rajendre
 *
 */
class A{
	
	int id;
	String name;
	
	public A(String name){
		this.name= name;
	}
	
	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	// ALt + Shift + s -> s
	
	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + "]";
	}

	/*
	 * @Override(non-Javadoc)
	 * @see java.lang.Object#toString()
	 *
	public String toString() {
		return name;
	}
	
	*/
	
	
}


public class ToStringTest {

	public static void main(String[] args) {
		
		A a = new A(10,"Vinod");
		
		A aa = new A("Rakesh");
		
		System.out.println(aa);  // aa.toString();
		
		String x = new String("Rakesh");
		
		System.out.println(x.toString());
		
		//System.out.println(a);
		
		A a2 = new A(20,"Rakesh");
		
		//System.out.println(a2.toString()); //added by compiler.
		
	}
}
