package ems.pojo;

import java.util.List;

public class Employees {

	private String first_name;
	
	private String last_name;

	private String email;

	private List Skills;

	public String getFirst_name() {
		System.out.println("Getter" +first_name);
		return first_name;
	}

	public void setFirst_name(String first_name) {
		System.out.println("Setter" +first_name);
		this.first_name = first_name;
	}

	public String getLast_name() {
		System.out.println("Getter" +last_name);
		return last_name;
	}

	public void setLast_name(String last_name) {
		System.out.println("Setter" +last_name);
		this.last_name = last_name;
	}

	public String getEmail() {
		System.out.println("Getter" +email);
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Setter" +email);
		this.email = email;
	}

	public List getSkills() {
		System.out.println("Getter" +Skills);
		return Skills;
	}

	public void setSkills(List skills) {
		System.out.println("Setter" +skills);
		Skills = skills;
	}

}