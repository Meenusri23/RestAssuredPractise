package ems.non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EmployeeManagementSystem {

	@Test(enabled = true)
	public void getAllEmployees() {

		RestAssured.baseURI = "http://localhost:3000/";

		RequestSpecification requestSpecification = RestAssured.given();

		Response jashu = requestSpecification.request(Method.GET,"employees");

		//System.out.println(response.asPrettyString());

		System.out.println(jashu.getStatusLine());
		
	}

	@Test(enabled = false)
	public void CreateEmployee() { //created ID is 4472

		RestAssured.baseURI = "http://localhost:3000/";

		RequestSpecification requestSpecification = RestAssured.given().header("Content-Type","application/json").body("{\r\n"
				+ "    \"first_name\": \"ArivuKolundhu\",\r\n"
				+ "    \"last_name\": \"Demon\",\r\n"
				+ "    \"hobby\": \"ADM\"\r\n"
				+ "}");

		Response response = requestSpecification.request(Method.POST, "employees");

		System.out.println(response.statusLine());

		System.out.println(response.asPrettyString());
		
		
	}
	
	@Test(enabled = false)
	public void UpdateAnEmployee() {
		
		RestAssured.baseURI ="http://localhost:3000/";
		
		RequestSpecification requestSpecification = RestAssured.given().body("{\r\n"
				+ "    \"first_name\": \"Kamalakannan\",\r\n"
				+ "    \"last_name\": \"Stark\",\r\n"
				+ "    \"hobby\": \"Games\"\r\n"
				+ "}");
		
		Response response = requestSpecification.request(Method.PUT,"employees/4472");
		
		System.out.println(response.asPrettyString());
		
		System.out.println(response.getStatusCode());
		
	}
	
	@Test (enabled = false)
	public void DeleteEmployee()
	{
		RestAssured.baseURI = "http://localhost:3000/";
		
		RequestSpecification requestSpecification = RestAssured.given();
		
		Response response = requestSpecification.request(Method.DELETE, "employees/54f0");
		
		System.out.println(response.asPrettyString());
		
		System.out.println(response.getStatusCode());
	}
	
	
}
