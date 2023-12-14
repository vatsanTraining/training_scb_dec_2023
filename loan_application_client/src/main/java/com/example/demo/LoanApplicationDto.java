package com.example.demo;

public class LoanApplicationDto {

	

	private int applicationNumber;
	
	private String applicantName;
	
	private double loanAmount;
	
	private String panNumber;
	
	
	public LoanApplicationDto() {
		super();
	}
	public LoanApplicationDto(int applicationNumber, String applicantName, double loanAmount, String panNumber) {
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
