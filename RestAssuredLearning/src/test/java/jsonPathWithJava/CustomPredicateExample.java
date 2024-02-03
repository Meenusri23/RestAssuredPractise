package jsonPathWithJava;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Predicate;

public class CustomPredicateExample {
	
	File Jsonfile = new File("src/test/resources/Sample.json");
	
	public void myCustomPredicate() throws IOException {
		/*
		Predicate SugarToppings = new Predicate() {

			@Override
			public boolean apply(PredicateContext ctx) {
				// TODO Auto-generated method stub
				boolean predicate = ctx.item(Map.class).containsValue("Sugar");
				return predicate;
			}
			
		};*/
		
		//To simply above code we have lamba expression
		Predicate SugarToppings = ctx->ctx.item(Map.class).containsValue("Sugar");
		
		List<Map<String,Object>> result = JsonPath.parse(Jsonfile).read("$.topping[?]",List.class,SugarToppings);
		
		System.out.println(result);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		CustomPredicateExample ex = new CustomPredicateExample();
		
		ex.myCustomPredicate();

	}

}
