package com.javaweb.myservlets;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

 @WebServlet("/welcome")
public class WelcomeServlet implements Servlet{

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Inside init method");
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Inside destroy method");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("Inside getServletConfig method");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("Inside getServletInfo method");
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//System.out.println("Inside service method");
		
		String name = req.getParameter("name");
		
		//System.out.println("name :" + name);
		
		res.setContentType("html");
		
		ServletOutputStream out =  res.getOutputStream();
		
		String browserContent = "<html><form action='/javaweb/LoginServlet'>"+
									"<h1>Welcome To My Web Application</h1>" +
									"Name : <input type='text' name='uname'></input><br/>" +
									"Password : <input type='password' name='upass'></input><br/>" +
									"<input type='submit' value='login'></input>" +
								 "</form></html>";
		
		out.println(browserContent);
		
		
		
	}
	
	
	
	


}
