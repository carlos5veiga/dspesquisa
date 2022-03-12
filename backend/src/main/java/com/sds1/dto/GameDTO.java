package com.sds1.dto;

import java.io.Serializable;

import com.sds1.entities.Game;
import com.sds1.entities.enums.Platform;

public class GameDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private Platform platform;
	private GenreDTO genre;

	public GameDTO() {
	}

	public GameDTO(Long id, String title, Platform platform, GenreDTO genre) {
		this.id = id;
		this.title = title;
		this.platform = platform;
		this.genre = genre;
	}
	
	public GameDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		platform = entity.getPlatform();
		genre = new GenreDTO(entity.getGenre());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public GenreDTO getGenre() {
		return genre;
	}

	public void setGenre(GenreDTO genre) {
		this.genre = genre;
	}
}
