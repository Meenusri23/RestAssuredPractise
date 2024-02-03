package ems.jacksonSerializeAnnotation;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// for a single field - @JsonIgnoreProperties (value = "age")
@JsonIgnoreProperties ({"age", "email"})
public class JsonIgnorePOJO {
	
	private int id;
	private String name;
	private String email;
	private Date DateofBirth;
	//@JsonIgnore
	private int age;
	
	
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
	public Date getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public int getAge() {
		return age;
	}
	
	
	

}
