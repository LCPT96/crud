package com.lcpt96.entities;

import com.lcpt96.annotations.AutoIncrement;
import com.lcpt96.annotations.Column;
import com.lcpt96.annotations.Entity;
import com.lcpt96.annotations.Id;
import com.lcpt96.annotations.JoinColumn;

@Entity(value = "book")
public class BookEntity {

	@Id
	@AutoIncrement
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "title", nullable = false)
	private String title;

	@Column(name = "description", nullable = false)
	private String description;

	@JoinColumn(name = "author-id", nullable = true)
	private AuthorEntity author;

	@Column(name = "active", nullable = false)
	private Boolean active;

	public BookEntity() {

	}

	public BookEntity(Integer id, String title, String description, AuthorEntity author, Boolean active) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.author = author;
		this.active = active;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AuthorEntity getAuthor() {
		return this.author;
	}

	public void setAuthor(AuthorEntity author) {
		this.author = author;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
