package ComplexjsondeserializationUsingLombok;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuperHeroMoviesAndSeries {
	
	private String Category;
	
	private List<String> acceptedFranchises;
	
	private List<String> Genres;
	
	private List<Movies> Movies;
	
	private List<TvSeries> TvSeries;
	
	private List<OtherDetails> OtherDetails;

}
