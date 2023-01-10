package com.caiopivetta6.domain;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String title;
	private Integer pages;
	private Double bookfines;
	
	public Book () {
		
	}

	public Book(Integer id, String title, Integer pages, Double bookfines) {
		super();
		this.id = id;
		this.title = title;
		this.pages = pages;
		this.bookfines = bookfines;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Double getBookfines() {
		return bookfines;
	}

	public void setBookfines(Double bookfines) {
		this.bookfines = bookfines;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
