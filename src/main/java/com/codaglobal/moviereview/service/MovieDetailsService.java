package com.codaglobal.moviereview.service;

import java.util.List;

import com.codaglobal.moviereview.model.MovieDetailsModel;

public interface MovieDetailsService {

	MovieDetailsModel addMovie(MovieDetailsModel movieDetailsModel);
	
	List<MovieDetailsModel> getAllMovieList();
}
