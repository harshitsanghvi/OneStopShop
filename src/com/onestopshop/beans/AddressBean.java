package com.onestopshop.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "ADDRESS")
public class AddressBean {
	
	@Id @GeneratedValue
	@Column(name="ID", nullable = false)
	private Long id;
	
	@NotEmpty
	@Column(name = "ADDRESSLINEONE", nullable = false)
	private String addressLineOne;
	
	@Column(name = "ADDRESSLINETWO")
	private String addressLineTwo;
	
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
	private Integer zip;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getAddressLineOne() {
		return addressLineOne;
	}
	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
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

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}
}
