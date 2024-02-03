package ems.jackson.deserializeAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnySetterDeserialize {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String Json = "{\r\n"
				+ "  \"Employees\" : {\r\n"
				+ "    \"firstName\" : \"Meenu\",\r\n"
				+ "    \"lastName\" : \"SRI\",\r\n"
				+ "    \"email\" : \"meenu.sri@yahoo.com\"\r\n"
				+ "  }\r\n"
				+ "}";
		
		ObjectMapper mapper = new ObjectMapper();
		JsonAnySetterPOJO pojo =  mapper.readValue(Json, JsonAnySetterPOJO.class);
		System.out.println(pojo.getEmployee());

	}

}
