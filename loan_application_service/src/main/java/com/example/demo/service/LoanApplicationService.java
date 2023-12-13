package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.LoanApplication;
import com.example.demo.repos.LoanApplicationRepository;

@Service
public class LoanApplicationService {

	
	
	 private LoanApplicationRepository repo;

	 //Repository is autowired here => Constructor DI
	 
	public LoanApplicationService(LoanApplicationRepository repo) {
		super();
		this.repo = repo;
		
		System.out.println(this.repo.getClass().getName());
	}
	 
	 
	 
	public List<LoanApplication> findAll(){
		
		return this.repo.findAll();
	}
	
   public LoanApplication findById(int id){
		
		return this.repo.findById(id)
				  .orElseThrow(() -> 
				    new RuntimeException("Element with Id"+id+"Not Available"));
	}
	
	public LoanApplication save(LoanApplication entity) {
		return this.repo.save(entity);
	}
	
}
