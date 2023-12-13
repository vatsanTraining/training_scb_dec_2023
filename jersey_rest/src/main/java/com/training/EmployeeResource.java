package com.training;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("employees")
public class EmployeeResource {

	
	
	@GET
	@Produces("application/json")
	public Employee getEmployee() {
		
		return new Employee(102, "Ramesh");
	}
}
