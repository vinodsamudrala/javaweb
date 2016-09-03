package com.javaweb.myservlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class Myservlet
 */
@WebServlet("/Myservlet")
public abstract class Myservlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException {

	}

	public void destroy() {
	
	}
	
	public ServletConfig getServletConfig() {
	
		return null;
	}
	
	public String getServletInfo() {
		return null; 
	}

}
