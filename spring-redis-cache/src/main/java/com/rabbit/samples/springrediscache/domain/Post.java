package com.rabbit.samples.springrediscache.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


/**
 * @author Matteo Baiguini
 * matteo@solidarchitectures.com
 * 05 Feb 2019
 */
@Entity
@Table(name="posts")
public class Post implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@NotEmpty
	@Column(nullable = false)
	String title;

	@NotEmpty
	@Column(nullable = false)
	String description;

	@NotEmpty
	@Column(nullable = false)
	String author;

	String errMsg;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
}