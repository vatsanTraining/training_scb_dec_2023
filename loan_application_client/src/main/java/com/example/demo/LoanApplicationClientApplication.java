package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class LoanApplicationClientApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx	 =SpringApplication.run(LoanApplicationClientApplication.class, args);

	   RestTemplate template = ctx.getBean(RestTemplate.class);
	   
//	    String response =template.getForObject("http://localhost:4040/api/v1/loans", String.class);
//	
//	    System.out.println(response);
	   
	    LoanApplicationDto[] responses =
	    		template.getForObject("http://LOAN-APPLICATION-SERVICE/api/v1/loans", 
	    				LoanApplicationDto[].class);
		
	    for(LoanApplicationDto eachElement : responses) {
	    	
	    	System.out.println(eachElement.getApplicantName() +","  +eachElement.getLoanAmount());
	    }
	    
		String response = template.getForObject("http://CIBIL-SCORE-SERVICE/api/v1/scores/"+"TNAB2010", String.class);

		System.out.println(response);
	}

	
	@Bean
	@LoadBalanced
    public RestTemplate template() {
		
		RestTemplateBuilder builder=new RestTemplateBuilder()
				      .basicAuthentication("india", "india");
		
		 return builder.build();
	}
	
	
	

}
