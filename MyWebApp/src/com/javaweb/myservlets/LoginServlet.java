package com.javaweb.myservlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends GenericServlet {

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uname");
		String pass = request.getParameter("upass");
		
		ServletOutputStream out = response.getOutputStream();
		
		if(username.equals(pass)){
			
			out.println("<h1 style='color:green'>Login Success</h1>");
		}else{
			
			out.println("<h1 style='color:red'>Login Faild</h1>");
		}

	}

}
