package com.example.demo.udemy.First.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String name, String password) {
		return name.equalsIgnoreCase("Gokul")&&password.equalsIgnoreCase("prasath");
	}

}
