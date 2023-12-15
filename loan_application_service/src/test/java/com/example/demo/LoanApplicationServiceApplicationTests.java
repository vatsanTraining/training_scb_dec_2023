package com.example.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import io.restassured.*;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import static org.hamcrest.CoreMatchers.*;
@SpringBootTest
class LoanApplicationServiceApplicationTests {

	@Test
	@Disabled
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
	
	@Test
	void testForGivenNameInResponse() {
		
		 given().auth().basic("india", "india").pathParam("id", 1010)
		 .when()
		 .expect().body("applicantName", equalTo("Ramesh"))
		 .when().get("http://localhost:4040/api/v1/loans/{id}");

	}
	
	@Test
	void testContentType() {

		             given().auth().basic("india", "india")
	        		.when()
			.get("http://localhost:4040/api/v1/loans")
			.then()
			.contentType("application/json");

	}

}
