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
	
	@RequestMapping(value = "/item/{itemid}", method = RequestMethod.GET)
	public @ResponseBody String homePage(@PathVariable(value="itemid") String strId, Item item, ModelMap model) {
		int id = Integer.parseInt(strId);
		ItemModel objItemModel = new ItemModel();
		if((item = objItemModel.getItem(id, item)) != null){
			model.addAttribute("item", item);
			System.out.println(item.getTitle());
			return "item";
		}
		return "errors";
	}

}

