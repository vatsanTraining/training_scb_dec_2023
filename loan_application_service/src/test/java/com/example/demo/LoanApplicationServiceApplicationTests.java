package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import io.restassured.*;
import io.restassured.response.Response;
@SpringBootTest
class LoanApplicationServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testForStatusCode() {
		
		Response response = RestAssured.get("http://localhost:4040/api/v2/loans");
	
		response.then().statusCode(200);
	}
}
