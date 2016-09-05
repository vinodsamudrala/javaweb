package com.javaweb.myservlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mywebapp.dao.UserDAO;
import com.mywebapp.dao.UserDetails;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("uname");
		String password = request.getParameter("upass");
		String email = request.getParameter("uemail");
		
		UserDetails user = new UserDetails();
		
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		
		UserDAO userDAO = new  UserDAO();
		
		int userId = userDAO.AddUser(user);
		
		if(userId > 0){
			response.sendRedirect("jsp/login.jsp");
		}
		
	}

}
