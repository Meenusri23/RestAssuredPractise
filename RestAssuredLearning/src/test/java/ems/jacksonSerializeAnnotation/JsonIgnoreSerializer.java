package ems.jacksonSerializeAnnotation;

import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIgnoreSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		JsonIgnorePOJO ignorePOJO = new JsonIgnorePOJO();
		
		ignorePOJO.setId(1008);
		ignorePOJO.setName("Hemasri");
		ignorePOJO.setEmail("hema@gmail.com");
		Date date = new Date();
		ignorePOJO.setDateofBirth(date);
		
		String Json = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(ignorePOJO);
		System.out.println(Json);
	}

}
