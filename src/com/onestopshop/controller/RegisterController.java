package com.onestopshop.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.onestopshop.beans.AddressBean;
import com.onestopshop.beans.LoginBean;
import com.onestopshop.beans.RegisterBean;
import com.onestopshop.model.RegisterModel;

@Controller
public class RegisterController {

	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String registerPage(@Valid RegisterBean register, @Valid AddressBean address, @Valid LoginBean login) {

		RegisterModel objRegModel = new RegisterModel();
		if(objRegModel.addUser(register, address, login)){
			return "profile";
		}
		return "errors";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView RegisterPage() {
		return new ModelAndView("profile", "profile", new RegisterBean());
	}

}