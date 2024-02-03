package ems.bdd_style;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.io.File;

public class EmployeeManagementSystemBDD {

	@Test (enabled = false)
	public void getEmployeesBdd() {

		//RestAssured. (if import is no given as static)
		given().baseUri("http://localhost:3000/").when().get("employees").prettyPrint();

	}

	@Test (enabled = false)
	public void CreateEmployeeBDD()
	{
		given().baseUri("http://localhost:3000/").body("{\r\n"
				+ "    \"first_name\": \"Modi\",\r\n"
				+ "    \"last_name\": \"Ji\",\r\n"
				+ "    \"hobby\": \"GOAT\"\r\n"
				+ "}")
		.when().post("employees").prettyPrint();
	}
	@Test (enabled = false)
	public void UpdateEmployee() {

		given().baseUri("http://localhost:3000/").body("{\r\n"
				+ "    \"first_name\": \"Modi\",\r\n"
				+ "    \"last_name\": \"Ji\",\r\n"
				+ "    \"hobby\": \"Greatest Of All Time\"\r\n"
				+ "}")
		.when().put("employees/8250").prettyPrint();

	}

	@Test (enabled = false)
	public void DeleteEmployee() {
		given().baseUri("http://localhost:3000/").when().delete("employees/cc3a").prettyPrint();

	}
	
	@Test(enabled = true)
	public void CreateEmployeeFromJson() {
		
		File JsonFile = new File("sample.json");
		
		given().baseUri("http://localhost:3000/").body(JsonFile).when().post("employees").prettyPrint();
		
	}

}
