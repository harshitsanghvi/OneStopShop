package com.onestopshop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onestopshop.beans.LoginBean;
import com.onestopshop.model.LoginModel;

@Controller
public class LoginController {
	
	@RequestMapping(value="/verify", method = RequestMethod.POST)
	public String addEmp(LoginBean login) {
		
		LoginModel objLoginModel = new LoginModel();
		if(objLoginModel.validateUser(login.getUname(), login.getPassword())){
			return "error";
		}
		return "index";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String fetchLoginPage() {
		return "login";
	}
}
