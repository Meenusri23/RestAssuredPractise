package ems.InterviewConcepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CompareTwoJson {
	
	//order doesnt matter for outer elements whereas in Array its considered
	
	static String Json = "{\r\n"
			+ "    		\"first_name\": \"Jeeva\",\r\n"
			+ "    		\"last_name\": \"P\",\r\n"
			+ "    		\"hobby\": \"Gamer\"\r\n"
			+ "	}";
	
	static String Json2 = "{\r\n"
			+ "    		\"last_name\": \"P\",\r\n"
			+ "    		\"first_name\": \"Jeeva\",\r\n"	
			+ "    		\"hobby\": \"Gamer\"\r\n"
			+ "	}";

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node1 = mapper.readTree(Json);
		JsonNode node2 = mapper.readTree(Json2);
		System.out.println(node1.equals(node2));
		
		

	}

}
