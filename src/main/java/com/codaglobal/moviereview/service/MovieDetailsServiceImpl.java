package com.codaglobal.moviereview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codaglobal.moviereview.model.MovieDetailsModel;
import com.codaglobal.moviereview.repository.MovieDetailsRepository;

@Service
public class MovieDetailsServiceImpl implements MovieDetailsService {

	@Autowired
	MovieDetailsRepository movieDetailsRepository;
	
	@Override
	public MovieDetailsModel addMovie(MovieDetailsModel movieDetailsModel) {
		return movieDetailsRepository.save(movieDetailsModel);
	}

	@Override
	public List<MovieDetailsModel> getAllMovieList() {
		return movieDetailsRepository.findAll();
	}

}
