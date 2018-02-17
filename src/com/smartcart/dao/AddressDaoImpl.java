package com.smartcart.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.smartcart.dao.util.DBUtil;
import com.smartcart.domain.Address;
import com.smartcart.domain.Order;

public class AddressDaoImpl implements AddressDao {
	static Scanner scan;

	@Override
	public int addAddress(Address address) {
		// TODO Auto-generated method stub
		Connection con;
		try {
			con=DBUtil.getConnection();
			Statement stmt=con.createStatement();
			int i =	stmt.executeUpdate("INSERT INTO ADDRESS VALUES(' "+address.getAddressID()+"','"+address.getLine1()+"','"+address.getLine2()+"','"+address.getCity()+"','"+address.getState()+"','"+address.getPin()+"',' "+address.getCountry()+"','"+address.getAddressType()+"')");
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateAddress(Address address) {
		// TODO Auto-generated method stub
		
		try{
			String ch;
			do {
		System.out.println("enter ur firstname");
		String fn = scan.nextLine();
		System.out.println("enter the field u want to update");
		String field = scan.nextLine();
		System.out.println("Enter the new value");
		String nv = scan.nextLine();
		Connection con;
		
			con = DBUtil.getConnection();

			Statement stmt = con.createStatement();
			int i = stmt
					.executeUpdate("UPDATE CUSTOMER SET ' " + field + "'=' " + nv + "' WHERE FIRSTNAME=' " + fn + "'");
			
		System.out.println("do you wish to update any other field? (Y/N");
		 ch= scan.nextLine();
		}
		
		while(ch.equalsIgnoreCase("Y"));		
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
				}
		return 0;
	}

	@Override
	public int deleteAddress(long addressId) {
		// TODO Auto-generated method stub
		try {
			Connection con = DBUtil.getConnection();
			Statement stmt = con.createStatement();
			System.out.println("enter ur Address ID");
			String aid = scan.nextLine();

			int i = stmt.executeUpdate("DELETE FROM ADDRESS WHERE ORDERID= ' " + aid + "' ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public Address getAddressByID(long addressId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> getAddress() {
		// TODO Auto-generated method stub
		List<Address> addresses= new ArrayList();
		try {
			 Connection con = DBUtil.getConnection();
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM ADDRESS");
			while(rs.next()) {
				
				Address address=new Address();
				address.setAddressID(rs.getString(1));
				address.setPin(rs.getString(6));
								
				addresses.add(address);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
