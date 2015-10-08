package com.onestopshop.model;

import com.onestopshop.beans.AddressBean;
import com.onestopshop.beans.LoginBean;
import com.onestopshop.beans.RegisterBean;
import com.onestopshop.dao.RegisterDao;
import com.onestopshop.security.MD5Checksum;

public class RegisterModel {
	
	public boolean addUser(RegisterBean register, AddressBean address, LoginBean login){
		RegisterDao objRegDao = new RegisterDao();
		String uname = login.getUname();
		String password = login.getPassword();
		
		password = MD5Checksum.crypt(password);
		login.setUname(uname);
		login.setPassword(password);
		return objRegDao.registerUser(register, address, login);
	}
}