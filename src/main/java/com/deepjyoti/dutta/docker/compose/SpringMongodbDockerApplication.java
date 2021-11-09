package com.deepjyoti.dutta.docker.compose;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepjyoti.dutta.docker.compose.dao.BookRepository;
import com.deepjyoti.dutta.docker.compose.model.Book;

@SpringBootApplication
@RestController
@RequestMapping("/book")
public class SpringMongodbDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongodbDockerApplication.class, args);
	}
	@Autowired
	BookRepository bookrepo;
	
	@PostMapping
	public Book saveBook(@RequestBody Book book) {
		return bookrepo.save(book);
	}
	
	@GetMapping
	public List<Book> getBooks(){
		return  bookrepo.findAll();
	}
}
