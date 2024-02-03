package ems.jacksonSerializeAnnotation;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class JsonAnyGetterPOJO {

	private Map<String, Object> employeeProperties;

	@JsonAnyGetter
	public Map<String, Object> getEmployeeProperties() {
		return employeeProperties;
	}

	public void setEmployeeProperties(Map<String, Object> employeeProperties) {
		this.employeeProperties = employeeProperties;
	}
	
}
