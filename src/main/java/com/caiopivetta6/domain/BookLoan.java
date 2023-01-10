package com.caiopivetta6.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class BookLoan implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Date loanDate;
	private Date loanDevolution;
	
	public BookLoan() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	public Date getLoanDevolution() {
		return loanDevolution;
	}

	public void setLoanDevolution(Date loanDevolution) {
		this.loanDevolution = loanDevolution;
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
		BookLoan other = (BookLoan) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
}
