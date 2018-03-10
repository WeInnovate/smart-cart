package com.smartcart.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartcart.dao.LoginDaoImpl;

/**
 * Servlet implementation class logservlet
 */
@WebServlet("/logservlet")
public class logservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String Username= request.getParameter("un");
		String Password=request.getParameter("ps");
		if(new LoginDaoImpl().checkLogin(Username,Password))
				{
			RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
				}
		else
		{
			String message= "Incorrect ID or password";
		request.setAttribute("msg", message);
			response.sendRedirect("Login.jsp");
		}
	}

}
