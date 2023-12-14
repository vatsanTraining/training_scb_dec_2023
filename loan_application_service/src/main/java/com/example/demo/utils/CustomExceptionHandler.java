package com.example.demo.utils;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.example.demo.domain.ErrorHandler;

@RestControllerAdvice
public class CustomExceptionHandler {

	
	@ExceptionHandler(value = RuntimeException.class)
	public ErrorHandler handleRunTimeExeception(Exception ex,WebRequest req) {
		
		return new ErrorHandler("ERR-101", ex.getMessage(), 
				req.getDescription(false), LocalDateTime.now());
	}
	
	
	
	
}
