package com.login.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static int count = 0;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("userName");
		String pwd = request.getParameter("password");
		
		RequestDispatcher rdHome = request.getRequestDispatcher("/jsp/Home.html");
		RequestDispatcher rdError = request.getRequestDispatcher("/jsp/Error.html");
		
		count ++;
		
		if(name.equals(pwd)){
			rdHome.forward(request, response);
		}
		else{
			rdError.forward(request, response);
		}
		
		System.out.println("name :"+name);
		System.out.println("password :"+pwd);
		
		System.out.println("count :"+count);
	}

}
