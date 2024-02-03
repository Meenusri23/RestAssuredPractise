package complexJsonDeserialization;

import java.util.List;

public class Movies {
	
	private String Title;
	
	private int Year;
	
	private List<String> Cast;
	
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public List<String> getCast() {
		return Cast;
	}

	public void setCast(List<String> cast) {
		Cast = cast;
	}

	
}
