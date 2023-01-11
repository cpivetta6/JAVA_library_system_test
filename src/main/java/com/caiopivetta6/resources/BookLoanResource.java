package com.caiopivetta6.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caiopivetta6.domain.BookLoan;
import com.caiopivetta6.services.BookLoanService;

@RestController
@RequestMapping(value = "bookloan")
public class BookLoanResource {

	@Autowired
	private BookLoanService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<BookLoan> findById (@PathVariable Integer id){
		
		BookLoan obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
	
	
}
