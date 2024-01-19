package com.mms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_movie")
public class Movie {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "genres")
	private String genres;

	@Column(name = "language")
	private String language;

	@Column(name = "duration")
	private String duration;

	public Movie() {
		super();
	}

	public Movie(int id, String name, String genres, String language, String duration) {
		super();
		this.id = id;
		this.name = name;
		this.genres = genres;
		this.language = language;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", genres=" + genres + ", language=" + language + ", duration="
				+ duration + "]";
	}


}
