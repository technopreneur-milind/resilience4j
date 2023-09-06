package com.technopreneur.milind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@RestController
@RequestMapping("/resilient/api")
public class ResilientController {
	
	@Autowired
	private MyService myService;
	
	@GetMapping("/value1")
	@Bulkhead(name="bulkheadApi")
	@CircuitBreaker(name = "CircuitBreakerService")
	public String getValue1() {
		return myService.getValue1();
		
	}
	
	@GetMapping("/value2")
	@RateLimiter(name = "rateLimiterApi")
	@CircuitBreaker(name = "CircuitBreakerService")
	public String getValue2() {
		return myService.getValue2();
	}

}
