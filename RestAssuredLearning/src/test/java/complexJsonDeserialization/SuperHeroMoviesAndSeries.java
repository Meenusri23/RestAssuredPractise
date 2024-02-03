package complexJsonDeserialization;

import java.util.List;

public class SuperHeroMoviesAndSeries {
	
	private String Category;
	
	private List<String> acceptedFranchises;
	
	private List<String> Genres;
	
	private List<Movies> Movies;
	
	private List<TvSeries> TvSeries;
	
	private OtherDetails OtherDetails;

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public List<String> getAcceptedFranchises() {
		return acceptedFranchises;
	}

	public void setAcceptedFranchises(List<String> acceptedFranchises) {
		this.acceptedFranchises = acceptedFranchises;
	}

	public List<Movies> getMovies() {
		return Movies;
	}

	public void setMovies(List<Movies> movies) {
		Movies = movies;
	}

	public List<TvSeries> getTvSeries() {
		return TvSeries;
	}

	public void setTvSeries(List<TvSeries> tvSeries) {
		TvSeries = tvSeries;
	}

	public OtherDetails getOtherDetails() {
		return OtherDetails;
	}

	public void setOtherDetails(OtherDetails otherDetails) {
		OtherDetails = otherDetails;
	}
	
	public List<String> getGenres() {
		return Genres;
	}

	public void setGenres(List<String> genres) {
		Genres = genres;
	}
	

}
