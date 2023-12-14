package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.UserDetailsManagerConfigurer.UserDetailsBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	
	private BCryptPasswordEncoder encoder;

	// Constructor DI
	public SecurityConfig(BCryptPasswordEncoder encoder) {
		super();
		this.encoder = encoder;
	}
	
	
	@Bean
	 SecurityFilterChain filerChain(HttpSecurity http) {
		
		return null;
	}
	
	@Bean
	UserDetailsManager  users() {
		
		UserDetails indiaUser = User.withUsername("india")
				     .password(encoder.encode("india"))
				      .authorities("ADMIN")
				      .build();
		
		UserDetails nepalUser = User.withUsername("nepal")
			     .password(encoder.encode("nepal"))
			      .authorities("GUEST")
			      .build();
		return new InMemoryUserDetailsManager(indiaUser,nepalUser);
	
		
		
	}
	
}
