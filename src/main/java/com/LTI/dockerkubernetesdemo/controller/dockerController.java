package com.LTI.dockerkubernetesdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dockerController {
	@GetMapping("")
	public String getData() {
	return "The application is running successfully";
	}
}
