package com.myjavaapps.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AppController {

	@GetMapping(path="/set1")
	public String getValue() {
		return "This is Sneha";
	}
	

}
