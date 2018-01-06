package com.smartcart.domain;

public class Customer {
	
	private String email;
	
	private String firstName;
	
	private String lastName;
	
	private String gender;
	
	private String mobile;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

	@Override
	public String toString() {
		return "Customer [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", mobile=" + mobile + "]";
	}

/*	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Customer(String email, String firstName, String lastName, String gender) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	*/

	
	}

