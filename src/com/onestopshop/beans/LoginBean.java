package com.onestopshop.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "USERLOGIN")
public class LoginBean {

	
	@Id @GeneratedValue
	@Column(name="ID", nullable = false)
	private Long id;
	
	@NotEmpty
	@Email
	@Column(name="UNAME", nullable = false)
	private String uname;
	
	@NotEmpty
	@Column(name="PASSWORD", nullable = false)
	private String password;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
}
