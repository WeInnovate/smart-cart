package com.smartcart.domain;

public class Customer {
		
	private String email;
	
	
	
	

	private String usname;
	
	private String lastName;
	
	private String gender;
	
	private double mobile;

	public double getMobile() {
		return mobile;
	}

	public void setMobile(double mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getUsname() {
		return usname;
	}

	public void setUsname(String usname) {
		this.usname = usname;
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", usname=" + usname + ", lastName=" + lastName
				+ ", gender=" + gender + ", mobile=" + mobile + "]";
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

