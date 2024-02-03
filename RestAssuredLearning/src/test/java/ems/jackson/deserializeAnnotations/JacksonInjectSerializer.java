package ems.jackson.deserializeAnnotations;

import java.io.IOException;

import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class JacksonInjectSerializer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String Json = "{\r\n"
				+ "    \"name\" : \"SRI\",\r\n"
				+ "    \"email\" : \"meenu.sri@yahoo.com\"\r\n"
				+ "  }\r\n"
				+ "}";
		InjectableValues injectableValues = new InjectableValues.Std().addValue(int.class, 1001);
		
		ObjectMapper mapper = new ObjectMapper();
		
		ObjectReader reader = mapper.reader(injectableValues);
		
		JacksonInjectPojo injectPojo = reader.readValue(Json, JacksonInjectPojo.class);
		
		System.out.println(injectPojo.getId());
		
		
	}

}
