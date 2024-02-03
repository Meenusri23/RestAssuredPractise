package ems.jacksonSerializeAnnotation;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class CustomSerializer extends StdSerializer<JsonSerializePOJO> {

	public CustomSerializer(Class<JsonSerializePOJO> t) {
		super(t);
		// TODO Auto-generated constructor stub
	}
	
	public CustomSerializer(){
		this(null);
	}

	@Override
	public void serialize(JsonSerializePOJO value, JsonGenerator generator, SerializerProvider provider) throws IOException {
		
		generator.writeStartObject();
		generator.writeStringField("first_name", value.getFirstName());
		generator.writeStringField("last_name", value.getLastName());
		generator.writeStringField("Email", value.getEmail());
		generator.writeEndObject();
		
	}
	

}
