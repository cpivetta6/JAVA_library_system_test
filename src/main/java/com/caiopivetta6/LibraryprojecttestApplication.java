package com.caiopivetta6;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.caiopivetta6.domain.User;
import com.caiopivetta6.repository.UserRepository;

@SpringBootApplication
public class LibraryprojecttestApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LibraryprojecttestApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run (String... args) throws Exception, ParseException {
		
		User user1 = new User(null, "Richard", "3215469874", "richard@gmail.com");
		
		userRepository.saveAll(Arrays.asList(user1));
		
		
		
	}
	
	
}
