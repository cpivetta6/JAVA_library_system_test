package com.caiopivetta6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiopivetta6.domain.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
