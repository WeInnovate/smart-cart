package com.smartcart.domain;

public class Customer {
	
	private String custId;
	
	private String firstName;
	
	private String lastName;
	
	private String gender;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public Customer(String custId, String firstName, String lastName, String gender) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
}
