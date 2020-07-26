package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.User;
import com.dao.UserDao;
import com.service.UserService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		String name=request.getParameter("uname");
		
		String password=request.getParameter("pass");
		
		UserService us=new UserService();
		User u=new User();
		us.addNewUser();
			 try {
				u=us.getUser(name);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			String url="login.jsp";
			
			
			if(u!=null) {
				if(name.equals(u.getUsername()) && password.equals(u.getPassword())) {
					HttpSession session=request.getSession();
					session.setAttribute("name", "yatheesha");
					session.setAttribute("pass", "1");
					
					

						url= "welcome.jsp";
					}	
			}
			
	
			
			RequestDispatcher dd = request.getRequestDispatcher(url);

			dd.forward(request, response);
		
		
		
	}

	


}
