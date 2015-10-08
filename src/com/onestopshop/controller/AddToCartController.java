package com.onestopshop.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.onestopshop.beans.Item;
import com.onestopshop.model.Cart;

@Controller
@RequestMapping(value="/cart")
public class AddToCartController {
	
	@RequestMapping(value="/form")
	public String index(ModelMap model){
		
		model.put("cart",new Item());
		return "cartForm";
	}

	
	//Create function to save items into cart using session variables
	@RequestMapping(value="/addCart", method= RequestMethod.POST)
	public String addCart(@ModelAttribute("cart") Cart cart, HttpSession session){
		List<Cart> list = (List<Cart>) session.getAttribute("cart");
		if(list==null){
			list=new ArrayList<>();
			list.add(cart);
			}
		else{
			boolean flag = false;
			for(Cart cart1:list){
				//Handling duplicate items and increasing the quantity in  cart
				if(cart1.getItemList()== cart.getItemList()){
					
				//	cart1.setQuantity(cart1.getQuantity()+1);
					
					flag=true;
					break;
				}
			}
			if(flag==false){
				list.add(cart);
			}
			session.setAttribute("cart", list);
			session.setAttribute("total", getTotal(list));
		}
		return "cart";
	}
	
	//Save list of items in session variables
	public float getTotal(List<Cart> list){
		float total=0;
		for (Cart cart:list ){
			//handling total amount of item in cart
//			total+=(cart.getQuantity()+cart.getPrice());  // if we fetch quantity from bean
		}
		return total;
	}
	@RequestMapping(value="/remove",method= RequestMethod.GET)
	public String remove(@RequestParam(value="id") int id,HttpSession session ){
		List<Cart> list = (List<Cart>) session.getAttribute("cart");
		if(list!=null)
		return "cart";
	}

}
}
