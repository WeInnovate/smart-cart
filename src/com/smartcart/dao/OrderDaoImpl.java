package com.smartcart.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.smartcart.dao.util.DBUtil;
import com.smartcart.domain.Order;

public class OrderDaoImpl implements OrderDao {
         Connection con;
	@Override
	public String addOrder(Order order) {
		// TODO Auto-generated method stub
			try {
			con = DBUtil.getConnection();
			Statement stmt;
			stmt = con.createStatement();
			stmt.executeUpdate("INSERT INTO SC_ORDER VALUES('"+order.getOrderId()+"','"+order.getOrderDesc()+"')");
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
			return null;
			}

	@Override
	public String updateOrder(Order order) {
		// TODO Auto-generated method stub
		try {
			con=DBUtil.getConnection();
			Statement stmt = con.createStatement();
			Scanner scan = new Scanner(System.in);
			String choice = "";
			
			do {
			
			System.out.print("Enter orderid: ");
			String un = scan.nextLine();
			
			System.out.print("Enter orderdesc: ");
			String p = scan.nextLine();
			
			int i = stmt.executeUpdate("UPDATE  SC_ORDER SET  ORDERID='"+p+"' WHERE ORDERDESC='"+un+"'");
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
	public boolean deleteOrder(String orderId) {
		// TODO Auto-generated method stub
		try {
			con=DBUtil.getConnection();
			Statement stmt = con.createStatement();
				
				Scanner scan = new Scanner(System.in);
				String choice = "";
				
				do {
									
					System.out.print("Enter order id  which u want to delete: ");
					String p = scan.nextLine();
					
					int i = stmt.executeUpdate("DELETE FROM SC_ORDER WHERE ORDERID='"+p+"'");
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
	public Order getOrder(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return null;
	}

}
