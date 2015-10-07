package com.onestopshop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.onestopshop.beans.LoginBean;
import com.onestopshop.model.LoginModel;

@Controller
public class LoginController {
	
	@RequestMapping(value="/verify", method = RequestMethod.POST)
	public String loginPage(LoginBean login) {
		
		LoginModel objLoginModel = new LoginModel();
		if(objLoginModel.validateUser(login.getUname(), login.getPassword())){
			return "error";
		}
		return "index";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView fetchLoginPage() {
		return new ModelAndView("login", "login", new LoginBean());
	}
}
