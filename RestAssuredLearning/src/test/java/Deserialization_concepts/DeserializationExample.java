package Deserialization_concepts;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;
import com.jayway.jsonpath.spi.mapper.JsonOrgMappingProvider;

import ems.pojo.Employees;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;


public class DeserializationExample {

	String Json = "{\r\n"
			+ "\"last_name\": \"Ravthar\",\r\n"
			+ "\"first_name\": \"mohammed\",\r\n"
			+ "\"email\": \"lolitaravi@gmail.com\",\r\n"
			+ "\"skills\": [\r\n"
			+ "	           \"Selenium\",\r\n"
			+ "	           \"Java\",\r\n"
			+ "	           \"TestNG FrameWork\",\r\n"
			+ "	           \"PostMan, RestAssured\"\r\n"
			+ "	       ]\r\n"
			+ "}";

	public void UsingObjectMapper() throws JsonMappingException, JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();

		Employees employees = mapper.readValue(Json, Employees.class);

		System.out.println(employees.getFirst_name());
		System.out.println(employees.getLast_name());
		System.out.println(employees.getEmail());
		System.out.println(employees.getSkills());

	}

	public void UsingJaywayJsonPath() {

		JacksonMappingProvider mappingProvider = new JacksonMappingProvider();
		
		Configuration Config = Configuration.builder().mappingProvider(mappingProvider).build();
		
		Employees employee = JsonPath.using(Config).parse(Json).read("$", Employees.class);
		
		System.out.println(employee.getFirst_name());
		System.out.println(employee.getLast_name());
		System.out.println(employee.getEmail());
		System.out.println(employee.getSkills());
	}
	
	
	public void UsingRestAssuredJsonPath() {
		io.restassured.path.json.JsonPath jsonpath = io.restassured.path.json.JsonPath.from(Json);
		
		Employees employee = jsonpath.getObject("$", Employees.class);
		
		System.out.println(employee.getFirst_name());
		System.out.println(employee.getLast_name());
		System.out.println(employee.getEmail());
		System.out.println(employee.getSkills());
		
	}
	
	public void UsingASFunction() {
		
		Map<String, Object> Result  = RestAssured.given().baseUri("http://localhost:3000/").body(Json).when().get("employees/e685").then()
		.extract().as(new TypeRef<Map<String,Object>>(){});	
		
		System.out.println(Result);
		System.out.println(Result.get("first_name"));
		System.out.println(Result.get("last_name"));
		System.out.println(Result.get("email"));
		System.out.println(Result.get("skills"));
	}

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub

		DeserializationExample deserialize = new DeserializationExample();

		//deserialize.UsingObjectMapper();
		//deserialize.UsingJaywayJsonPath();
		//deserialize.UsingRestAssuredJsonPath();
		deserialize.UsingASFunction();

	}

}



