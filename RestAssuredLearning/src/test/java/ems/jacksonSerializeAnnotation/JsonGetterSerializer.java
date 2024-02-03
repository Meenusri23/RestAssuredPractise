package ems.jacksonSerializeAnnotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonGetterSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		JsonGetterPOJO getterPOJO = new JsonGetterPOJO();
		
		getterPOJO.setId(1001);
		getterPOJO.setName("Riya");
		getterPOJO.setEmail("riya@yahoo.com");
		
		ObjectMapper mapper = new ObjectMapper();
		String Json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getterPOJO);
		System.out.println(Json);
	}

}
