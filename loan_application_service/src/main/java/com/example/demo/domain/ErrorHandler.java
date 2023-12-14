package com.example.demo.domain;

import java.time.LocalDateTime;

public class ErrorHandler {

	
	private String errorCode;
	private String errorMessage;
	private String description;
	private LocalDateTime dateTime;
	
	public ErrorHandler() {
		super();
	}
	public ErrorHandler(String errorCode, String errorMessage, String description, LocalDateTime dateTime) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.description = description;
		this.dateTime = dateTime;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	@Override
	public String toString() {
		return "ErrorHandler [errorCode=" + errorCode + ", errorMessage=" + errorMessage + ", description="
				+ description + ", dateTime=" + dateTime + "]";
	}
	
	
	
}
