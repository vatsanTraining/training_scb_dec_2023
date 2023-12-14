package com.example.demo.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cibil_score")
public class CibilScore {

	
	@Id
	@Column(name = "pan_number",length = 10)
	private String panNumber;
	
	@Column(name="score")
	private int score;
	
	@Column(name="last_updated")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate lastUpdated;
	
	
}
