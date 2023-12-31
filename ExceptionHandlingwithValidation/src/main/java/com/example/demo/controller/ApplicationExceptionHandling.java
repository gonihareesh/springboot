package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationExceptionHandling 
{
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
public Map<String, String> handle(MethodArgumentNotValidException ex){
	Map<String, String> map=new HashMap<>();
	ex.getBindingResult().getFieldErrors().forEach(error->{
		map.put(error.getField(), error.getDefaultMessage());
		
	});
	
		
	
	return map;
}
	
	
}
