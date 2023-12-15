package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.security.config.Customizer.withDefaults;
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
	 SecurityFilterChain filerChain(HttpSecurity http) throws Throwable{
		
		
		http.authorizeHttpRequests(auth -> auth.requestMatchers("/api/v2/loans/**","/api/v1/process/**").permitAll());
		
		http.authorizeHttpRequests(auth -> auth.requestMatchers("/api/v1/loans/**")
				    .authenticated()).httpBasic(withDefaults());
		
		
		return http.build();
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
