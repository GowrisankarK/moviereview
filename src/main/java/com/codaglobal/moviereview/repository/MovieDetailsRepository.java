package com.codaglobal.moviereview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codaglobal.moviereview.model.MovieDetailsModel;

@Repository
public interface MovieDetailsRepository extends JpaRepository<MovieDetailsModel,Long>{

}
