package com.mywebapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	

	@SuppressWarnings("finally")
	public static Connection getConnection(){
		
		Connection con = null;
		
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		finally{
			
			return con;
		}
		
	}
}
