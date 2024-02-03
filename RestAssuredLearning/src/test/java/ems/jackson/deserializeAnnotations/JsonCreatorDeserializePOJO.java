package ems.jackson.deserializeAnnotations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonCreatorDeserializePOJO {

	private int id;
	
	private String Name;
	
	private String Email;
	
	//If there's no setters and we are using constructors for setting value
	@JsonCreator
	public JsonCreatorDeserializePOJO(@JsonProperty("employeeid")int id, @JsonProperty("name")String Name, @JsonProperty("email")String Email){
		
		this.id= id;
		
		this.Name = Name;
		
		this.Email = Email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return Name;
	}

		public String getEmail() {
		return Email;
	}

	
	
	

}
