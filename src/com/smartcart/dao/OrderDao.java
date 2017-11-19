package com.smartcart.dao;

import java.util.List;

import com.smartcart.domain.Order;

public interface OrderDao {

	public String addOrder(Order order);

	public String updateOrder(Order order);

	public boolean deleteOrder(String orderId);

	public Order getOrder(String orderId);

	public List<Order> getOrders();
}
