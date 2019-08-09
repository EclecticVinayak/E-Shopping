package com.vinayak.ShoppingFrontEnd.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vinayak.model.Category;



@Controller
public class controller {
	
	
	
	@RequestMapping(value="/", method= RequestMethod.GET )
	public String homepage()
	{
		return "homepage";
	}
	
	@RequestMapping(value="/getForm", method= RequestMethod.GET )
	public String getForm(ModelMap map)
	{
		Category c=new Category();
		map.addAttribute("cObj",c);
		return "getForm";
	}
	
	
}
