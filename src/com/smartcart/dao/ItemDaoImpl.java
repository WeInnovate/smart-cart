package com.smartcart.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.smartcart.dao.util.DBUtil;
import com.smartcart.domain.Item;

public class ItemDaoImpl implements ItemDao {

	Connection con;

	@Override
	public String addItem(Item item) {
		String retVal = null;
		try {
			con = DBUtil.getConnection();
			Statement stmt = con.createStatement();
			String itemId = "ITM" + DBUtil.getCurrentTimeStamp();
			System.out.println("Item Id is: " + itemId);
			item.setItemId(itemId);
			int rowsUpdated = stmt.executeUpdate("INSERT INTO SC_ITEM VALUES('" + item.getItemId() + "', '"
					+ item.getItemName() + "', '" + item.getItemDesc() + "')");

			if (rowsUpdated > 0) {
				retVal = itemId;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

		}
		return retVal;
	}

	@Override
	public String updateItem(Item item) {
		// TODO Auto-generated method stub
		try
		{
		con=DBUtil.getConnection();
		Statement stmt = con.createStatement();
		Scanner scan = new Scanner(System.in);
		String choice = "";
		
		do {
		
		System.out.print("Enter itemid: ");
		String un = scan.nextLine();
		
		System.out.print("Enter itemdesc: ");
		String p = scan.nextLine();
		
		int i = stmt.executeUpdate("UPDATE  SC_ITEM SET  ITEMID='"+p+"' WHERE ITEMDESC='"+un+"'");
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
	public boolean deleteItem(String itemId) {
		// TODO Auto-generated method stub
		try {
			con=DBUtil.getConnection();
			Statement stmt = con.createStatement();
				
				Scanner scan = new Scanner(System.in);
				String choice = "";
				
				do {
									
					System.out.print("Enter item id  which u want to delete: ");
					String p = scan.nextLine();
					
					int i = stmt.executeUpdate("DELETE FROM SC_ITEM WHERE ITEMID='"+p+"'");
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
	public Item getItem(String itemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> getItems() {
		List<Item> items = new ArrayList<>();
		
		
		
		try {
			con = DBUtil.getConnection();
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM ITEM");
			while(rs.next()) {
				
				Item item = new Item();
				item.setItemId(rs.getString(1));
				item.setItemName(rs.getString(2));
				
				items.add(item);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
try {
	con.close();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		}
		
		
		
		
		
		return items;
	}

}
