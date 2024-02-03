package ems.InterviewConcepts;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class MultipleRequestSpecification {
	
	RequestSpecification requestSpecification;	
	RequestSpecification requestSpecification2;
	
	@BeforeSuite
	public void setRequestSpecification() {
		//Both With & Given are same only difference is syntax
		requestSpecification = RestAssured.with().baseUri("http://localhost:3000/").basePath("employees/");
		requestSpecification2 = RestAssured.given().baseUri("http://localhost:3000/").basePath("employees")
				.body("{\r\n"
				+ "    \"first_name\": \"Akila\",\r\n"
				+ "    \"last_name\": \"pappu\",\r\n"
				+ "    \"hobby\": \"Lusu\"\r\n"
				+ "}");
		
		RestAssured.requestSpecification = requestSpecification2;
}
	
	
	
	
	
	@Test (enabled = true)
	public void GetAllEmployees() {
		
		RestAssured.given().when().get().prettyPrint();
		
	}
	
	@Test (enabled = true)
	public void GetAnmployees() {
		
		RestAssured.given().when().get("/d157").prettyPrint();
		
	}
	
	
	
	@Test (enabled = true)
	public void CreateEmployeeBDD()
	{
		given()
		.when().post().prettyPrint();
	}

}
