package jackson_DataBind_Serialization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class Serialization {

	@Test
	public void serializationConcept() {

		Map<String, Object> jsonBody = new HashMap<String, Object>();

		List<String> Skills = new ArrayList<String>();

		Skills.add("Selenium");

		Skills.add("Java");

		Skills.add("TestNG FrameWork");

		Skills.add("PostMan, RestAssured");

		jsonBody.put("first_name", "Lolita");

		jsonBody.put("last_name", "Ravi");

		jsonBody.put("email", "lolitaravi@gmail.com");

		jsonBody.put("skills", Skills);
		
		System.out.println(jsonBody);
		
		given().baseUri("http://localhost:3000/").body(jsonBody).log().all().when().post("employees").then().log().all();



	}
}
