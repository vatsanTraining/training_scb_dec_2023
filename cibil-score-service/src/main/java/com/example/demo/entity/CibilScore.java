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

	public CibilScore() {
		super();
	}

	public CibilScore(String panNumber, int score, LocalDate lastUpdated) {
		super();
		this.panNumber = panNumber;
		this.score = score;
		this.lastUpdated = lastUpdated;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public LocalDate getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Override
	public String toString() {
		return "CibilScore [panNumber=" + panNumber + ", score=" + score + ", lastUpdated=" + lastUpdated + "]";
	}
	
	
	
}
