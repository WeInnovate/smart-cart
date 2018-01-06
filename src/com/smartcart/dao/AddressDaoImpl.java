package com.smartcart.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.smartcart.dao.util.DBUtil;
import com.smartcart.domain.Address;

public class AddressDaoImpl implements AddressDao {

	@Override
	public int addAddress(Address address) {
		// TODO Auto-generated method stub
		Connection con;
		try {
			con=DBUtil.getConnection();
			Statement stmt=con.createStatement();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateAddress(Address address) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAddress(long addressId) {
		// TODO Auto-generated method stub
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
		return null;
	}

}
