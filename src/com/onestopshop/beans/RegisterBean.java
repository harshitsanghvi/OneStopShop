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
	@Column(name = "USERID", nullable = false)
	private long userId;
	
	@NotEmpty
	@Column(name = "PHONE", nullable = false)
	private long phone;
	
	@NotEmpty
	@Column(name = "ADDRESSID", nullable = false)
	private long addressId;
	
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
}
