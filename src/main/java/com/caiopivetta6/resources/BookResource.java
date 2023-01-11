package com.caiopivetta6.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caiopivetta6.domain.Book;
import com.caiopivetta6.services.BookService;

@RestController
@RequestMapping(value = "book")
public class BookResource {

	@Autowired
	private BookService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Book> findById (@PathVariable Integer id){
		
		Book obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
	
	
}
