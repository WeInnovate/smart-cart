package com.smartcart.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smartcart.domain.Customer;
import com.smartcart.service.CustomerService;
import com.smartcart.service.CustomerServiceImpl;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/customer/*")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CustomerServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String requestUri = request.getRequestURI();
		
		if(requestUri.contains("add")){
			Customer customer = (Customer) request.getAttribute("cust");
			CustomerService customerService = new CustomerServiceImpl();
			customerService.addCustomer(customer);
			
			HttpSession session = request.getSession(true);
			session.setAttribute("cust", customer);
			
			response.sendRedirect("customer-profile.jsp");
		}
		else if(requestUri.contains("update")){
			
		}
		else if(requestUri.contains("delete")){
			
		}
	}
}
