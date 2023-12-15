package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.CibilScore;
import com.example.demo.repos.CibilScoreRepository;

@SpringBootApplication
public class CibilScoreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CibilScoreServiceApplication.class, args);
	}

	@Bean
    CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			
			@Autowired
			CibilScoreRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				
				repo.save(new CibilScore("TNAB4010",720,LocalDate.now()));
			}
		};
	}

}
