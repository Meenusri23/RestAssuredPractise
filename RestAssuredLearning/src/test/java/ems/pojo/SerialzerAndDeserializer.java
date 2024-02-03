package ems.pojo;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerialzerAndDeserializer {

	ObjectMapper mapper = new ObjectMapper();

	String employeeJson;

	public void Serialize() throws JsonProcessingException{

		Employees employee1 = new Employees();


		//Constructing JSON file to do serialization process
		employee1.setFirst_name("Jai");

		employee1.setLast_name("shankar");

		employee1.setEmail("jaishankar@gmail.com");

		employee1.setSkills(Arrays.asList("java","selenium","groovy"));

		//POJO to JSON (Writevalue function)

		employeeJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee1);

		System.out.println(employeeJson);

	}

	public void Deserialize() throws JsonMappingException, JsonProcessingException {

		//Json to POJO (ReadValue Function): DECONSTRUCTING JSON to do Deserialization process
		String employeeJson = "{\r\n"
				+ "  \"first_name\" : \"Jai\",\r\n"
				+ "  \"last_name\" : \"shankar\",\r\n"
				+ "  \"email\" : \"jaishankar@gmail.com\",\r\n"
				+ "  \"skills\" : [ \"java\", \"selenium\", \"groovy\" ]\r\n"
				+ "}";
		
		Employees obj = mapper.readValue(employeeJson, Employees.class);

		System.out.println(obj.getFirst_name());

		System.out.println(obj.getLast_name());

		System.out.println(obj.getEmail());

		System.out.println(obj.getSkills());


	}


	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		SerialzerAndDeserializer serialzerAndDeserializer = new SerialzerAndDeserializer();
		serialzerAndDeserializer.Deserialize();


	}

}
