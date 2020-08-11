package com.codaglobal.moviereview.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "moviedetails")
public class MovieDetailsModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="movie_name", nullable=false)
	private String movieName;
	@Column(name="movie_synopsis")
	private String movieSynopsis;
	@Column(name="user_name")
	private String userName;
	
	public Long getId() {
		return id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieSynopsis() {
		return movieSynopsis;
	}
	public void setMovieSynopsis(String movieSynopsis) {
		this.movieSynopsis = movieSynopsis;
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
		builder.append("MovieDetailsModel [id=");
		builder.append(id);
		builder.append(", movieName=");
		builder.append(movieName);
		builder.append(", movieSynopsis=");
		builder.append(movieSynopsis);
		builder.append(", userName=");
		builder.append(userName);
		builder.append("]");
		return builder.toString();
	}
	
	
}
