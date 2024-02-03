package jsonPathWithJava;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

import com.jayway.jsonpath.JsonPath;

public class InLinePredicatesExample {
	
	
	public void InlinePredicates() throws IOException
	{
		File Jsonfile = new File("src/test/resources/Sample.json");
		
		/*
		 * List<Objects> Phnum =
		 * JsonPath.parse(Jsonfile).read("$.phoneNumbers[?(@.type)]");
		 * 
		 * for (Object number : Phnum) { System.out.println(number); }
		 */
		
		//&& and || 
		
		//AND
		List<Objects> name = JsonPath.parse(Jsonfile).read("$.topping[?(@.id==5001 && @.type==\"Choci\")].name");
		for (Object Name : name) 
		{ 
			System.out.println(Name); // OP: meenu
		}
		
		//OR
		List<Objects> name1 = JsonPath.parse(Jsonfile).read("$.topping[?(@.id == 5002 || @.type==\"dummy\")].name");
		for (Object Name : name1) 
		{ 
			System.out.println(Name); //OP : meenu
		}
		
		//NOT
		List<Objects> name2 = JsonPath.parse(Jsonfile).read("$.topping[?(!(@.id<5002 || @.type==\"Choci\"))].name");
		for (Object Name : name2) 
		{ 
			System.out.println(Name); //OP : sri, ram, hema, jashu, mahesh, ajay
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InLinePredicatesExample predicates = new InLinePredicatesExample();
		
		predicates.InlinePredicates();

	}

}
