package com.technopreneur.milind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	private MyService myService;
	
	@GetMapping("/value1")
	public String getValue1() {
		return myService.getValue1();
		
	}
	
	@GetMapping("/value2")
	public String getValue2() {
		return myService.getValue2();
	}

}
