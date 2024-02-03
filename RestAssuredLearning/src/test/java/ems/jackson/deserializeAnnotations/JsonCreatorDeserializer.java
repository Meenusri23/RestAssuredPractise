package ems.jackson.deserializeAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonCreatorDeserializer {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		String Json = "{\r\n"
				+ "    \"employeeid\" : \"1001\",\r\n"
				+ "    \"name\" : \"SRI\",\r\n"
				+ "    \"email\" : \"meenu.sri@yahoo.com\"\r\n"
				+ "  }\r\n"
				+ "}";
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonCreatorDeserializePOJO pojo = mapper.readValue(Json, JsonCreatorDeserializePOJO.class);
		System.out.println(pojo.getId());
		System.out.println(pojo.getName());
		System.out.println(pojo.getEmail());
	}

}
