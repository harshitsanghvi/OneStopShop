package com.onestopshop.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "USERPROFILE")
public class RegisterBean {
	
	@Id @GeneratedValue
	@Column(name="ID", nullable = false)
	private long id;
	
	@NotEmpty
	@Column(name = "FIRSTNAME", nullable = false)
	private String firstName;
	
	@NotEmpty
	@Column(name = "LASTNAME", nullable = false)
	private String lastname;
	
	@NotEmpty
	@Column(name = "UNAME", nullable = false)
	private String uname;
	
	@NotEmpty
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
	@NotEmpty
	@Column(name = "PHONE", nullable = false)
	private long phone;
	
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
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
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
