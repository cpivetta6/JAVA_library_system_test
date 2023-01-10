package com.caiopivetta6.domain;

import java.io.Serializable;
import java.util.Objects;

public class Genre implements Serializable{

	
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String description;
	
	public Genre() {
		
	}

	public Genre(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
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
		Genre other = (Genre) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
