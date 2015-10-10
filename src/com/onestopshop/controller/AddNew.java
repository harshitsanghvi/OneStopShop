package com.onestopshop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddNew {
	
		@RequestMapping(value="/AddCart" ,method= RequestMethod.POST)
			public void addCart(HttpServletRequest request, HttpServletResponse response){
				String name = request.getParameter("item");
				HttpSession session = request.getSession();
				System.out.println("hey");
			}

}
