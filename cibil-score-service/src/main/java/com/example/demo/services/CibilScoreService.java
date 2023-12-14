package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.repos.CibilScoreRepository;

@Service
public class CibilScoreService {

	private CibilScoreRepository repo;

	public CibilScoreService(CibilScoreRepository repo) {
		super();
		this.repo = repo;
	}
	
	
}
