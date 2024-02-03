package ems.jacksonSerializeAnnotation;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class JsonRawValuePOJO {
	
	private String FirstName;
	
	private String LastName;
	
	private String email;
	
	@JsonRawValue
	private String Skills = "REST ASSURED";

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkills() {
		return Skills;
	}

	public void setSkills(String skills) {
		Skills = skills;
	}
	
	

}
