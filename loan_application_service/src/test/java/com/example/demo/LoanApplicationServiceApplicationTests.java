package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import io.restassured.*;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
@SpringBootTest
class LoanApplicationServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testSecondVersionForStatusCode() {
		
		Response response = RestAssured.get("http://localhost:4040/api/v2/loans");
	
		response.then().statusCode(200);
	}
	
	@Test
	void testFirstVersionForStatusCode() {

		given().auth().basic("india","india")
		 .get("http://localhost:4040/api/v1/loans").then().statusCode(200);

	}
}
