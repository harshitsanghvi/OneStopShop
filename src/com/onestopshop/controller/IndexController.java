package com.onestopshop.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onestopshop.beans.AddressBean;
import com.onestopshop.beans.Item;
import com.onestopshop.beans.LoginBean;
import com.onestopshop.beans.RegisterBean;
import com.onestopshop.model.IndexModel;
import com.onestopshop.model.RegisterModel;

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
	
}
