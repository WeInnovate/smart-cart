package com.smartcart.service;

import java.util.List;

import com.smartcart.domain.Customer;

public interface CustomerService {

	public String addCustomer(Customer customer);

	public String updateCustomer(Customer customer);

	public boolean deleteCustomer(String customerId);

	public Customer getCustomer(String customerId);

	public List<Customer> getCustomers();
}
