package ems.Authorization;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class OAuth2Example {
	
	@Test
	public void OAuth2(){
		String Token = "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";
		RestAssured.given().auth().oauth2(Token)
		.baseUri("https://api.github.com/").when().get("users/Meenusri23/repos").prettyPrint();
		
	}

}
