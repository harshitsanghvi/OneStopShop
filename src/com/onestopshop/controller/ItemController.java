package com.onestopshop.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.onestopshop.beans.Item;
import com.onestopshop.model.ItemModel;

@Controller
public class ItemController {
	
	@RequestMapping(value = "/item/{itemname}", method = RequestMethod.GET)
	public @ResponseBody String homePage(@PathVariable(value="itemname") String name, Item item, ModelMap model) {
		ItemModel objItemModel = new ItemModel();
		if((item = objItemModel.getItem(name, item)) != null){
			model.addAttribute("item", item);
			return "item";
		}
		return "errors";
	}

}

