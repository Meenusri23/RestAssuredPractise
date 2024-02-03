package complexJsonDeserialization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializer {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		// TODO Auto-generated method stub
		
		SuperHeroMoviesAndSeries moviesAndSeries = new SuperHeroMoviesAndSeries();
		
		//Category
		moviesAndSeries.setCategory("Super Hero Movies & Tv Series");
		
		//AcceptedFranchise
		List<String> AccFranchise = new ArrayList<String>();
		AccFranchise.add("DC");
		AccFranchise.add("Marvel");
		
		moviesAndSeries.setAcceptedFranchises(AccFranchise);
		
		//Genres
		List<String> Genres = new ArrayList<String>();
		Genres.add("Action");
		Genres.add("Adventure");
		Genres.add("Heroic");
		Genres.add("Dark");
		Genres.add("Funny");
		
		moviesAndSeries.setGenres(Genres);
		
		//Movies
		List<Movies> AllMovies = new ArrayList<Movies>();
		//1.Batman
		Movies batman = new Movies();
		batman.setTitle("Batman: The Dark Knight");
		batman.setYear(2008);
		List<String> BatmanCast = new ArrayList<String>();
		BatmanCast.add("Christian Bale");
		BatmanCast.add("Health Ledger");
		batman.setCast(BatmanCast);
		AllMovies.add(batman);
		
		//2.JusticeLeague
		Movies Jl = new Movies();
		Jl.setTitle("Justice League: Synder Cut");
		Jl.setYear(2012);
		List<String> JlCast = new ArrayList<String>();
		JlCast.add("Henry Cavil");
		JlCast.add("Gal Gadot");
		Jl.setCast(JlCast);
		AllMovies.add(Jl);
		
		//3. AvengersUltron
		Movies Avengers = new Movies();
		Avengers.setTitle("Avengers: Age of Ultron");
		Avengers.setYear(2015);
		List<String> AvengersCast = new ArrayList<String>();
		AvengersCast.add("Robert Dowry");
		AvengersCast.add("Chrish Evans");
		Avengers.setCast(AvengersCast);
		AllMovies.add(Avengers);
		
		
		//4.Avengers
		Movies Avenger = new Movies();
		Avenger.setTitle("Avengers: The Avengers");
		Avenger.setYear(2012);
		List<String> AvengerCast = new ArrayList<String>();
		AvengerCast.add("Chrish HemsWorth");
		AvengerCast.add("Chrish Evans");
		Avenger.setCast(AvengerCast);
		AllMovies.add(Avenger);
		moviesAndSeries.setMovies(AllMovies);
		
		//TVSeries
		List<TvSeries> AllTvseries = new ArrayList<TvSeries>();
		
		//TvSeries 1
		TvSeries Flash = new TvSeries();
		Flash.setTitle("Flash");
		Flash.setYear(2014);
		AllTvseries.add(Flash);
		
		//TvSeries 2
		TvSeries gotham = new TvSeries();
		gotham.setTitle("Gotham");
		gotham.setYear(2008);
		AllTvseries.add(gotham);
		
		//TvSeries 3
		TvSeries supergirl = new TvSeries();
		supergirl.setTitle("Super Girl");
		supergirl.setYear(2015);
		AllTvseries.add(supergirl);
		
		moviesAndSeries.setTvSeries(AllTvseries);
		
		//OtherDetails
		OtherDetails OD = new OtherDetails();
		OD.setCountry("India");
		OD.setLanguage("English & Tamil");
		moviesAndSeries.setOtherDetails(OD);
		
		ObjectMapper mapper = new ObjectMapper();
		
		File Json = new File("Complexjson.json");
		
		//moviesAndSeries - this complete object will be written to Complexjson file
		mapper.writerWithDefaultPrettyPrinter().writeValue(Json, moviesAndSeries);
		
	}

}
