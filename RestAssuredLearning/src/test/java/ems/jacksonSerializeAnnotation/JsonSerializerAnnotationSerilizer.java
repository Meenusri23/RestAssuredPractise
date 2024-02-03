package ems.jacksonSerializeAnnotation;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class JsonSerializerAnnotationSerilizer {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		JsonSerializePOJO serializePOJO = new JsonSerializePOJO();
		
		serializePOJO.setFirstName("Meenu");
		serializePOJO.setLastName("SRI");
		serializePOJO.setEmail("meenu.sri@yahoo.com");
		serializePOJO.setSkills(Arrays.asList("Java", "Selenium", "Cucumber"));
		Devices devices = new Devices();
		devices.setLaptop("HP");
		devices.setMobile("LAVA");
		serializePOJO.setDevices(devices);
		
		ObjectMapper mapper = new ObjectMapper();
		
		/*
		 * SimpleModule simpleModule = new SimpleModule();
		 * simpleModule.addSerializer(JsonSerializePOJO.class,new CustomSerializer());
		 * mapper.registerModule(simpleModule);
		 */
		
		String Json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(serializePOJO);
		System.out.println(Json);

	}

}
