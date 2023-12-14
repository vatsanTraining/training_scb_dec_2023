package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.CibilScoreService;

@RestController
@RequestMapping(path = "/api/v1/s")
public class CibilScoreController {

	private CibilScoreService service;

	public CibilScoreController(CibilScoreService service) {
		super();
		this.service = service;
	}
	
	
}
