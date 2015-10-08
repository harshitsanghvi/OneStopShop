package com.onestopshop.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.onestopshop.beans.LoginBean;
import com.onestopshop.model.LoginModel;

@Controller
public class LoginController {

	@RequestMapping(value = "/verify", method = RequestMethod.POST)
	public String loginPage( LoginBean login, BindingResult result) {

		if (result.hasErrors()) {
			return "errors";
		} 
		String uname = login.getUname();
		String password = login.getPassword();
		LoginModel objLoginModel = new LoginModel();
		System.out.println(uname + password);
		if (uname != null && password != null) {
			if (objLoginModel.validateUser(login)) {
				return "index";
			}
		}
		return "errors";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView RegisterPage() {
		return new ModelAndView("login", "login", new LoginBean());
	}
}
