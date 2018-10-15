package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloSwagger {
	
	@GetMapping
	public String sayHello() {
		return "Hello Swagger";
	}
	
	@PostMapping("/add")
	public String addMessage(@RequestBody final String message) {
		return message;
	}
	

	@PutMapping("/update")
	public String updateMessage(@RequestBody final String message) {
		return message;
	}
	
	

}
