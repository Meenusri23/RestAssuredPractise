package ComplexjsondeserializationUsingLombok;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movies {
	
private String Title;
	
	private int Year;
	
	private List<String> Cast;

}
