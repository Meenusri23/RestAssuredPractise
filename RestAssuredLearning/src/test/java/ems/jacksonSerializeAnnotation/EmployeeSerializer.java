package ems.jacksonSerializeAnnotation;

import java.util.ArrayList;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class EmployeeSerializer {
	
	public static void main(String[] args) throws JsonProcessingException {
		
		Employee ser_employee = new Employee();
		
		//Constructing JSON file to do serialization process
		ser_employee.setFirst_name("Narendra");

		ser_employee.setLast_name("Modi");

		ser_employee.setEmail("narendramodi@gmail.com");
		
		List<String> skills = new ArrayList<String>();
		skills.add("Ruler");
		skills.add("Achiever");
		skills.add("Brainy");

		ser_employee.setSkills(skills);
		//ser_employee.setSkills(Arrays.asList("Ruler","Achiever","Brainy"));
		
		ObjectMapper mapper = new ObjectMapper();

		String employeeJson;

		//POJO to JSON (Writevalue function)

		employeeJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(ser_employee);

		System.out.println(employeeJson);
	}

}
