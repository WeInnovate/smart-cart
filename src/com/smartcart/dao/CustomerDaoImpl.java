package com.smartcart.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import org.h2.engine.User;

import com.smartcart.dao.util.DBUtil;
import com.smartcart.domain.Customer;

public class CustomerDaoImpl implements CustomerDao {
	static Scanner scan;

	@Override
	public int addCustomer(Customer customer) {
		try {
			Connection con= DBUtil.getConnection();
			Statement stmt= con.createStatement();
			int i =stmt.executeUpdate("INSERT INTO CUSTOMER (USNAME,LASTNAME,GENDER,MOBILE,EMAILID) VALUES ('"+customer.getUsname()+"','"+customer.getLastName()+"','"+customer.getGender()+"','"+customer.getMobile()+"','"+customer.getEmail()+"')");
			if (i!=0)
				System.out.println("Record inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("enter ur firstname");
		String fn = scan.nextLine();
		System.out.println("enter the field u want to update");
		String field = scan.nextLine();
		System.out.println("Enter the new value");
		String nv = scan.nextLine();
		Connection con;
		try {
			con = DBUtil.getConnection();

			Statement stmt = con.createStatement();
			int i = stmt
					.executeUpdate("UPDATE CUSTOMER SET ' " + field + "'=' " + nv + "' WHERE FIRSTNAME=' " + fn + "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int deleteCustomer(String customerId) {
		// TODO Auto-generated method stub
		try {
			Connection con = DBUtil.getConnection();
			Statement stmt = con.createStatement();
			System.out.println("enter ur firstname");
			String fn = scan.nextLine();

			int i = stmt.executeUpdate("DELETE FROM CUSTOMER WHERE FIRSTNAME= ' " + fn + "' ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Customer getCustomerbyID(String customerId) {
		
		Customer customer=new Customer();
		
		try {
			Connection con=DBUtil.getConnection();
			Statement stmt= con.createStatement();
			ResultSet rs= stmt.executeQuery("SELECT USNAME,LASTNAME,GENDER,MOBILE,EMAILID FROM CUSTOMER WHERE USERID= '"+customerId+"'");
			
			rs.next();
			
			String cusname=rs.getString(1);
			String cuslastname=rs.getString(2);
			String cusgender=rs.getString(3);
			double cusmobile=rs.getDouble(4);
			String cusemail=rs.getString(5);
			
			customer.setUsname(cusname);
			customer.setLastName(cuslastname);
			customer.setGender(cusgender);
			customer.setMobile(cusmobile);
			customer.setEmail(cusemail);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return customer;
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}