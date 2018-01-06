package com.smartcart.dao;

import java.util.List;

import com.smartcart.domain.Customer;

public interface CustomerDao {

	public int addCustomer(Customer customer);

	public int updateCustomer(Customer customer);

	public int deleteCustomer(String customerId);

	public Customer getCustomerbyID(String customerId);

	public List<Customer> getCustomers();
}
