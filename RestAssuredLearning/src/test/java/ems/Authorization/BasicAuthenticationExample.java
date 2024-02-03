package ems.Authorization;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BasicAuthenticationExample {
	
	@Test
	public void BasicAuth() {
		RestAssured.given().auth().basic("postman", "password")
		.baseUri("https://postman-echo.com/").when().get("basic-auth").prettyPrint();
}

}
