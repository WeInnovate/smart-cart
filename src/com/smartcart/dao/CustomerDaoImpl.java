package com.smartcart.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.smartcart.dao.util.DBUtil;
import com.smartcart.domain.Customer;

public class CustomerDaoImpl implements CustomerDao{
	 static Scanner scan;

	@Override
	public int addCustomer(Customer customer) {
		try {
			Connection con= DBUtil.getConnection();
			Statement stmt= con.createStatement();
			int i =stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Sahana', 'Mahishi','female',9889848848,'abc@123')");
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
		String field= scan.nextLine();
		System.out.println("Enter the new value");
		String nv= scan.nextLine();
		Connection con;
		try {
			con = DBUtil.getConnection();
		
		Statement stmt= con.createStatement();
		 int i= stmt.executeUpdate("UPDATE CUSTOMER SET ' " +field+ "'=' " +nv+"' WHERE FIRSTNAME=' " +fn+ "'");
		}
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return 0;
	}

	@Override
	public int deleteCustomer(String customerId) {
		// TODO Auto-generated method stub
		try {
		Connection con= DBUtil.getConnection();
		Statement stmt= con.createStatement();
		System.out.println("enter ur firstname");
		String fn = scan.nextLine();
		
			int i= stmt.executeUpdate("DELETE FROM CUSTOMER WHERE FIRSTNAME= ' " +fn+"' ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	return 0;	
	}

	@Override
	public Customer getCustomerbyID(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}
	  
  }