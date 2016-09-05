package com.javaweb.myservlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uname");
		String pass = request.getParameter("upass");
		
		
		
		if(username.equals(pass)){
			
			ServletOutputStream out = response.getOutputStream();
			
			out.println("<h1 style='color:green'>Login Success</h1>");
			
		}else{
			
			request.setAttribute("invalid", "true");
			
			RequestDispatcher rd = request.getRequestDispatcher("jsp/login.jsp");
			
			rd.forward(request, response);
			
			//response.sendRedirect("jsp/login.jsp");
		}

	}

	
}
