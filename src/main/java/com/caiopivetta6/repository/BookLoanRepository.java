package com.caiopivetta6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiopivetta6.domain.BookLoan;

public interface BookLoanRepository extends JpaRepository<BookLoan, Integer> {

}
