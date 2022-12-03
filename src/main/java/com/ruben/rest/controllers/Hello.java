package com.ruben.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello
 */
@RestController()
public class Hello {
 
	@GetMapping("/hello")
  public String hello(@RequestParam(defaultValue = "crack") String name){

		return "hello "+ name;
	}
}
