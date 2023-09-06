package com.technopreneur.milind;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import io.github.resilience4j.circuitbreaker.CallNotPermittedException;

@ControllerAdvice
public class ExcpetionAdvicer {

	@ExceptionHandler({CallNotPermittedException.class})
	@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
	public void handleCNPException() {
		System.out.println(" Call not permitted !!");
	}
}
