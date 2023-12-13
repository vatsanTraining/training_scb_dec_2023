package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.LoanApplication;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Integer> {

}
