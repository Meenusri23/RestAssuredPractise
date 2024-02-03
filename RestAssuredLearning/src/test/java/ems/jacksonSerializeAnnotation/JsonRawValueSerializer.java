package ems.jacksonSerializeAnnotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRawValueSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		JsonRawValuePOJO rawValuePOJO = new JsonRawValuePOJO();
		
		rawValuePOJO.setFirstName("Meenu");
		rawValuePOJO.setLastName("SRI");
		rawValuePOJO.setEmail("meenu.sri@yahoo.com");
		
		
		ObjectMapper mapper = new ObjectMapper();
		String Json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rawValuePOJO);
		System.out.println(Json);

	}

}
