package com.technopreneur.milind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MyService {
	
	private final RestTemplate restTemplate;

    @Autowired
    public MyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    public String getValue1() {
    	return this.restTemplate.getForObject("http://localhost:9090/backend/value1", String.class);
    }
    
    public String getValue2() {
    	return this.restTemplate.getForObject("http://localhost:9090/backend/value2", String.class);
    }
    
}
