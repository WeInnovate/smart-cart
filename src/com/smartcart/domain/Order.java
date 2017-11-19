package com.smartcart.domain;

import java.util.List;

public class Order {
	
	private String orderId;
	
	private String orderDesc;
	
	private List<Item> items;
	
	private double billAmount;
	
	private Address shippingAddress;

}
