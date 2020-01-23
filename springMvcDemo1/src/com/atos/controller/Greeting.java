package com.atos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Greeting 
{
	@RequestMapping("/")
	public String greet(){
		return "index";
	}

	}
