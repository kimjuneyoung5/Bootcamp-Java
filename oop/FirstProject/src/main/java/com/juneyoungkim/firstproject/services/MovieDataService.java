package com.juneyoungkim.firstproject.services;

import org.apache.http.client.HttpClient;

public class MovieDataService {
	
	private static String MOVIE_DATA_URL = "https://movie-database-imdb-alternative.p.rapidapi.com/";
	
	public void fetchMovieData() {
		HttpClient client = HttpClient.newHttpClient();
	}
}
