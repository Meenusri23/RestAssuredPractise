package ems.jackson.deserializeAnnotations;

import com.fasterxml.jackson.annotation.JsonSetter;

public class JsonSetterPOJO {

	private int id;
	
	private String Name;
	
	private String Email;

	public int getId() {
		return id;
	}

	@JsonSetter(value = "emp_id")
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	
}
