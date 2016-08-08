package com.niit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.ProductDAO;

@Controller
public class LoginController {
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping(value="login")
	public String login()
	{
		return "Login";
	}

	@RequestMapping(value="/")
	public ModelAndView hello()
	{
		ModelAndView mv=new ModelAndView("Index","product",productDAO.list());
		return mv;
	}
	@RequestMapping(value="signup")
	public String submit()
	{
		return "registration";
	}


	
}

