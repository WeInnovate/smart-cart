package com.smartcart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.smartcart.domain.Customer;

public class CustomerDaoImpl implements CustomerDao {
	Connection con;
	@Override
	public String addCustomer(Customer customer) {
		try {
			con = DriverManager.getConnection("", "", "");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("INSERT INTO SC_CUSTOMER VALUES('"+customer.getFirstName()+"','"+customer.getLastName()+"')");
			
		} catch (Exception e) {
			
		}
		finally {
			if(con != null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public String updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCustomer(String customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer getCustomer(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
