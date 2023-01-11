package com.caiopivetta6.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.caiopivetta6.domain.BookLoan;

import com.caiopivetta6.repository.BookLoanRepository;

@Service
public class BookLoanService {

	@Autowired
	private BookLoanRepository repository;
	
	public BookLoan find(Integer id) {
		Optional<BookLoan> obj = repository.findById(id);
		
		return obj.orElseThrow(()-> new ObjectNotFoundException(null, id));
	}
	
}
