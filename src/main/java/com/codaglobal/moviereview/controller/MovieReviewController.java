package com.codaglobal.moviereview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codaglobal.moviereview.model.MovieDetailsModel;
import com.codaglobal.moviereview.model.MovieReviewDetailsModel;
import com.codaglobal.moviereview.service.MovieDetailsService;
import com.codaglobal.moviereview.service.MovieReviewDetailsService;

@RestController
@RequestMapping("/api/moviewreview/v1")
public class MovieReviewController {

	
	@Autowired
	MovieDetailsService movieDetailsService;
	
	
	@Autowired
	MovieReviewDetailsService movieReviewDetailsService;
	
	/**
	 * createMovie is used to create a new movie.
	 * 
	 * @param MovieDetailsModel
	 * @return MovieDetailsModel
	 */
	@PostMapping("/insert/movie")
    public MovieDetailsModel createMovie(@RequestBody MovieDetailsModel movieDetailsModel) {
        return movieDetailsService.addMovie(movieDetailsModel);
    }

	/**
	 * getAllMovieList is used to get all movie List details.
	 * @return List<MovieDetailsModel>
	 */
	@GetMapping("/getAllMovieList")
	public List<MovieDetailsModel> getAllMovieList() {
        return movieDetailsService.getAllMovieList();
    }
	
	/**
	 * addMovieReview is used to add a movie review to particular movie.
	 * 
	 * @param movieReviewDetailsModel
	 * @return MovieReviewDetailsModel
	 */
	@PostMapping("/insert/moviereview")
    public MovieReviewDetailsModel addMovieReview(@RequestBody MovieReviewDetailsModel movieReviewDetailsModel) {
        return movieReviewDetailsService.addMovieReview(movieReviewDetailsModel);
    }
	
	
	/**
	 * getMovieReviewDetails is used to get all movie review details for the particular movie.
	 * 
	 * @param id
	 * @return List<MovieReviewDetailsModel>
	 * @throws Exception
	 */
	@GetMapping("/movies/{id}")
    public List<MovieReviewDetailsModel> getMovieReviewDetails(@PathVariable(value = "id") Long id) {
		List<MovieReviewDetailsModel> movieReviewDetailsModelList = movieReviewDetailsService.getMovieReviewsByMovieId(id);
        return movieReviewDetailsModelList;
    }
}
