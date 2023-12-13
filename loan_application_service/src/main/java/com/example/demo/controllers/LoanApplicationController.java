package com.example.demo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.LoanApplication;
import com.example.demo.service.LoanApplicationService;

@RestController
@RequestMapping(path = "/api/v1/loans")
public class LoanApplicationController {

	
	private LoanApplicationService service;

	// Constructor DI
	public LoanApplicationController(LoanApplicationService service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping
	public List<LoanApplication> findAll(){
		
		return this.service.findAll();
	}
	
	
	@PostMapping
	public ResponseEntity<LoanApplication> save(@RequestBody LoanApplication entity){
		
		LoanApplication addedEntity = this.service.save(entity);
		
		return ResponseEntity.status(201).body(addedEntity);
		
	}
}