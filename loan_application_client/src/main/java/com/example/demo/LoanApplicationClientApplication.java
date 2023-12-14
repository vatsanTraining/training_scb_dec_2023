package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class LoanApplicationClientApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx	 =SpringApplication.run(LoanApplicationClientApplication.class, args);

	   RestTemplate template = ctx.getBean(RestTemplate.class);
	   
	    String response =template.getForObject("http://localhost:4040/api/v1/loans", String.class);
	
	    System.out.println(response);
	}

	
	@Bean
	public RestTemplate template() {
		
		return new RestTemplate(); 
	}
}
