package com.caiopivetta6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiopivetta6.domain.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer> {

}
