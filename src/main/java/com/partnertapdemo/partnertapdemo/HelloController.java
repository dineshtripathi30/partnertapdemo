package com.partnertapdemo.partnertapdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Welcome to the TAP Demo by Tanzu Partner SE Team";
	}
	@RequestMapping("/tap")
	public String tap() {
		return "Great to be here huh , go tanzu";
	}
	@RequestMapping("/shopping")
	public String shopping() {
		return "Hey Partners, you can do some shopping here and also win prices";
	}
	@RequestMapping("/shopping1")
	public String shopping1() {
		return "Hey Partners, you can do some shopping here and also win prices 2";
	}
}