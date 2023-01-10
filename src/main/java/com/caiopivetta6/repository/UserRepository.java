package com.caiopivetta6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiopivetta6.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
