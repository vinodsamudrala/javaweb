package com.core.java.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample1 {

	static String name = null;

	public static void main(String[] args) {

		for (int x = 1; x <= 10; x++) {

			System.out.println("Statement " + x);

			if (x == 5) {
				// System.out.println("String "+name+" length:"+ name.length());
			}

		}

		FileInputStream fis = null;
		/*
		 * This constructor FileInputStream(File filename) throws
		 * FileNotFoundException which is a checked exception
		 */
		try {

			fis = new FileInputStream("D:/myfile.txt");
			int k;
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
			}
			fis.close();

		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
