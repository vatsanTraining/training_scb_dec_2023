package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.LoanApplication;
import com.example.demo.repos.LoanApplicationRepository;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Loan Application Service"))
public class LoanApplicationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanApplicationServiceApplication.class, args);
	}
	
	@Bean
    public RestTemplate template() {
		
		return new RestTemplate(); 
	}
	
	@Bean
	BCryptPasswordEncoder encoder() {
		
		return new BCryptPasswordEncoder();
	}
	
	@Bean
    CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			
			@Autowired
			LoanApplicationRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				
				repo.save(new LoanApplication(2011, "Sumesh", 400000, "TNAC4010"));
			}
		};
	}

}
