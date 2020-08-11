package com.codaglobal.moviereview.service;

import java.util.List;

import com.codaglobal.moviereview.model.MovieReviewDetailsModel;

public interface MovieReviewDetailsService {

	List<MovieReviewDetailsModel> getMovieReviewsByMovieId(Long movieId);
	
	MovieReviewDetailsModel addMovieReview(MovieReviewDetailsModel movieReviewDetailsModel);
}
