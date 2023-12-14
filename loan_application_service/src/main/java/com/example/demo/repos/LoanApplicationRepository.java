package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.LoanApplication;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Integer> {

	// select * from Loan application where applicantName =qryString
	List<LoanApplication> findByApplicantName(String qryString);
	
	//select * from loan_application where loan_amount>qryValue // native query
	
	//JPQL uses the class Name and PropertyName
	
	@Query(value = "from LoanApplication where loanAmount>:qryValue")
	List<LoanApplication> getLoanAmountGrtThan(@Param("qryValue") double qryValue);
	
	
}
