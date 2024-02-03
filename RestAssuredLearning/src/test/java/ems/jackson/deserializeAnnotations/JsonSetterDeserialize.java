package ems.jackson.deserializeAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSetterDeserialize {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String Json = "{\r\n"
				+ "    \"emp_id\" : \"1001\",\r\n"
				+ "    \"name\" : \"SRI\",\r\n"
				+ "    \"email\" : \"meenu.sri@yahoo.com\"\r\n"
				+ "  }\r\n"
				+ "}";
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonSetterPOJO pojo = mapper.readValue(Json, JsonSetterPOJO.class);
		System.out.println(pojo.getId());

	}

}
