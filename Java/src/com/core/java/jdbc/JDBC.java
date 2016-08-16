package com.core.java.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException {
		
		OracleDriver orDriver = new OracleDriver();
		
		try {
			
			//Process 1:
			
			DriverManager.registerDriver(orDriver);
			
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			//Process 2:
			Class.forName("com.core.java.jdbc.MyDriver");
			
			
			
			// without import 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
