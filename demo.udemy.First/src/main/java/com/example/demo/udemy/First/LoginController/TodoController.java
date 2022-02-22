package com.example.demo.udemy.First.LoginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.udemy.First.Service.LoginService;
import com.example.demo.udemy.First.Service.TodoService;
@Controller
public class TodoController {
	@Autowired
	TodoService service;

	@RequestMapping(value="list-todos",method=RequestMethod.GET)
	public String showTodos(ModelMap model) {
		model.put("todos", service.retrieveTodos("in28Minutes"));
		return "list-todos";
	}
}
