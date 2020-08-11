package com.codaglobal.moviereview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codaglobal.moviereview.model.MovieReviewDetailsModel;

@Repository
public interface MovieReviewDetailsRepository extends JpaRepository<MovieReviewDetailsModel,Long>{
	List<MovieReviewDetailsModel> findByMovieId(Long movieId);
}
