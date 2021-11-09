package com.deepjyoti.dutta.docker.compose.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="books")
public class Book {
	@Id
	private int id;
	private String name;
	private String authorName;

}
