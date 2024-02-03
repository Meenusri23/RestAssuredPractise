package jsonPathWithJava;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

public class FilterPredicateExample {
	
	public static void FilterAPIPredicate() throws IOException
	{
		File Jsonfile = new File("src/test/resources/Sample.json");
		
		Filter IDequals5001 = Filter.filter(Criteria.where("id").is(5001));
		
		List<Objects> name = JsonPath.parse(Jsonfile).read("$.topping[?]",IDequals5001 );
		
		System.out.println(name);
		
	}
	
	public static void SecondFilter() throws IOException {
		
		File Jsonfile = new File("src/test/resources/Sample.json");
		
		Filter IDandTypeEquals = Filter.filter(Criteria.where("id").eq(5002).and("type").is("Glazed"));
		
		List<Map<String,Object>> Criteria2 = JsonPath.parse(Jsonfile).read("$.topping[?]",IDandTypeEquals);
		
		//System.out.println(Criteria2);
		//MAP is used to get value from any key
		System.out.println(Criteria2.get(0).get("type"));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//FilterAPIPredicate();
		SecondFilter();

	}

}
