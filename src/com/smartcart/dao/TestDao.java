package com.smartcart.dao;

import com.smartcart.domain.Customer;

public class TestDao {
	public static void main(String[] args) {
		// customer
		Customer customer = new Customer("atul.wnw@gmail.com", "Atul", "Dwivedi", "Male");
		CustomerDaoImpl customerDaoImpl = new CustomerDaoImpl();
		customerDaoImpl.addCustomer(customer);
		
		// item
		// Item item = new Item();
		// item.setItemName("Car Toy");
		// item.setItemDesc("Automatic Car");
		// ItemDaoImpl itemDaoImpl = new ItemDaoImpl();
		// itemDaoImpl.addItem(item);
	}
}
