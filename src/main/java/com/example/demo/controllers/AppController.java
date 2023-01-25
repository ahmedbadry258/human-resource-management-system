package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AppController {
	@RequestMapping("/")
	public String hi() {
		return "Welcome to HR Application"; 
	}

}
