package ems.jacksonSerializeAnnotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertyOrderSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		JsonPropertyOrderPOJO propertyOrderPOJO = new JsonPropertyOrderPOJO();
		
		propertyOrderPOJO.setId(1001);
		propertyOrderPOJO.setName("Riya");
		propertyOrderPOJO.setEmail("riya@yahoo.com");
		
		ObjectMapper mapper = new ObjectMapper();
		String Json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(propertyOrderPOJO);
		System.out.println(Json);

	}

}
