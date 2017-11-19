package com.smartcart.domain;

public class Item {

	private String itemId;

	private String itemName;

	private String itemDesc;

	private double itemPrice;

	private long quanitity;

	private String imgPath;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public long getQuanitity() {
		return quanitity;
	}

	public void setQuanitity(long quanitity) {
		this.quanitity = quanitity;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemDesc=" + itemDesc + ", itemPrice="
				+ itemPrice + ", quanitity=" + quanitity + ", imgPath=" + imgPath + "]";
	}
}
