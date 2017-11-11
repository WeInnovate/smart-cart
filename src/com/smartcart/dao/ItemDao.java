package com.smartcart.dao;

import java.util.List;

import com.smartcart.domain.Item;

public interface ItemDao {

	public String addItem(Item item);

	public String updateItem(Item item);

	public boolean deleteItem(String itemId);

	public Item getItem(String itemId);

	public List<Item> getItems();
}
