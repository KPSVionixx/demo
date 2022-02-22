package com.example.demo.udemy.First.LoginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.udemy.First.Service.LoginService;
@Controller
public class LoginController {
	@Autowired
	LoginService service;
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String loginMessage(@RequestParam String name, String password,ModelMap model)
	{
		if(!service.validateUser(name, password))
			{
			model.put("message", "Invalid Credentials");
			return "login";
			}
		model.put("myname", name);
		model.put("password", password);
		System.out.println(name+password);
		return "welcome";
	}
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String loginMessage() {
		return "login";
	}
}
