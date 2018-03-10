package com.smartcart.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartcart.dao.CustomerDao;
import com.smartcart.dao.CustomerDaoImpl;
import com.smartcart.domain.Customer;

/**
 * Servlet implementation class Customerservlet
 */
@WebServlet("/customer/add")
public class Customerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customerservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*doGet(request, response);
		String usname= request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String gender=request.getParameter("gender");
		String mobile=request.getParameter("number");
		String email=request.getParameter("email");
		
		Customer customer = new Customer();
		customer.setUsname(usname);
		*/
		Customer customer  = (Customer)request.getAttribute("cust");
		
		CustomerDaoImpl customerDaoImpl= new CustomerDaoImpl();
		customerDaoImpl.addCustomer(customer);
		RequestDispatcher rd= request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
			
		
		
	}

}
