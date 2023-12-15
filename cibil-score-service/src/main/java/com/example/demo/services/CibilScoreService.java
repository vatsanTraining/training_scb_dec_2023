package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.CibilScore;
import com.example.demo.repos.CibilScoreRepository;

@Service
public class CibilScoreService {

	private CibilScoreRepository repo;

	public CibilScoreService(CibilScoreRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	public List<CibilScore> findAll(){
		
		return this.repo.findAll();
	}
	
   public CibilScore findById(String id){
		
		return this.repo.findById(id)
				  .orElseThrow(() -> 
				    new RuntimeException("Element with Id "+id+" Not Available"));
	}
	
	public CibilScore save(CibilScore entity) {
		return this.repo.save(entity);
	}

}
