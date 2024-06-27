package com.ss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/saveStudent")
	public String getMessage()
	{
		return "Hello Docker";
	}

}
