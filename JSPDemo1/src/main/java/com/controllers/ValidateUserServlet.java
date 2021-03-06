package com.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDaoImpl;
import com.dto.User;

/**
 * Servlet implementation class ValidateUserServlet
 */
public class ValidateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String userName=request.getParameter("uname");
		String passw=request.getParameter("passw");
		response.getWriter().append(userName);
		
		User user1=new User(userName,passw);
		
		UserDaoImpl dao = new UserDaoImpl();
		boolean isValiduser = dao.validateUser(user1);
		
		if (isValiduser) {
			HttpSession session = request.getSession();
			session.setAttribute("uname",user1.getUserName());
			response.sendRedirect("welcomeuser.jsp");	
			}else {
				response.sendRedirect("error.jsp");
			}
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
