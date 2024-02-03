package ems.InterviewConcepts;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class GetHeaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RequestSpecification requestSpecification =  RestAssured.given().header("Content-Type","application/json")
				.baseUri("http://localhost:3000/").basePath("employees");
		
		Response response = requestSpecification.request(Method.GET);
		
		QueryableRequestSpecification queryableRequestSpecification  = SpecificationQuerier.query(requestSpecification);
		
		System.out.println(queryableRequestSpecification.getHeaders());
		System.out.println(queryableRequestSpecification.getBasePath());
		System.out.println(queryableRequestSpecification.getBaseUri());
	}

}
