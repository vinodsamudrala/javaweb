package com.mywebapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//DAO -Data Access Object

public class UserDAO {

	public int AddUser(UserDetails user){
		Connection con  = null;
		PreparedStatement pstmt = null;
		int id = 0;
		try{
			String sql = "insert into users ( id, name, password, email) values(userid.NEXTVAL,?,?,?)";
			
			con = ConnectionUtil.getConnection();
			
			pstmt =   con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			
			id = pstmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		finally {
			try {
				if(con != null)
					con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return id;
		}
		
	}
	
	public UserDetails getUser(String UserName){
		return null;
	}
	
}
