package com.caiopivetta6.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_tb")
public class Book implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private Integer pages;
	private Double bookfines;
	
	
	@ManyToOne
	@JoinColumn(name = "genre_id")
	private Genre genre;
	
	
	@ManyToOne
	@JoinColumn(name = "pubCompany_id")
	private PubCompany pubCompany;
	
	
	@ManyToOne
	@JoinColumn(name = "collection_id")
	private Collection collection;
	
	@JsonIgnore
	@Lob
	@OneToMany(mappedBy = "book")
	private List<BookLoan> loan = new ArrayList<>();
	
	public Book () {
		
	}

	public Book(Integer id, String title, Integer pages, Double bookfines, Genre genre, PubCompany pubCompany, Collection collection) {
		super();
		this.id = id;
		this.title = title;
		this.pages = pages;
		this.bookfines = bookfines;
		this.genre = genre;
		this.pubCompany = pubCompany;
		this.collection = collection;
	}
	
	

	public List<BookLoan> getLoan() {
		return loan;
	}

	public void setLoan(List<BookLoan> loan) {
		this.loan = loan;
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

	
	
	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public PubCompany getPubCompany() {
		return pubCompany;
	}

	public void setPubCompany(PubCompany pubCompany) {
		this.pubCompany = pubCompany;
	}

	public Collection getCollection() {
		return collection;
	}

	public void setCollection(Collection collection) {
		this.collection = collection;
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
