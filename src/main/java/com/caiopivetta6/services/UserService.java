package com.caiopivetta6.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiopivetta6.domain.User;
import com.caiopivetta6.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User find(Integer id) {
		Optional<User> obj = repository.findById(id);
		
		return obj.orElseThrow(()-> new ObjectNotFoundException(null, id));
	}
	
}
