package jsonPathWithJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class ReadingAJsonDocument {


	public static void ParsesALLTime() throws IOException
	{
		File Jsonfile = new File("src/test/resources/Information.json");

		List<Object> ph_num = JsonPath.read(Jsonfile, "$..phoneNumbers");

		for (Object number : ph_num) {
			System.out.println(number);
		}


	}

	
	public static void ParsesOneTime() throws IOException {
		
		InputStream Jsonfile = new FileInputStream("src/test/resources/Information.json");
		
		Object ParsedDocument = Configuration.defaultConfiguration().jsonProvider().parse(Jsonfile.readAllBytes());
		
		List<Object> ph_num = JsonPath.read(ParsedDocument, "$..phoneNumbers");
		
		for (Object number : ph_num) {
			System.out.println(number);
		}
		
	}
	
	public static void FluentAPI() throws IOException {
		
		File Jsonfile = new File("src/test/resources/Information.json");
		
		DocumentContext context = JsonPath.parse(Jsonfile);
		
		List<Object> ph_num = context.read("$..phoneNumbers");
		
		for (Object number : ph_num) {
			System.out.println(number);
		}
		
		
		//Best Practice to use in case of having different configurations
		 Configuration config = Configuration.defaultConfiguration();
		 
		 Map<String, String> map = new HashMap<String, String>();
		 
		 map = JsonPath.using(config).parse(Jsonfile).read("$.phoneNumbers[1]");
		 
		 System.out.println(map);
		 
		//definite path - we know what our JSON path is going to return
		 
		//indefinite path - we don't know what value does the JSON path returns
		 
		 //1. deep scan(..), 2.Using expressions [?()], 3.using index [0:3] this will be indefinite so using list type is suggested.
			
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//ParsesALLTime();
		//ParsesOneTime();
		FluentAPI();


	}

}
