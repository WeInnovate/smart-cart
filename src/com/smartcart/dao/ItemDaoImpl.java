package com.smartcart.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

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
		return null;
	}

	@Override
	public boolean deleteItem(String itemId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Item getItem(String itemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> getItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
