package ems.Authorization;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BearerTokenAuthExample {
	@Test
	public void BearerTokenAuth() {
		//https://api.github.com/users/repos
		String Token = "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";
		RestAssured.given().header("Authorization", "Bearer" +Token)
		.baseUri("https://api.github.com/").when().get("users/Meenusri23/repos").prettyPrint();
		
	}

}
