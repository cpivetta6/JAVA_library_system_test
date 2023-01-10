package com.caiopivetta6.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caiopivetta6.domain.User;
import com.caiopivetta6.services.UserService;

@RestController
@RequestMapping(value = "user")
public class UserResource {

	@Autowired
	private UserService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById (@PathVariable Integer id){
		
		User obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
	
	
}
