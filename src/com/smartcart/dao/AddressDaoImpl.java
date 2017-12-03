package com.smartcart.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.smartcart.dao.util.DBUtil;
import com.smartcart.domain.Address;

public class AddressDaoImpl implements AddressDao {

	@Override
	public String addAddress(Address address) {
		// TODO Auto-generated method stub
		Connection con;
		try {
			con=DBUtil.getConnection();
			Statement stmt=con.createStatement();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String updateAddress(Address address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteAddress(String addressId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Address getAddress(String addressId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> getAddresss() {
		// TODO Auto-generated method stub
		return null;
	}

}
