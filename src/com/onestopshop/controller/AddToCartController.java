package com.onestopshop.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.onestopshop.beans.Item;
import com.onestopshop.model.Cart;
import com.onestopshop.model.ItemModel;

@Controller
@RequestMapping("/cart")
public class AddToCartController {
	
	@RequestMapping(value="/form",method=RequestMethod.GET)
	public String index(ModelMap model){
		
		model.put("cart",new Cart());
		return "cartForm";
	}

	@RequestMapping(value="/AddCart" ,method= RequestMethod.GET)
	public void addCart(@RequestParam String item, HttpServletRequest request){
		HttpSession session = request.getSession();
		Cart cart = (Cart) session.getAttribute("cartList");
		if(cart==null){
			Cart cartNew = new Cart();
			session.setAttribute("cartList", cartNew);
			cart=cartNew;
		}
		ItemModel itemModel = new ItemModel();
		Item itemAdd = new Item();
		itemAdd = itemModel.getItem(Integer.parseInt(item),itemAdd);
		cart.addItem(itemAdd);
		
		System.out.println("Items in cart:");
		for(Item i: cart.getItemList()){
			System.out.println(i.getId());
		}
		System.out.println();
		
	}

	@RequestMapping(value="/viewcart",method=RequestMethod.GET)
	public String viewCart(ModelMap model){
		//model.put("cart",new Cart());
		return "cart";
	}
	
	/*//Create function to save items into cart using session variables
	@RequestMapping(value="/addCart", method= RequestMethod.POST)
	public String addCart(@ModelAttribute Cart cart, HttpSession session){
		List<Cart> list = (List<Cart>) session.getAttribute("cart");
		if(list==null){
			
			list=new ArrayList<>();
			list.add(cart);
			}
		else{
			System.out.println("4");
			boolean flag = false;
			for(Cart cart1:list){
				//Handling duplicate items and increasing the quantity in  cart
				if(cart1.getId()== cart.getId()){
					
					cart1.setQuantity(cart1.getQuantity()+1);
					
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
	}*/
	
	/*//Save list of items in session variables
	public float getTotal(List<Cart> list){
		float total=0;
		for (Cart cart:list ){
			//handling total amount of item in cart
		total+=(cart.getQuantity()+cart.getPrice());  // if we fetch quantity from bean
		}
		return total;
	}
	@RequestMapping(value="/remove",method= RequestMethod.GET)
	public String remove(@RequestParam(value="id") int id,HttpSession session ){
		List<Cart> list = (List<Cart>) session.getAttribute("cart");
		if(list!=null)
		{
			for(Cart cart:list){
				if(cart.getId()==id)
				{
					list.remove(cart);
					break;
				}
			}
		}
		session.setAttribute("cart", list);
		session.setAttribute("total", getTotal(list));

		return "cart";
	}
	*/

}

