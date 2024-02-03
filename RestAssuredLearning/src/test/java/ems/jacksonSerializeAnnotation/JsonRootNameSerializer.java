package ems.jacksonSerializeAnnotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonRootNameSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		JsonRootNamePOJO rootNamePOJO = new JsonRootNamePOJO();
		
		rootNamePOJO.setFirstName("Meenu");
		rootNamePOJO.setLastName("SRI");
		rootNamePOJO.setEmail("meenu.sri@yahoo.com");
		
		ObjectMapper mapper = new ObjectMapper();
		//to wrap the contets inside root dictionary annotation and serialization feature to be added
		mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
		String Json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNamePOJO);
		System.out.println(Json);
	}

}
