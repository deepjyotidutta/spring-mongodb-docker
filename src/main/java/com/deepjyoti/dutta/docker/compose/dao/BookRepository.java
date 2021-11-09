package com.deepjyoti.dutta.docker.compose.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.deepjyoti.dutta.docker.compose.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
