package com.capacitacion.taskbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

	@GetMapping("/hello")
	public String getMessage() {
		return "Hola Mundo";
	}

}
