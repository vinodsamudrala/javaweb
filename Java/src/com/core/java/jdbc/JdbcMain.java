package com.core.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		String sql  = "select * from emp";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		// Registering Driver
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
			
			stmt =  con.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			//Arraylist 
			while(rs.next()){
				// create employee obj
				
				
				rs.getString("empname");
				rs.getInt("empId");
				rs.getInt("salary");
				
				//arraylist.add(emplyeeObj)
			}
			
		}
		finally{
			if(rs != null)
				rs.close();
			if(stmt != null)
				stmt.close();
			if(con != null)
				con.close();
		}
		
		
	}
}
