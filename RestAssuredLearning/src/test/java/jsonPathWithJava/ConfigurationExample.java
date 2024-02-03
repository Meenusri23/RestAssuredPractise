package jsonPathWithJava;

import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

public class ConfigurationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Json = "[\r\n"
				+ "			{ \"name\":\"meenu\",\"id\": \"5001\"},\r\n"
				+ "			{ \"name\":\"sri\"}\r\n"
				+ "		]";
		
		Configuration Config = Configuration.defaultConfiguration();

		//if unable to find the key we are searching then instead of exception null will be thrown
		//Config = Config.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
		
		//To add option directly without using Default configuration like above
		//Configuration Config= Configuration.builder().options(Option.DEFAULT_PATH_LEAF_TO_NULL).build();
		
		//Config = Config.addOptions(Option.ALWAYS_RETURN_LIST);
		
		//To suppress exceptions and return null
		//Config = Config.addOptions(Option.SUPPRESS_EXCEPTIONS);
		
		//To validate whether all Keys are available which we will be doing in schema validation 
		Config = Config.addOptions(Option.REQUIRE_PROPERTIES);
		
		List<String> id = JsonPath.using(Config).parse(Json).read("$.[*].id");
		System.out.println(id);

	}

}
