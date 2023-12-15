package com.example.demo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CibilScore;
import com.example.demo.services.CibilScoreService;

@RestController
@RequestMapping(path = "/api/v1/scores")
public class CibilScoreController {

	private CibilScoreService service;

	public CibilScoreController(CibilScoreService service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping(produces = "application/json")
	public List<CibilScore> findAll(){
		
		return this.service.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public CibilScore findById(@PathVariable String id){
		
		return this.service.findById(id);
	}
	
	
	
	@PostMapping(consumes = "application/json")
	public ResponseEntity<CibilScore> save(@RequestBody CibilScore entity){
		
		CibilScore addedEntity = this.service.save(entity);
		
		return ResponseEntity.status(201).body(addedEntity);
		
	}

}
