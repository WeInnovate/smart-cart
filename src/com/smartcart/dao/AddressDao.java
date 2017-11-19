package com.smartcart.dao;

import java.util.List;

import com.smartcart.domain.Address;

public interface AddressDao {

	public String addAddress(Address address);

	public String updateAddress(Address address);

	public boolean deleteAddress(String addressId);

	public Address getAddress(String addressId);

	public List<Address> getAddresss();
}
