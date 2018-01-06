package com.smartcart.dao;

import java.util.List;

import com.smartcart.domain.Address;

public interface AddressDao {

	int addAddress(Address address);

	int updateAddress(Address address);

	int deleteAddress(long addressId);

	Address getAddressByID(long addressId);

	List<Address> getAddress();
}
