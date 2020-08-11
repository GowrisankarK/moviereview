package com.codaglobal.moviereview.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "reviewdetails")
public class MovieReviewDetailsModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="movie_id", nullable=false)
	private Long movieId;
	@Column(name="movie_review")
	private String movieReview;
	@Column(name="user_name")
	private String userName;
	
	public Long getId() {
		return id;
	}
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public String getMovieReview() {
		return movieReview;
	}
	public void setMovieReview(String movieReview) {
		this.movieReview = movieReview;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MovieReviewDetailsModel [id=");
		builder.append(id);
		builder.append(", movieId=");
		builder.append(movieId);
		builder.append(", movieReview=");
		builder.append(movieReview);
		builder.append(", userName=");
		builder.append(userName);
		builder.append("]");
		return builder.toString();
	}
	
}
