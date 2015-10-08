package com.onestopshop.model;

import com.onestopshop.beans.LoginBean;
import com.onestopshop.dao.LoginDao;
import com.onestopshop.security.MD5Checksum;

public class LoginModel {
	
	public boolean validateUser(LoginBean login){
		String uname = login.getUname();
		String password = MD5Checksum.crypt(login.getPassword());
		login.setUname(uname);
		login.setPassword(password);
		LoginDao objLoginDao = new LoginDao();
		return objLoginDao.checkLogin(login);
	}

}
