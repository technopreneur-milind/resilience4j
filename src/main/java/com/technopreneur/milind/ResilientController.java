package com.technopreneur.milind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/resilient/api")
public class ResilientController {
	
	@Autowired
	private ResilientCallService resilientCallService;
	
	@GetMapping("/value1")
	@CircuitBreaker(name = "CircuitBreakerService")
	public String getValue1() {
		return resilientCallService.getValue1();
		
	}
	
	@GetMapping("/value2")
	public String getValue2() {
		return resilientCallService.getValue2();
	}

}
