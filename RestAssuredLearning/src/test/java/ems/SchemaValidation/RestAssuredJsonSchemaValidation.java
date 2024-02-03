package ems.SchemaValidation;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class RestAssuredJsonSchemaValidation {

	@Test(enabled = false)
	public void ValidationUsingJsonSchemaInClassPath() {

		File inputJson = new File("src/test/resources/input.json");


		RestAssured.given().baseUri("http://localhost:3000/").body(inputJson).when().post("/employees")
		.then().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
	}
	
	@Test
	public void ValidationUsingMatchesJsonSchema() {
		
		
		File inputJson = new File("src/test/resources/input.json");
		
		File schemaJson = new File("D:\\schema.json\\");
		
		RestAssured.given().baseUri("http://localhost:3000/").body(inputJson).when().post("/employees")
		.then().body(JsonSchemaValidator.matchesJsonSchema(schemaJson));
	}

}
