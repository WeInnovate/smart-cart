package com.smartcart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.smartcart.dao.util.DBUtil;
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
		try {
			con=DBUtil.getConnection();
			Statement stmt = con.createStatement();
			Scanner scan = new Scanner(System.in);
			String choice = "";
			
			do {
			
			System.out.print("Enter firstname: ");
			String un = scan.nextLine();
			
			System.out.print("Enter lastname: ");
			String p = scan.nextLine();
			
			int i = stmt.executeUpdate("UPDATE  SC_CUSTOMER SET  FIRSTNAME='"+p+"' WHERE LASTNAME='"+un+"'");
			if (i > 0) {
				System.out.println("Record is updated successfully.");
			}
			
			System.out.print("Do you want to continue(Y/N): ");
			choice = scan.nextLine();
			
		} while (choice.equalsIgnoreCase("Y"));
	
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
	public boolean deleteCustomer(String customerId) {
		// TODO Auto-generated method stub
		try {
		con=DBUtil.getConnection();
		Statement stmt = con.createStatement();
			
			Scanner scan = new Scanner(System.in);
			String choice = "";
			
			do {
								
				System.out.print("Enter Customer first name  which u want to delete: ");
				String p = scan.nextLine();
				
				int i = stmt.executeUpdate("DELETE FROMSC_CUSTOMER WHERE FIRSTNAME='"+p+"'");
				if (i > 0) {
					System.out.println("Record is deleted successfully.");
				}
				
				System.out.print("Do you want to continue(Y/N): ");
				choice = scan.nextLine();
				
			} while (choice.equalsIgnoreCase("Y"));

		} catch (SQLException e) {
			e.printStackTrace();
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
