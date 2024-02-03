package ems.Authorization;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ApiKeyAuthExample {
	
	//https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
	
	@Test (enabled = false)
	public void ApiKeyAuth() {
		RestAssured.given()
		.baseUri("https://api.openweathermap.org/").when().get("data/2.5/weather?q=Chennai&appid=a59ca184e256e4f34b8aa95a5694336f").prettyPrint();
		
	}
	
	@Test(enabled = false)
	public void ApiKeyUsingParams() {
		
		RestAssured.given().queryParam("q", "dindigul").queryParam("appid", "a59ca184e256e4f34b8aa95a5694336f")
		.baseUri("https://api.openweathermap.org/").when().get("data/2.5/weather").prettyPrint();
		
	}
	
	@Test
	public void ApiKeyUsingHeader() {
		
		RestAssured.given().queryParam	("q", "dindigul").header("appid", "a59ca184e256e4f34b8aa95a5694336f")
		.baseUri("https://api.openweathermap.org/").when().get("data/2.5/weather").prettyPrint();
		
	}

}
