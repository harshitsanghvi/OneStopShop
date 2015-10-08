package com.onestopshop.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onestopshop.beans.LoginBean;
import com.onestopshop.beans.RegisterBean;
import com.onestopshop.model.RegisterModel;

@Controller
public class RegisterController {
		
		@RequestMapping(value="/addUser", method = RequestMethod.POST)
		public String registerPage(@Valid RegisterBean register, ModelMap model){ 
			
			model.addAttribute("id", register.getId());
			model.addAttribute("firstName", register.getFirstName());
			model.addAttribute("lastName", register.getLastname());
			model.addAttribute("userId", register.getUserId());
			model.addAttribute("phone", register.getPhone());
			model.addAttribute("addressId", register.getAddressId());
						
			return "profile";
			
			/*RegisterModel objRegisterModel = new RegisterModel();
			if(objRegisterModel.addUser()){
				return "error";
			}
			return "index";
		}
		
		@RequestMapping(value="/register", method = RequestMethod.GET)
		public String fetchRegisterPage() {
			return "register";
		}*/
}

}