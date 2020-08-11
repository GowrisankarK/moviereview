package com.codaglobal.moviereview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codaglobal.moviereview.model.MovieReviewDetailsModel;
import com.codaglobal.moviereview.repository.MovieReviewDetailsRepository;

@Service
public class MovieReviewDetailsServiceImpl implements MovieReviewDetailsService{

	@Autowired
	MovieReviewDetailsRepository movieReviewDetailsRepository;

	@Override
	public List<MovieReviewDetailsModel> getMovieReviewsByMovieId(Long movieId) {
		return movieReviewDetailsRepository.findByMovieId(movieId);
	}

	@Override
	public MovieReviewDetailsModel addMovieReview(MovieReviewDetailsModel movieReviewDetailsModel) {
		return movieReviewDetailsRepository.save(movieReviewDetailsModel);
	}
	
	
}
