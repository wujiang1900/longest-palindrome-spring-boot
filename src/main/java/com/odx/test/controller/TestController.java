package com.odx.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odx.test.domain.TestResponse;
import com.odx.test.service.TestService;

@RestController
@RequestMapping("/palin")
public class TestController {
	TestService service;
	
	TestController(TestService service) {
		this.service = service;
	}
	
	@GetMapping("/{inputString}") 
	// make inputString as path paramenter because it's required
	public TestResponse getLongestPalindromicSubstring(@PathVariable String inputString) {
		return new TestResponse(inputString,
				service.getLongestPalindromicSubstring(inputString));
	}
}
