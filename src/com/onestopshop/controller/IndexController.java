package com.onestopshop.controller;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onestopshop.beans.Item;
import com.onestopshop.beans.LoginBean;
import com.onestopshop.beans.RegisterBean;
import com.onestopshop.model.IndexModel;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String homePage(ArrayList<Item> items, ModelMap model) {
		IndexModel objIndexModel = new IndexModel();
		if((items = objIndexModel.getItems(items)) != null){
			model.addAttribute("items", items);
			return "index";
		}
		return "errors";
	}
	
		@RequestMapping(value = "/logout", method = RequestMethod.GET)
			public String logOut(ModelMap model,HttpSession session) {
				session.invalidate();
				model.addAttribute("login", new LoginBean());
				model.addAttribute("register", new RegisterBean());
				return "init";
			}

	
}
