package com.onestopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onestopshop.beans.LoginBean;
import com.onestopshop.beans.RegisterBean;
import com.onestopshop.model.RegisterModel;

@Controller
public class RegisterController {
		
		@RequestMapping(value="/addUser", method = RequestMethod.POST)
		public String registerPage(RegisterBean register) {
			
			RegisterModel objRegisterModel = new RegisterModel();
			if(objRegisterModel.addUser( )){
				return "error";
			}
			return "index";
		}
		
		@RequestMapping(value="/register", method = RequestMethod.GET)
		public String fetchRegisterPage() {
			return "register";
		}
}
