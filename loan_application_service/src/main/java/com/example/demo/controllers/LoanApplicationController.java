package com.example.demo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	@GetMapping(produces = "application/json")
	public List<LoanApplication> findAll(){
		
		return this.service.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public LoanApplication findById(@PathVariable int id){
		
		return this.service.findById(id);
	}
	
	@GetMapping(path = "/srch/name/{name}")
	public List<LoanApplication> findByName(@PathVariable String name){
		
		return this.service.findByName(name);
		
	}
	
	@GetMapping(path = "/srch/amount/{amount}")
	public List<LoanApplication> findByLoanAmountGrtThan(@PathVariable  double amount){
		
		return this.service.loanAmountGrtThan(amount);
		
	}
	
	
	@PostMapping(consumes = "application/json")
	public ResponseEntity<LoanApplication> save(@RequestBody LoanApplication entity){
		
		LoanApplication addedEntity = this.service.save(entity);
		
		return ResponseEntity.status(201).body(addedEntity);
		
	}
	
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable(name = "id") int id) {
        service.delete(id);
        
        return ResponseEntity.ok("Deleted");
    }

}
