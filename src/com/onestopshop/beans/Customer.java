package com.onestopshop.beans;


public class Customer {
	private String firstName;
	private String lastName;
	private String address;
	private Order order;
	
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

	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Order getOrder() {
		return this.order;
	}
	
	public void setOrder(Order order) {
		if((order instanceof Order) && order!=null)
		this.order = order;
	}
}
