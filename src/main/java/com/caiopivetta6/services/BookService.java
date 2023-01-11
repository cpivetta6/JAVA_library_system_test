package com.caiopivetta6.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiopivetta6.domain.Book;
import com.caiopivetta6.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;
	
	public Book find(Integer id) {
		Optional<Book> obj = repository.findById(id);
		
		return obj.orElseThrow(()-> new ObjectNotFoundException(null, id));
	}
	
}
