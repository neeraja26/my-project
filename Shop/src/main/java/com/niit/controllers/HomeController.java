package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {


	@RequestMapping(value="submit")
	public String login()
	{
		return "AdminHome";
	}
	@RequestMapping(value="signup1")
	public String submit()
	{
		return "UserLogin";
	}

	
}
