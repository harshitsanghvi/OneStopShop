package com.onestopshop.beans;

import javax.persistence.Column;

import org.hibernate.validator.constraints.NotEmpty;

public class AddressBean {
	@NotEmpty
	@Column(name = "ADDRESSLINE1", nullable = false)
	private String addressLine1;
	
	@Column(name = "ADDRESSLINE2")
	private String addressLine2;
	
	@NotEmpty
	@Column(name = "CITY", nullable = false)
	private String city;
	
	@NotEmpty
	@Column(name = "STATE", nullable = false)
	private String state;
	
	@NotEmpty
	@Column(name = "COUNTRY", nullable = false)
	private String country;
	
	@NotEmpty
	@Column(name = "ZIP", nullable = false)
	private int zip;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
}
