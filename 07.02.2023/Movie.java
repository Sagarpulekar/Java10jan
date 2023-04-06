package com.movies;

public class Movie {
	
	private int movieId;
	private String movieName;
	private String releaseDate;
	
	public Movie()
	{
		
	}
	
		
	public Movie(int movieId, String movieName)
	{
		this.movieId=movieId;
		this.movieName=movieName;
		
	}
	
	public Movie(int movieId, String movieName, String releaseDate)
	{
		this(movieId,movieName);
		this.releaseDate=releaseDate;
	}


	public int getMovieId() {
		return movieId;
	}


	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public String getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public String toString()
	{
		return "Movie:"+ movieName+"  "+releaseDate;
	}

}
