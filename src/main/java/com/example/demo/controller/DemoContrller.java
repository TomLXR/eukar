package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoContrller {
	@RequestMapping("html")
	public String help(){
		return "index";
	}
}
