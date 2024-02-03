package ems.jacksonSerializeAnnotation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnyGetterSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		JsonAnyGetterPOJO anyGetterPOJO = new JsonAnyGetterPOJO();
		
		Map<String, Object> mapvalues = new HashMap<String, Object>();
		
		mapvalues.put("FirstName", "Meenu");
		mapvalues.put("LastName", "Sri");
		mapvalues.put("Email", "Meenu@gmail.com");
		mapvalues.put("Skills", Arrays.asList("Java","selenium"));
		
		//setting values to the class
		anyGetterPOJO.setEmployeeProperties(mapvalues);
		
		ObjectMapper mapper = new ObjectMapper();
		
		String Json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(anyGetterPOJO);
		System.out.println(Json);
		

	}

}
