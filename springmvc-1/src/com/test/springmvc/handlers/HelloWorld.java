package com.test.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	
	@RequestMapping("/helloworld")
	public String helloWorld() {
		System.out.println("Hello World!");
		return "success";
	}
}
