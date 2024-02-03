package ems.jacksonSerializeAnnotation;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.fasterxml.jackson.annotation.JsonGetter;

public class JsonGetterPOJO {
	
	private int id;
	
	private String name;
	
	private String email;

	@JsonGetter(value = "EmployeeID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
