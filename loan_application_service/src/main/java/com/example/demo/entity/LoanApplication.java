package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "loan_application")
public class LoanApplication {

	

	@Id
	@Column(name = "application_number")
	private int applicationNumber;
	
	@Column(name="applicantName", length = 40)
	private String applicantName;
	
	@Column(name = "loan_amount",precision = 2)
	private double loanAmount;
	
	@Column(name="pan_number",length = 10)
	private String panNumber;
	
	
	public LoanApplication() {
		super();
	}
	public LoanApplication(int applicationNumber, String applicantName, double loanAmount, String panNumber) {
		super();
		this.applicationNumber = applicationNumber;
		this.applicantName = applicantName;
		this.loanAmount = loanAmount;
		this.panNumber = panNumber;
	}
	public int getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(int applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	@Override
	public String toString() {
		return "LoanApplication [applicationNumber=" + applicationNumber + ", applicantName=" + applicantName
				+ ", loanAmount=" + loanAmount + ", panNumber=" + panNumber + "]";
	}
	
	
}
