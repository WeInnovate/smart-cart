package com.smartcart.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.smartcart.dao.util.DBUtil;
import com.smartcart.domain.Address;
import com.smartcart.domain.Customer;
import com.smartcart.domain.Item;
import com.smartcart.domain.Order;

public class OrderDaoImpl implements OrderDao {
static Scanner scan;
	@Override
	public String addOrder(Order order) {
		try {
			Connection con=DBUtil.getConnection();
			Statement stmt= con.createStatement();
		int i =	stmt.executeUpdate("INSERT INTO ORDER  VALUES(' "+ order.getOrderId()+"','"+order.getOrderDesc()+"','"+order.getBillAmount()+"','"+order.getShippingAddress()+"')");
		if(i!=0) 
		{
			System.out.println("Records inserted");
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public String updateOrder(Order order) {
		// TODO Auto-generated method stub
		System.out.println("enter ur orderId");
		String oid = scan.nextLine();
		System.out.println("enter the field u want to update");
		String field = scan.nextLine();
		System.out.println("Enter the new value");
		String nv = scan.nextLine();
		Connection con;
		try {
			con = DBUtil.getConnection();

			Statement stmt = con.createStatement();
			int i = stmt
					.executeUpdate("UPDATE ORDER SET ' " + field + "'=' " + nv + "' WHERE ORDERID=' " + oid + "'");
		return null;
	}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}


	@Override
	public boolean deleteOrder(String orderId) {
		// TODO Auto-generated method stub
		try {
			Connection con = DBUtil.getConnection();
			Statement stmt = con.createStatement();
			System.out.println("enter ur order ID");
			String oid = scan.nextLine();

			int i = stmt.executeUpdate("DELETE FROM ORDER WHERE ORDERID= ' " + oid + "' ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Order getOrder(String orderId) {
		// TODO Auto-generated method stub
Order order=new Order();
		
		try {
			Connection con=DBUtil.getConnection();
			Statement stmt= con.createStatement();
			ResultSet rs= stmt.executeQuery("SELECT ORDERDESC,BILLAMOUNT,SHIPPINGADDRESS WHERE USERID= '"+orderId+"'");
			
			rs.next();
			
			String orderdesc=rs.getString(2);
			double bill=rs.getDouble(3);
			String address=rs.getString(4);
			
				
			order.setOrderDesc(orderdesc);
			order.setBillAmount(bill);
			order.setShippingAddress(address);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return order;
	}

	
	

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		List<Order> orders= new ArrayList();
		try {
			 Connection con = DBUtil.getConnection();
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM ORDER");
			while(rs.next()) {
				
				Order order = new Order();
				order.setOrderId(rs.getString(1));
				order.setOrderDesc(rs.getString(2));
								
				orders.add(order);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
