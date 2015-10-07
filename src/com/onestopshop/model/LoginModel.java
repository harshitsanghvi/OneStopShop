package com.onestopshop.model;

import com.onestopshop.dao.LoginDao;
import com.onestopshop.security.MD5Checksum;

public class LoginModel {
	
	public boolean validateUser(String uname, String password){
		password = MD5Checksum.crypt(password);
		LoginDao objLoginDao = new LoginDao();
		return objLoginDao.checkLogin(uname, password);
	}

}
