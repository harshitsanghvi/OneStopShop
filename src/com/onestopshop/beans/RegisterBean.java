package com.onestopshop.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "USERPROFILE")
public class RegisterBean {
	
	@Id @GeneratedValue
	@Column(name="ID", nullable = false)
	private Long id;
	
	@NotEmpty
	@Column(name = "FIRSTNAME", nullable = false)
	private String firstName;
	
	@NotEmpty
	@Column(name = "LASTNAME", nullable = false)
	private String lastName;
	
	@Transient
	private String uname;
	
	@Transient
	private String password;

	@GeneratedValue
	@Column(name = "USERID", nullable = false)
	private Long userId;
	
	@NotEmpty
	@Column(name = "PHONE", nullable = false)
	private Long phone;
	
	@Transient
	private String addressLineOne;
	
	@Transient
	private String addressLineTwo;
	
	@Transient
	private String city;
	
	@Transient
	private String state;
	
	@Transient
	private String country;
	
	@Transient
	private Integer zip;
	
	@GeneratedValue
	@Column(name = "ADDRESSID", nullable = false)
	private Long addressId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
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
	public String getAddressLineOne(){
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
