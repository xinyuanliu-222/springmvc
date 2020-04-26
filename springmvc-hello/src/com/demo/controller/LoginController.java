package com.demo.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.LoginForm;

@Controller("login")
public class LoginController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String loadLoginForm(Map model) {
		
		LoginForm loginForm = new LoginForm();
		
		// Pass Login Form object into request context for the view page
		model.put("loginForm", loginForm); 
		
		return "loginform";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String processLoginForm(Map model, @Valid LoginForm loginForm, BindingResult result) {
		
		System.out.println("Form is submitted!");
		String uName = loginForm.getUsername();
		String pWord = loginForm.getPassword();
		System.out.println(uName + "======>" + pWord);
		
		model.put("loginForm", loginForm);
		
		// If there are VALIDATION Errors
		if(result.hasErrors())
			return "loginform";
		
		if(uName.equals("Admin") && pWord.equals("admin1"))
			return "dashboard";
		
		return "error";
	}

}
