package ems.InterviewConcepts;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationExample {
	
	RequestSpecification requestSpecification;
	
	@BeforeSuite
	public void setRequestSpecification() {
		//Both With & Given are same only difference is syntax
		requestSpecification = RestAssured.with().baseUri("http://localhost:3000/").basePath("employees/");
	}
	
	@Test
	public void GetAllEmployees() {
		
		RestAssured.given().spec(requestSpecification).when().get().prettyPrint();
		
	}
	
	@Test
	public void GetAnmployees() {
		
		RestAssured.given().spec(requestSpecification).when().get("d157").prettyPrint();
		
	}

}
