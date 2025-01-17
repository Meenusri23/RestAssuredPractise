package ems.jacksonSerializeAnnotation;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "Employees")
public class JsonRootNamePOJO {
	
	private String FirstName;
	private String LastName;
	private String Email;
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
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

}
