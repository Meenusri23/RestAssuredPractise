package ems.jackson.deserializeAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAliasDeserializer {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		String Json = "{\r\n"
				+ "    \"EmployeeID\" : \"1005\",\r\n"
				+ "    \"name\" : \"SRI\",\r\n"
				+ "    \"email\" : \"meenu.sri@yahoo.com\"\r\n"
				+ "  }\r\n"
				+ "}";
		/*
		ObjectMapper mapper = new ObjectMapper();
		JsonAliasPOJO pojo = mapper.readValue(Json, JsonAliasPOJO.class);*/
		
		//Method chaining for above lines
		JsonAliasPOJO pojo = new ObjectMapper().readerFor(JsonAliasPOJO.class).readValue(Json);
		
		System.out.println(pojo.getId());

	}

}
