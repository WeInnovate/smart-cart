package com.smartcart.domain;

public class Address {

	private String addressID;

	private String Line1;

	private String Line2;

	private String city;

	private String state;

	private String pin;

	private String country;
	
	private String addressType;
	
	private boolean isDefault;
	
	

	public String getAddressID() {
		return addressID;
	}

	public void setAddressID(String AddressID) {
		this.addressID = AddressID;
	}

	
	public String getLine1() {
		return Line1;
	}

	public void setLine1(String Line1) {
		this.Line1 = Line1;
	}

	
	public String getLine2() {
		return Line2;
	}

	public void setLine2(String line2) {
		Line2 = line2;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressID=" + addressID + ", Line1=" + Line1 + ", Line2=" + Line2 + ", city=" + city
				+ ", state=" + state + ", pin=" + pin + ", country=" + country + ", addressType=" + addressType
				+ ", isDefault=" + isDefault + "]";
	}

	
}
