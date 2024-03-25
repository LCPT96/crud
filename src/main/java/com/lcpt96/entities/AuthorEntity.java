package com.lcpt96.entities;

import com.lcpt96.annotations.AutoIncrement;
import com.lcpt96.annotations.Column;
import com.lcpt96.annotations.Entity;
import com.lcpt96.annotations.Id;

@Entity(value = "author")
public class AuthorEntity {

	@Id
	@AutoIncrement
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "active", nullable = false)
	private Boolean active;

	public AuthorEntity() {

	}

	public AuthorEntity(Integer id, String name, Boolean active) {
		this.id = id;
		this.name = name;
		this.active = active;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
