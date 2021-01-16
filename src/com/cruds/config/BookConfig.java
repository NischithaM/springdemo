package com.cruds.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cruds.demo.Author;
import com.cruds.demo.Book;

@Configuration
public class BookConfig {

	@Bean
	public Author author()
	{
		return new Author("sada", "sada@gmail.com");
	}
	
	@Bean
	public Book book()
	{
		Book book=new Book(112, "50 shades of grey", 3000);
		book.setAuthor(author());
		return book;
	}
}
