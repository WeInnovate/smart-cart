package com.smartcart.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartcart.dao.util.DBUtil;

/**
 * Servlet implementation class Customerinfo
 */
@WebServlet("/Customerinfo")
public class Customerinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customerinfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	String usID=request.getParameter("email");
	 Connection con;
	 try {
		con=DBUtil.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs= stmt.executeQuery("SELECT * FROM CUSTOMER WHERE EMAILID= '"+usID+"'");
		while (rs.next())
		{
			System.out.println("Hi" +rs.getString(1)+rs.getString(2));
			System.out.println("Your Gender"+rs.getString(3));
			System.out.println(("Mobile number"+rs.getString(4)));
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	}

}
