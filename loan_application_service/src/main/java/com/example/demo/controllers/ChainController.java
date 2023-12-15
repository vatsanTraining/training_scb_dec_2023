package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/api/v1/process")
public class ChainController {

	
	
	RestTemplate template;

	//Constructor DI
	public ChainController(RestTemplate template) {
		super();
		this.template = template;
	}
	
	@GetMapping(path="/{pan}",produces = "application/json")
	public ResponseEntity<String> getScore(@PathVariable("pan") String pan){
		
		String response = template.getForObject("http://localhost:5050/api/v1/scores/"+pan, String.class);
		
		return ResponseEntity.ok(response);
	}
	
}
