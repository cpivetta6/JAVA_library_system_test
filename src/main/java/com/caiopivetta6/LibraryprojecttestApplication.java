package com.caiopivetta6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.caiopivetta6.domain.Book;
import com.caiopivetta6.domain.BookLoan;
import com.caiopivetta6.domain.Collection;
import com.caiopivetta6.domain.Genre;
import com.caiopivetta6.domain.PubCompany;
import com.caiopivetta6.domain.User;
import com.caiopivetta6.repository.BookLoanRepository;
import com.caiopivetta6.repository.BookRepository;
import com.caiopivetta6.repository.CollectionRepository;
import com.caiopivetta6.repository.GenreRepository;
import com.caiopivetta6.repository.PubCompanyRepository;
import com.caiopivetta6.repository.UserRepository;

@SpringBootApplication
public class LibraryprojecttestApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LibraryprojecttestApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private BookLoanRepository bookLoanRepository;
	
	@Autowired
	private CollectionRepository collecionRepository;
	
	@Autowired
	private GenreRepository genreRepository;
	
	@Autowired
	private PubCompanyRepository pubCompanyRepository;

	@Override
	public void run (String... args) throws Exception, ParseException {
		
		//BOOK,GENRE, PUBCOMPANY AND COLLECTION 
		
		Genre genre1 = new Genre(null, "Fantasy");
		Genre genre2 = new Genre(null, "Action");
			
		PubCompany pub1 = new PubCompany(null, "Salani");
		PubCompany pub2 = new PubCompany(null, "Bompiani");
	
		Collection collection1 = new Collection(null, "Lord of the Rings");
		Collection collection2 = new Collection(null, "Harry Potter");
				
		Book book1 = new Book(null, "Le due torri", 589, 4.00, genre1, pub2, collection1);
		Book book2 = new Book(null, "Il ritorno del re", 678, 4.00, genre1, pub2, collection1);
		Book book3 = new Book(null, "Harry Potter e la pietra filosofale", 589, 4.00, genre1, pub1, collection2);
		
		
		//PubCompany get Book
		pub1.getBooks().addAll(Arrays.asList(book3));
		pub2.getBooks().addAll(Arrays.asList(book1, book2));
		
		//Genre Get book
		genre1.getBooks().addAll(Arrays.asList(book1, book2, book3));
		
		//Collection get book
		collection1.getBooks().addAll(Arrays.asList(book1, book2));
		collection2.getBooks().addAll(Arrays.asList(book3));
		
		
		genreRepository.saveAll(Arrays.asList(genre1, genre2));
		pubCompanyRepository.saveAll(Arrays.asList(pub1, pub2));
		collecionRepository.saveAll(Arrays.asList(collection1, collection2));
		bookRepository.saveAll(Arrays.asList(book1, book2, book3));
		
		
		
		// USER AND LOAN
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		
		User user1 = new User(null, "Richard", "3215469874", "richard@gmail.com");
		User user2 = new User(null, "Clara", "34512341232", "clara@gmail.com");
		
		
		BookLoan bl1 = new BookLoan(null, sdf.parse("11/01/2023 10:30"), sdf.parse("16/01/2023 10:30"), user1, book1);
		BookLoan bl2 = new BookLoan(null, sdf.parse("11/01/2023 10:30"), sdf.parse("16/01/2023 10:30"), user1, book2);
		BookLoan bl3 = new BookLoan(null, sdf.parse("11/01/2023 10:30"), sdf.parse("17/01/2023 10:30"), user2, book3);
		
		//book get loan
		book1.getLoan().addAll(Arrays.asList(bl1));
		book2.getLoan().addAll(Arrays.asList(bl2));
		book3.getLoan().addAll(Arrays.asList(bl3));
		
		
		//user get loan
		user1.getLoan().addAll(Arrays.asList(bl1,bl2));
		user2.getLoan().addAll(Arrays.asList(bl3));
		
		
		
		userRepository.saveAll(Arrays.asList(user1, user2));
		bookLoanRepository.saveAll(Arrays.asList(bl1, bl2, bl3));
		
		
		
	}
	
	
}
