package com.onestopshop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onestopshop.beans.AddressBean;
import com.onestopshop.beans.LoginBean;
import com.onestopshop.beans.RegisterBean;
import com.onestopshop.model.RegisterModel;

@Controller
public class RegisterController {


	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String registerPage(@ModelAttribute("register")RegisterBean register, AddressBean address, LoginBean login) {
 
		RegisterModel objRegModel = new RegisterModel();
		if(objRegModel.addUser(register, address, login)){
			return "index";
		}
		return "errors";
	}

	/*@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView RegisterPage() {
		
		return new ModelAndView("register", "register", new RegisterBean());
	}
*/
}