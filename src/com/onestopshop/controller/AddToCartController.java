package com.onestopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onestopshop.beans.Item;

@Controller
@RequestMapping(value="/cart")
public class AddToCartController {
	
	@RequestMapping(value="/form")
	public String index(ModelMap model){
		
		model.put("cart",new Item());
		return "cartForm";
	}

	@RequestMapping(value="/addCart", method= RequestMethod.POST)
	public String addCart(){
		
		return "cart";
	}


}
