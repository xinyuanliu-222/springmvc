package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("sayhello")
	public ModelAndView sayHi() {
		
		String message = "Welcome to Spring MVC Concepts!";
		
		return new ModelAndView("hello", "mymessage", message); // view page name, key name for data, data
	}
	
}
