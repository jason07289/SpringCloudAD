package com.jason.EurekaClient3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@RequestMapping("/hello")
	public String printHelloWorld() {
	return "Hello MSA World! : 3rd Client";
	}
}
