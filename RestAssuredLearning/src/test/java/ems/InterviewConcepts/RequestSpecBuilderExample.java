package ems.InterviewConcepts;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecBuilderExample {

	public static void main(String[] args) {
		
		RequestSpecBuilder builder = new RequestSpecBuilder();
		/*
		 * builder.setBaseUri("http://localhost:3000/");
		 * builder.setBasePath("employees");
		 * RequestSpecification specification = builder.build();
		 */
		
		RequestSpecification specification = builder.setBaseUri("http://localhost:3000/").setBasePath("employees").build();		
		RestAssured.given().spec(specification).when().get("/2").prettyPrint();

	}

}
