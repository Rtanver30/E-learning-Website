package com.education.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import ch.qos.logback.core.model.Model;
import jakarta.persistence.Entity;







@ControllerAdvice


@org.springframework.stereotype.Controller
public class Controller {
	@GetMapping("/")
	public String home() {
		return "index";
	}
	@GetMapping("contact")
	public String contact() {
		return"contact";
	}
	 
	@GetMapping("index")
	public String Home() {
		return"index";
	}

	
}
