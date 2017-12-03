package com.smartcart.service;

import java.util.List;

import com.smartcart.dao.CustomerDao;
import com.smartcart.dao.CustomerDaoImpl;
import com.smartcart.domain.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public String addCustomer(Customer customer) {
		CustomerDao customerDao = new CustomerDaoImpl();
		return customerDao.addCustomer(customer);
	}

	@Override
	public String updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCustomer(String customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer getCustomer(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
