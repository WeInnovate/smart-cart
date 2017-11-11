package com.smartcart.dao;

import com.smartcart.domain.Customer;

public class TestDao {
	public static void main(String[] args) {
		Customer customer = new Customer("Atul", "Dwivedi", "Male");
		
		CustomerDaoImpl customerDaoImpl = new CustomerDaoImpl();
		customerDaoImpl.addCustomer(customer);
	}
}
