package com.core.java.exceptionhandling;

import java.io.IOException;
import java.sql.SQLException;

public class EceptionHandling3 {
	
	
	
	public static void main(String[] args) {
	
		int []i =  new int[2] ;
		
		try{
			

			System.out.println("inside try ");

			System.exit(0);
			
			System.out.println(i[4]); // array index out of bound exception
			
			//Integer.parseInt("hi");
			
		}
		catch(NumberFormatException e){ // handling number format excetion
			
			System.out.println("handled");
		}
		finally{
			System.out.println("End");
		}
	}

}
